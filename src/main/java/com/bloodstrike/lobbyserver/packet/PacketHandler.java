package com.bloodstrike.lobbyserver.packet;

import java.util.HashMap;
import java.util.concurrent.Executors;

import org.apache.log4j.Logger;

import com.bloodstrike.lobbyserver.GameNetwork;
import com.bloodstrike.lobbyserver.packet.client.*;

import common.net.APC;

public class PacketHandler {
    final static Logger Log = Logger.getLogger(GameNetwork.class);
    
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
    
    public static void handle(GameNetwork session, APC request) {
        Log.debug("Pacote recebido: " + request.getFunctionName());
        
        if (!packets.containsKey(request.getFunctionName())) {
            Log.warn("Pacote não implementado: " + request.getFunctionName());
            return;
        }

        try {
            Class<?> ref = packets.get(request.getFunctionName());
            Packet pkt = (Packet) ref.getDeclaredConstructor(new Class[] {GameNetwork.class, Object[].class}).newInstance(session, request.getParameters());
            pkt.run();
        } catch (Exception e) {
            Log.error("Error ao processar o pacote: " + request.getFunctionName(), e);
        }
    }
}
