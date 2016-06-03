package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class ShowFriendTest extends TestCase {
    APC apc;
    Amf3Input in;
    
    protected void setUp() throws Exception {
        this.in = new Amf3Input(SerializationContext.getSerializationContext());
        this.in.setInputStream(this.getClass().getResourceAsStream("/response/onShowFriend.dump"));
        
        assertEquals(this.in.readInt(), 292);
        this.apc = (APC) this.in.readObject();
        in.close();
        assertNotNull(this.apc);
        assertEquals(apc.getFunctionName(), "onShowFriend");
    }

    public void testFirst() throws Exception {
        CommonCharInfo cc = (CommonCharInfo) ((Object[]) apc.getParameters()[0])[0];
        assertTrue(cc.isOnline());
        assertEquals(cc.getTeamName(), "");
        assertEquals(cc.getNotReadChatNum(), 0);
        assertEquals(cc.getCharacterName(), "believe_cazy");
        assertFalse(cc.inGameServer());
        assertEquals(cc.getLv(), 30);
        assertEquals(cc.getLogoutTime().getTimeInMillis(), 0);
        assertEquals(cc.getDateline().getTimeInMillis(), 1459270230266L);
        assertEquals(cc.getCharacterId(), 2702539);
        assertEquals(cc.getTeamId(), 0);
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
        assertTrue(cc.isOnline());
        assertEquals(cc.getTeamName(), "|HarD.TeaM|");
        assertEquals(cc.getNotReadChatNum(), 0);
        assertEquals(cc.getCharacterName(), "°wesley°");
        assertTrue(cc.inGameServer());
        assertEquals(cc.getLv(), 81);
        assertEquals(cc.getLogoutTime().getTimeInMillis(), 0);
        assertEquals(cc.getDateline().getTimeInMillis(), 1459047634507L);
        assertEquals(cc.getCharacterId(), 4089893);
        assertEquals(cc.getTeamId(), 13686);
        assertEquals(cc.getGlobalCharId(), 0);
        assertEquals(cc.getOnlineIndex(), 0);
        assertFalse(cc.isMySelf());
        assertEquals(cc.getSocialRelationshipType(), 0);
        assertFalse(cc.getCouldInvite());
        assertEquals(cc.getTeamJobFlag(), 0);
        assertEquals(cc.getType(), 0);
    }

}
