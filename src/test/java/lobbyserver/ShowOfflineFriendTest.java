package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class ShowOfflineFriendTest extends TestCase {
    APC apc;
    Amf3Input in;
    
    protected void setUp() throws Exception {
        this.in = new Amf3Input(SerializationContext.getSerializationContext());
        this.in.setInputStream(this.getClass().getResourceAsStream("/response/onShowOfflineFriend.dump"));
        
        assertEquals(this.in.readInt(), 591);
        this.apc = (APC) this.in.readObject();
        in.close();
        assertNotNull(this.apc);
        assertEquals(apc.getFunctionName(), "onShowOfflineFriend");
    }

    public void testFirst() throws Exception {
        CommonCharInfo cc = (CommonCharInfo) ((Object[]) apc.getParameters()[0])[0];
        assertFalse(cc.isOnline());
        assertEquals(cc.getTeamName(), "FPS[4]FasT");
        assertEquals(cc.getNotReadChatNum(), 0);
        assertEquals(cc.getCharacterName(), "w2eduardo");
        assertFalse(cc.inGameServer());
        assertEquals(cc.getLv(), 47);
        assertEquals(cc.getLogoutTime().getTimeInMillis(), 1463589398023L);
        assertEquals(cc.getDateline().getTimeInMillis(), 1459178175043L);
        assertEquals(cc.getCharacterId(), 409821);
        assertEquals(cc.getTeamId(), 17476);
        assertEquals(cc.getGlobalCharId(), 0);
        assertEquals(cc.getOnlineIndex(), 0);
        assertFalse(cc.isMySelf());
        assertEquals(cc.getSocialRelationshipType(), 0);
        assertFalse(cc.getCouldInvite());
        assertEquals(cc.getTeamJobFlag(), 0);
        assertEquals(cc.getType(), 0);
    }

    public void testSecond() throws Exception {
        CommonCharInfo cc = (CommonCharInfo) ((Object[]) apc.getParameters()[0])[1];
        assertFalse(cc.isOnline());
        assertEquals(cc.getTeamName(), "gtking");
        assertEquals(cc.getNotReadChatNum(), 0);
        assertEquals(cc.getCharacterName(), "jonas591");
        assertFalse(cc.inGameServer());
        assertEquals(cc.getLv(), 24);
        assertEquals(cc.getLogoutTime().getTimeInMillis(), 1462470077294L);
        assertEquals(cc.getDateline().getTimeInMillis(), 1459439449467L);
        assertEquals(cc.getCharacterId(), 560186);
        assertEquals(cc.getTeamId(), 2435);
        assertEquals(cc.getGlobalCharId(), 0);
        assertEquals(cc.getOnlineIndex(), 0);
        assertFalse(cc.isMySelf());
        assertEquals(cc.getSocialRelationshipType(), 0);
        assertFalse(cc.getCouldInvite());
        assertEquals(cc.getTeamJobFlag(), 0);
        assertEquals(cc.getType(), 0);
    }

}
