package com.bloodstrike.lobbyserver.packet.client;

import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_TEAM_INFO_ACK;

public class PROTOCOL_TEAM_INFO_REQ extends Packet {

    public PROTOCOL_TEAM_INFO_REQ(GameNetwork session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        session.send(new PROTOCOL_TEAM_INFO_ACK());
    }

}
