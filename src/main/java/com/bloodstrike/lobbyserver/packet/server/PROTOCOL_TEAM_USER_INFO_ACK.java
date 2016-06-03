package com.bloodstrike.lobbyserver.packet.server;

import java.util.Calendar;
import java.util.TimeZone;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_TEAM_USER_INFO_ACK extends APC {

    public PROTOCOL_TEAM_USER_INFO_ACK() {
        super("onGetTeamUserInfo");
        addParameter(Calendar.getInstance().getTimeInMillis());
        addParameter(TimeZone.getDefault().getRawOffset());
    }
}
