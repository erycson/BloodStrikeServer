package com.bloodstrike.lobbyserver.packet.client;

import com.bloodstrike.lobbyserver.ConnetionHandler;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_SYNC_SERVER_TIME_ACK;

public class PROTOCOL_BASE_SYNC_SERVER_TIME_REQ extends Packet {
    public PROTOCOL_BASE_SYNC_SERVER_TIME_REQ(ConnetionHandler session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        session.send(new PROTOCOL_BASE_SYNC_SERVER_TIME_ACK());
    }
}
