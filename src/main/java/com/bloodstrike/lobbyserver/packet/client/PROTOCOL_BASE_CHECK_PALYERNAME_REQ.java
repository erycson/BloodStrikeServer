package com.bloodstrike.lobbyserver.packet.client;

import java.util.regex.Pattern;

import com.bloodstrike.dao.DAOUserInfo;
import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_CHECK_PLAYERNAME_ACK;

public class PROTOCOL_BASE_CHECK_PALYERNAME_REQ extends Packet {
    private static DAOUserInfo daoUserInfo = new DAOUserInfo();
    
    
    public PROTOCOL_BASE_CHECK_PALYERNAME_REQ(GameNetwork session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        if (params == null || params.length != 2) {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(0));
            return;
        }
        
        String playername = (String) params[1];
        if (playername.isEmpty()) {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-1));
        } else if (playername.length() >= 12) {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-2));
        } else if (Pattern.matches("[^\\p{Print}]+", playername)) { // a-zA-Z0-9
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-3));
        } else if (daoUserInfo.findByUsername(playername) != null) {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-4));
        } else {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(1));
        }
    }

}
