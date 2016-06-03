package com.bloodstrike.lobbyserver.packet.client;

import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.*;

public class PROTOCOL_FRIEND_LIST_REQ extends Packet {

    public PROTOCOL_FRIEND_LIST_REQ(GameNetwork session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        session.send(new PROTOCOL_FRIEND_ONLINE_LIST_ACK(session));
        session.send(new PROTOCOL_FRIEND_OFFLINE_LIST_ACK(session));
    }

}
