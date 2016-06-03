package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_SHOW_BLACK_ACK extends APC {

    public PROTOCOL_BASE_SHOW_BLACK_ACK() {
        super("onShowBlack");
        addParameter(new Object[] {});
    }
}
