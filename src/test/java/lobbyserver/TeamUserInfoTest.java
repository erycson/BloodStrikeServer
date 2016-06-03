package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class TeamUserInfoTest extends TestCase {

    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/getTeamUserInfo.dump"));

        assertEquals(in.readInt(), 228);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);
        
        assertEquals(apc.getFunctionName(), "onGetTeamUserInfo");
        
        ClientTeamUserBean u = (ClientTeamUserBean) apc.getParameters()[0];
        assertEquals(u.getId(), 1956511);
        assertEquals(u.getTeamId(), 21392);
        assertEquals(u.getCharId(), 1653573);
        assertEquals(u.getPlayerName(), "ExtremsX");
        assertEquals(u.getLv(), 32);
        assertEquals(u.getTeamExp(), 0);
        assertEquals(u.getTeamLv(), 1);
        assertEquals(u.getJobFlag(), 1);
        assertEquals(u.getDateline().getTimeInMillis(), 1464534552130L);
        assertEquals(u.getStatus(), 1);
        assertEquals(u.getLogoutTime().getTimeInMillis(), 1464534562680L);
        assertFalse(u.isOnline());
        assertFalse(u.isSelected());
        assertFalse(u.isMySelf());
        assertFalse(u.getCouldInvite());
        assertEquals(u.getNewMsgNum(), 0);
    }

}
