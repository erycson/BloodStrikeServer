package com.bloodstrike.lobbyserver.packet.server;

import com.bloodstrike.lobbyserver.GameNetwork;

import bean.CommonCharInfo;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_FRIEND_ONLINE_LIST_ACK extends APC {
    
    public PROTOCOL_FRIEND_ONLINE_LIST_ACK(GameNetwork session) {
        super("onShowFriend");
        addParameter(CommonCharInfo.getDemoOnline());
    }
}
