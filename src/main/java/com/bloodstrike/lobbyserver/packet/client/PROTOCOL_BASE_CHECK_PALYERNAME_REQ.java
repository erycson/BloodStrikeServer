package com.bloodstrike.lobbyserver.packet.client;

import java.util.regex.Pattern;

import org.apache.log4j.Logger;

import com.bloodstrike.dao.DAOUser;
import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.Packet;
import com.bloodstrike.lobbyserver.packet.server.PROTOCOL_BASE_CHECK_PLAYERNAME_ACK;

public class PROTOCOL_BASE_CHECK_PALYERNAME_REQ extends Packet {
    final static Logger Log = Logger.getLogger(GameNetwork.class);
    private static DAOUser daoUser = new DAOUser();
    
    public PROTOCOL_BASE_CHECK_PALYERNAME_REQ(GameNetwork session, Object[] params) {
        super(session, params);
    }

    @Override
    public void run() {
        super.run();
        
        if (params == null || params.length != 2) {
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(0));
            return;
        }

        String playername = (String) params[1];
        if (playername.isEmpty()) {
            Log.debug("Nome do jogador vazio");
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-1));
        } else if (playername.length() > 12) {
            Log.debug(String.format("Nome do jogador \"%s\" deve ter no máximo 12 caracteres", playername));
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-2));
        } else if (Pattern.matches("[^\\p{Print}]+", playername)) { // a-zA-Z0-9
            Log.debug(String.format("Nome do jogador \"%s\" tem caracteres inválidos", playername));
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-3));
        } else if (daoUser.findByUsername(playername) != null) {
            Log.debug(String.format("Nome do jogador \"%s\" já está em uso", playername));
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(-4));
        } else {
            Log.info(String.format("Jogador \"%s\" criado com sucesso", playername));
            session.send(new PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(1));
        }
    }

}
