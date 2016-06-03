package com.bloodstrike.lobbyserver.packet.server;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_CREATE_CHARACTER_ACK extends APC {

    public PROTOCOL_BASE_CREATE_CHARACTER_ACK() {
        super("callBackCreateCharacter");
        addParameter(null);
    }
}
