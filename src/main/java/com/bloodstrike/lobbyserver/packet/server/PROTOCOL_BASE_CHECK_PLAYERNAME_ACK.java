package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_CHECK_PLAYERNAME_ACK extends APC {

    public PROTOCOL_BASE_CHECK_PLAYERNAME_ACK(int code) {
        super("callBackCreateCharacter");
        addParameter(code);
    }
}
