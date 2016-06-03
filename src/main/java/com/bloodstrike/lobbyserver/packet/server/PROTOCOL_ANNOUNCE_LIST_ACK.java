package com.bloodstrike.lobbyserver.packet.server;

import com.bloodstrike.lobbyserver.GameNetwork;

import bean.AnnounceInfo;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_ANNOUNCE_LIST_ACK extends APC {

    public PROTOCOL_ANNOUNCE_LIST_ACK(GameNetwork session) {
        super("callBackGetAnnounceList");
        addParameter(AnnounceInfo.getDemo());
    }
}
