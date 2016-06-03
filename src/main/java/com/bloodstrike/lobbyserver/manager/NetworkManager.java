package com.bloodstrike.lobbyserver.manager;

import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import com.bloodstrike.lobbyserver.GameNetwork;

public class NetworkManager {
    private static NetworkManager instance = new NetworkManager();
    private List<GameNetwork> clients;
    
    private NetworkManager() {
        clients = new ArrayList<GameNetwork>();
    }
    
    public static NetworkManager getInstance() {
        return instance;
    }
    
    public void addClient(Socket socket) {
        GameNetwork c = new GameNetwork(socket);
        if (clients.contains(c))
            return;
        clients.add(c);
    }
    
    public void removeClient(GameNetwork c) {
        if (!clients.contains(c))
            return;
        clients.remove(c);
    }
}
