package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import flex.messaging.io.amf.AmfTrace;
import junit.framework.TestCase;

public class LoginSuccessTest extends TestCase {

    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/callBackLoginSuccess2.dump"));
        AmfTrace trace = new AmfTrace();
        in.setDebugTrace(trace);

        in.readInt();
        //assertEquals(in.readInt(), 4495);
        
        try {
            APC apc = (APC) in.readObject();
            in.close();
            assertNotNull(apc);

            assertEquals(apc.getFunctionName(), "callBackLoginSuccess");
    
            UserInfo u = (UserInfo) apc.getParameters()[0];
            assertEquals(u.getUserId(), 6701384);
            assertEquals(u.getLoginId(), 14);
            assertEquals(u.getUsername(), "U10018957263");
            assertEquals(u.getChangename(), "");
            assertEquals(u.getPlayerName(), "");
            assertEquals(u.getCharacterId(), 0);
            assertEquals(u.isAdult(), 1);
            assertEquals(u.getAccountTag(), 0);
            assertEquals(u.getRoomChannleId(),0 );
            assertEquals(u.getRoomId(), -1);
            assertEquals(u.getTimer(), 0);
            assertEquals(u.getTeam(), 0);
            assertEquals(u.getObserverFlag(), null);
            assertFalse(u.inGameServer());
            assertEquals(u.getReadyGame(), 0);
            assertEquals(u.getRegTime(), 1464785781218L);
            assertEquals(u.getLoginTime(), 1464785781220L);
            assertEquals(u.getClient(), 6701384);
            assertEquals(u.getToken(), "14-0e1fca8835dfc4d8fb59634993fa53df-0");
            assertEquals(u.getLv(), 1);
            assertEquals(u.getExp(), 0);
            assertEquals(u.getGold(), 0);
            assertEquals(u.getGp(), 30000);
            assertEquals(u.getGift(), 0);
            assertEquals(u.getBoomCnt(), 1);
            assertEquals(u.getSelectedBagIndex(), 0);
            assertEquals(u.getAvatarT(), 1);
            assertEquals(u.getAvatarCT(), 2);
            assertEquals(u.getAvatarSH(), 0);
            assertEquals(u.getDefaultAvatar(), 1);
            assertFalse(u.getMatched());
            assertEquals(u.getOnlineTime(), 0);
            assertFalse(u.getHistoryReport());
            assertEquals(u.getLastPayTime(), 0);
            assertEquals(u.getTmpPayCount(), 0);
            assertEquals(u.getFirstPayPackFlag(), 0);
            assertEquals(u.getUserStayStep(), 0);
            assertEquals(u.getActivityIds(), "");
            assertEquals(u.getTeamId(), 0);
            assertFalse(u.isSignInedToday());
            assertEquals(u.getWhiteCrystalNumCurrentDay(), 0);
            assertEquals(u.getClientSignInBean(), null);
            assertEquals(u.getIsp(), "");
            assertEquals(u.getRemoteIp(), "172.31.12.30");
            assertEquals(u.getMissionIds(), "");
            System.out.println(u);
            
            //BagBean[] bag = u.getBagBeanVec();
            //System.out.println(bag.length);
        } catch (Exception e) {
            System.out.println(trace);
            e.printStackTrace();
        }
    }

}
