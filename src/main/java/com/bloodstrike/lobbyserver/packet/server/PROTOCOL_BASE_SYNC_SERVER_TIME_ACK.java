package com.bloodstrike.lobbyserver.packet.server;

import java.util.Calendar;

import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_SYNC_SERVER_TIME_ACK extends APC {
    private static int timeZoneRawOffset = Calendar.getInstance().getTimeZone().getRawOffset();
    
    public PROTOCOL_BASE_SYNC_SERVER_TIME_ACK() {
        super("callBackSyncServerTime");
        
        Calendar date = Calendar.getInstance();

        addParameter(date.getTimeInMillis());
        addParameter(timeZoneRawOffset);
    }
}
