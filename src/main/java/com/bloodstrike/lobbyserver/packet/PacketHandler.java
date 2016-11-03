package com.bloodstrike.lobbyserver.packet;

import java.util.HashMap;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import common.net.APC;

import com.bloodstrike.lobbyserver.ConnetionHandler;
import com.bloodstrike.lobbyserver.packet.client.*;

public class PacketHandler {
    private static final Logger logger = LogManager.getLogger(PacketHandler.class);
    
    private static PacketHandler instance = PacketHandler.getInstance();
    private static HashMap<String, Class<? extends Packet>> packets;
    
    private PacketHandler() {
        packets = new HashMap<String, Class<? extends Packet>>();
        packets.put("syncServerTime", PROTOCOL_BASE_SYNC_SERVER_TIME_REQ.class);
        packets.put("login", PROTOCOL_BASE_LOGIN_REQ.class);
        packets.put("getTeamInfo", PROTOCOL_TEAM_INFO_REQ.class);
        packets.put("getTeamUserInfo", PROTOCOL_TEAM_USER_INFO_REQ.class);
        packets.put("showFriend", PROTOCOL_FRIEND_LIST_REQ.class);
        packets.put("showWeaponUnlock", PROTOCOL_BASE_SHOW_WEAPON_UNLOCK_REQ.class);
        packets.put("getAnnounceList", PROTOCOL_ANNOUNCE_LIST_REQ.class);
        packets.put("getMailList", PROTOCOL_MAIL_LIST_REQ.class);
        packets.put("showBlack", PROTOCOL_BASE_SHOW_BLACK_REQ.class);
        packets.put("checkPlayerName", PROTOCOL_BASE_CHECK_PALYERNAME_REQ.class);
        packets.put("createCharacter", PROTOCOL_BASE_CREATE_CHARACTER_REQ.class);

       // case "getRoomChannel": this.getRoomChannel(); break;
       // case "getTestServerBean": this.getTestServerBean(); break;
       // onShowBlack callBackGetTestServerBean callBackAddMessage callChannelList
    }
    
    private static PacketHandler getInstance() {
        if (instance == null)
            instance = new PacketHandler();
        return instance;
    }
    
    public static void handle(ConnetionHandler conn, APC request) {
        logger.debug("Pacote recebido: " + request.getFunctionName());
        
        if (!packets.containsKey(request.getFunctionName())) {
            logger.warn("Pacote não implementado: " + request.getFunctionName());
            return;
        }

        try {
            Class<?> ref = packets.get(request.getFunctionName());
            Packet pkt = (Packet) ref.getDeclaredConstructor(new Class[] {ConnetionHandler.class, Object[].class}).newInstance(conn, request.getParameters());
            pkt.run();
        } catch (Exception e) {
            logger.error("Error ao processar o pacote: " + request.getFunctionName(), e);
        }
    }
}
