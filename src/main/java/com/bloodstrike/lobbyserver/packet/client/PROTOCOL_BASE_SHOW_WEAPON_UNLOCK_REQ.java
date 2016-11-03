package com.bloodstrike.lobbyserver.packet.client;

import com.bloodstrike.lobbyserver.ConnetionHandler;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_SHOW_WEAPON_UNCLOCK_ACK;

public class PROTOCOL_BASE_SHOW_WEAPON_UNLOCK_REQ extends Packet {

    public PROTOCOL_BASE_SHOW_WEAPON_UNLOCK_REQ(ConnetionHandler session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        session.send(new PROTOCOL_BASE_SHOW_WEAPON_UNCLOCK_ACK());
    }

}
