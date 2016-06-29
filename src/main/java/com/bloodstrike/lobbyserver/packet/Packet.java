package com.bloodstrike.lobbyserver.packet;

import com.bloodstrike.lobbyserver.GameNetwork;


public abstract class Packet implements Runnable {
    protected GameNetwork session;
    protected Object[] params;
    
    public Packet(GameNetwork session, Object[] params) {
        this.session = session;
        this.params = params;
    }
    
    
    public void run() {
        Thread.currentThread().setName("Client" + session.getRemoteAddress());
    }
}
