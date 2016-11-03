package com.bloodstrike.lobbyserver.manager;

import io.vertx.core.net.NetSocket;
import java.util.concurrent.ConcurrentHashMap;

import com.bloodstrike.lobbyserver.ConnetionHandler;

public class NetworkManager {
    private static NetworkManager instance = new NetworkManager();
    private ConcurrentHashMap<Integer, ConnetionHandler> clients;
    
    private NetworkManager() {
        clients = new ConcurrentHashMap<Integer, ConnetionHandler>();
    }
    
    public static NetworkManager getInstance() {
        if (instance == null)
            instance = new NetworkManager();
        
        return instance;
    }
    
    public void addClient(NetSocket socket) {
        ConnetionHandler c = new ConnetionHandler(socket);
        if (!clients.containsKey(c.getId()))
            clients.put(c.getId(), c);
    }
    
    public void removeClient(ConnetionHandler c) {
        if (clients.containsKey(c))
            clients.remove(c);
    }
}
