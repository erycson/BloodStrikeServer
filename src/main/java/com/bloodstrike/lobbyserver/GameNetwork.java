package com.bloodstrike.lobbyserver;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.bloodstrike.lobbyserver.manager.NetworkManager;
import com.bloodstrike.lobbyserver.packet.PacketHandler;
import com.bloodstrike.util.Converter;

import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import flex.messaging.io.amf.Amf3Output;

public class GameNetwork implements Runnable {
    final static Logger Log = Logger.getLogger(GameNetwork.class);
    final static ExecutorService executor = Executors.newCachedThreadPool();
    
    private Socket socket;
    
    public GameNetwork(Socket socket) {
        this.socket = socket;
        new Thread(this).start();
    }

    @Override
    @SuppressWarnings("resource")
    public void run() {
        Thread.currentThread().setName("Client" + socket.getRemoteSocketAddress());
        
        while(!socket.isClosed()) {
            try {
                Amf3Input input = new Amf3Input(SerializationContext.getSerializationContext());
                input.setInputStream(new BufferedInputStream(this.socket.getInputStream()));
                
                int length = input.readInt();
                if (length != 0 && length == input.available()) {
                    APC apc = (APC) input.readObject();
                    
                    executor.execute(() -> {
                        Thread.currentThread().setName("Client" + socket.getRemoteSocketAddress());
                        PacketHandler.handle(this, apc);
                    });
                } else {
                    Log.debug("Enviando arquivo de políticas");
                    socket.getOutputStream().write("<?xml version='1.0'?><cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"*\" /></cross-domain-policy>\0".getBytes());
                    break;
                }
            }
            catch (SocketException e) {
                //Log.error("Erro no socket", e);
                break;
            }
            catch (EOFException e) { }
            catch (IOException e) {
                Log.error("Erro ao escrever/ler no socket", e);
                break;
            }
            catch (ClassNotFoundException e) {
                Log.error("Erro ao converter os dados recebido", e);
                break;
            }
            //catch (Exception e) {
             //   Log.error("Erro ao manusear o socket", e);
                //close();
            //}
        }
        
        close();
    }

    @SuppressWarnings("resource")
    public synchronized void send(APC apc) {
        try {
            byte[] buffer = Converter.toByteArray(apc.clone());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            Amf3Output output = new Amf3Output(SerializationContext.getSerializationContext());
            output.setOutputStream(baos);
            output.writeInt(buffer.length);
            output.write(buffer);
            output.flush();
            output.close();
            
            Amf3Output output2 = new Amf3Output(SerializationContext.getSerializationContext());
            output2.setOutputStream(new BufferedOutputStream(socket.getOutputStream()));
            output2.write(baos.toByteArray());
            output2.flush();
            //output.close();
        } catch (Exception e) {
            Log.error("Erro ao escrever no socket", e);
        }
    }
    
    public synchronized void send(byte[] buffer) {
        try {
            socket.getOutputStream().write(buffer);
            //BufferedOutputStream out = new BufferedOutputStream(socket.getOutputStream());
            //out.write(buffer);
            //out.flush();
        } catch (Exception e) {
            Log.error("Erro ao escrever no socket", e);
        }
    }
    
    public String getRemoteAddress() {
        return socket.getRemoteSocketAddress().toString();
    }
    
    public synchronized void close() {
        System.out.println(String.format("O client %s foi desconectado", socket.getRemoteSocketAddress()));
        try {
            NetworkManager.getInstance().removeClient(this);
            socket.close();
        } catch (Exception e) {
            Log.error("Erro ao fechar o scoket", e);
        }
    }
}
