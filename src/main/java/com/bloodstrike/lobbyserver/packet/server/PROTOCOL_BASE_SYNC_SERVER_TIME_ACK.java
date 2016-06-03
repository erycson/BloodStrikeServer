package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_SYNC_SERVER_TIME_ACK extends APC {

    public PROTOCOL_BASE_SYNC_SERVER_TIME_ACK() {
        super("onShowBlack");
        addParameter(new Object[] {});
    }
}
