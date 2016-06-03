package com.bloodstrike.lobbyserver.packet.server;

import bean.UserInfo;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_LOGIN_ACK extends APC {

    public PROTOCOL_BASE_LOGIN_ACK(int code) {
        super("callBackLoginFail");
        addParameter(code);
    }
    
    public PROTOCOL_BASE_LOGIN_ACK(UserInfo userInfo) {
        super("callBackLoginSuccess");
        addParameter(userInfo);
    }
}
