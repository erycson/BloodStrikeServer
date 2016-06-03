package com.bloodstrike.lobbyserver.packet.client;

import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_CREATE_CHARACTER_ACK;

public class PROTOCOL_BASE_CREATE_CHARACTER_REQ extends Packet {

    public PROTOCOL_BASE_CREATE_CHARACTER_REQ(GameNetwork session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        session.send(new PROTOCOL_BASE_CREATE_CHARACTER_ACK());
    }

}
