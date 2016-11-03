package com.bloodstrike.lobbyserver;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.IOException;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import flex.messaging.io.amf.Amf3Output;
import io.vertx.core.Handler;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.net.NetSocket;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import com.bloodstrike.lobbyserver.manager.NetworkManager;
import com.bloodstrike.lobbyserver.packet.PacketHandler;
import com.bloodstrike.util.Converter;
import common.net.APC;

public class ConnetionHandler implements Handler<Buffer> {
    private static final Logger logger = LogManager.getLogger(Config.class);
    final static ExecutorService executor = Executors.newCachedThreadPool();

    private int id;
    private NetSocket socket;

    public ConnetionHandler(NetSocket socket) {
        this.socket = socket;
        this.socket.handler(this);
    }

    public int getId() {
        return id;
    }

    public void handle(Buffer buffer) {
        Amf3Input input = new Amf3Input(SerializationContext.getSerializationContext());
        try {
            input.setInputStream(new BufferedInputStream(new ByteArrayInputStream(buffer.getBytes())));

            int length = input.readInt();
            if (length != 0 && length == input.available()) {
                APC apc = (APC) input.readObject();

                PacketHandler.handle(this, apc);
            } else {
                logger.debug("Enviando arquivo de políticas");
                socket.write("<?xml version='1.0'?><cross-domain-policy><allow-access-from domain=\"*\" to-ports=\"*\" /></cross-domain-policy>\0");
            }
            input.close();
        } catch (SocketException e) {
            // Log.error("Erro no socket", e);
        } catch (EOFException e) {
        } catch (IOException e) {
            logger.error("Erro ao escrever/ler no socket", e);
        } catch (ClassNotFoundException e) {
            logger.error("Erro ao converter os dados recebido", e);
        }
        // catch (Exception e) {
        // Log.error("Erro ao manusear o socket", e);
        // close();
        // }
    }
    
    public void send(APC apc) {
        try {
            byte[] buffer = Converter.toByteArray(apc.clone());
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            Amf3Output output = new Amf3Output(SerializationContext.getSerializationContext());
            output.setOutputStream(baos);
            output.writeInt(buffer.length);
            output.write(buffer);
            output.flush();
            output.close();

            // Amf3Output output2 = new
            // Amf3Output(SerializationContext.getSerializationContext());
            // output2.setOutputStream(new
            // BufferedOutputStream(socket.getOutputStream()));
            // output2.write(baos.toByteArray());
            // output2.flush();

            socket.write(Buffer.buffer(baos.toByteArray()));
            // output.close();
        } catch (Exception e) {
            logger.error("Erro ao escrever no socket", e);
        }
    }

    public void send(byte[] data) {
        try {
            socket.write(Buffer.buffer(data));
            // BufferedOutputStream out = new
            // BufferedOutputStream(socket.getOutputStream());
            // out.write(buffer);
            // out.flush();
        } catch (Exception e) {
            logger.error("Erro ao escrever no socket", e);
        }
    }

    public void close() {
        logger.debug(String.format("O client %s foi desconectado", getRemoteAddress()));
        try {
            NetworkManager.getInstance().removeClient(this);
            socket.close();
        } catch (Exception e) {
            logger.error("Erro ao fechar o scoket", e);
        }
    }

    public String getRemoteAddress() {
        return socket.remoteAddress().toString();
    }
}
