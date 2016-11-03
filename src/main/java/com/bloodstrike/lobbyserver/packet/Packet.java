package com.bloodstrike.lobbyserver.packet;

import com.bloodstrike.lobbyserver.ConnetionHandler;

public abstract class Packet implements Runnable {
    protected ConnetionHandler session;
    protected Object[] params;
    
    public Packet(ConnetionHandler session, Object[] params) {
        this.session = session;
        this.params = params;
    }
    
    
    public void run() {
        Thread.currentThread().setName("Client" + session.getRemoteAddress());
    }
}
