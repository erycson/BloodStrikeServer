package com.bloodstrike.lobbyserver;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

import org.apache.log4j.Logger;

import com.bloodstrike.lobbyserver.manager.NetworkManager;

public class NetworkServer implements Runnable {
    final static Logger Log = Logger.getLogger(NetworkServer.class);
    
    private static NetworkServer instance;
    private ServerSocket server;
    
    private NetworkServer() {
        new Thread(this).start();
    }
    
    public static NetworkServer getInstance() {
        if (instance == null)
            instance = new NetworkServer();
        return instance;
    }

    public void run() {
        Thread.currentThread().setName("NetworkServer");
        
        try {
            server = new ServerSocket();
            server.bind(new InetSocketAddress(Config.HOST, Config.PORT));
            
            Log.info("Servidor iniciado em " + server.getLocalSocketAddress());
        } catch (IOException e) {
            Log.error("Porta já em uso");
            return;
        } catch (Exception e) {
            Log.error(e);
            return;
        }
        
        while(true) {
            try {
                Socket socket = server.accept();
                Log.debug("Nova conexão recebida a partir de " + socket.getRemoteSocketAddress());
                NetworkManager.getInstance().addClient(socket);
            } catch (Exception e) {
                Log.error("Erro ao aceitar uma nova conexão", e);
            }
        }
    }
}
