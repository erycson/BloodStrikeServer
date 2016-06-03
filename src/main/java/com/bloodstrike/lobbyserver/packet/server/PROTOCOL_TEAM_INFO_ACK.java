package com.bloodstrike.lobbyserver.packet.server;

import bean.ClientTeamBean;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_TEAM_INFO_ACK extends APC {

    public PROTOCOL_TEAM_INFO_ACK() {
        super("onGetTeamInfo");
        addParameter(ClientTeamBean.getDemo());
    }
}
