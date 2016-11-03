package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;
import bean.CommonCharInfo;
import com.bloodstrike.lobbyserver.ConnetionHandler;

@SuppressWarnings("serial")
public class PROTOCOL_FRIEND_ONLINE_LIST_ACK extends APC {
    
    public PROTOCOL_FRIEND_ONLINE_LIST_ACK(ConnetionHandler session) {
        super("onShowFriend");
        addParameter(CommonCharInfo.getDemoOnline());
    }
}
