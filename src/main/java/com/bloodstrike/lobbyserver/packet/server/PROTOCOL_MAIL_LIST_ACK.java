package com.bloodstrike.lobbyserver.packet.server;

import bean.MailBean;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_MAIL_LIST_ACK extends APC {

    public PROTOCOL_MAIL_LIST_ACK() {
        super("callbackGetMailList");
        addParameter(MailBean.getDemo());
    }
}
