package com.bloodstrike.lobbyserver.packet.server;

import com.bloodstrike.lobbyserver.ConnetionHandler;

import bean.AnnounceInfo;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_ANNOUNCE_LIST_ACK extends APC {

    public PROTOCOL_ANNOUNCE_LIST_ACK(ConnetionHandler session) {
        super("callBackGetAnnounceList");
        addParameter(AnnounceInfo.getDemo());
    }
}
