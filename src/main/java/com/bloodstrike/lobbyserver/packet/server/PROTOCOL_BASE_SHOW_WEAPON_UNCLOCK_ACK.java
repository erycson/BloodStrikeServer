package com.bloodstrike.lobbyserver.packet.server;

import bean.WeaponUnlockBean;
import common.net.APC;

@SuppressWarnings("serial")
public class PROTOCOL_BASE_SHOW_WEAPON_UNCLOCK_ACK extends APC {

    public PROTOCOL_BASE_SHOW_WEAPON_UNCLOCK_ACK() {
        super("callBackShowWeaponUnlock");
        addParameter(WeaponUnlockBean.getDemo());
    }
}
