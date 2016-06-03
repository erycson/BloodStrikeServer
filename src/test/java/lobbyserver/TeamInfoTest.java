package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class TeamInfoTest extends TestCase {
    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/onGetTeamInfo.dump"));

        assertEquals(in.readInt(), 675);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);
        
        assertEquals(apc.getFunctionName(), "onGetTeamInfo");
        
        ClientTeamBean o = (ClientTeamBean) apc.getParameters()[0];
        assertEquals(o.getTeamId(), 16039);
        assertEquals(o.getName(), "{[OsPro]}");
        assertEquals(o.getCreateCharId(), 3676148);
        assertEquals(o.getLeaderCharId(), 4015753);
        assertEquals(o.getLeaderName(), "Rena*Ally");
        assertEquals(o.getMembersNumber(), 427);
        assertEquals(o.getMembersNumberLimit(), 500);
        assertEquals(o.getTeamExp(), 478483);
        assertEquals(o.getTeamLv(), 3);
        assertEquals(o.getDeclaration(), "subindo na velocidade do tempo procurando pessoas [{ON}] -------->>>>Rc : 12595691 <<<<-----  Nivel [{25}] pra cima ok");
        assertEquals(o.getNotice(), "Clã [{OsPros}]");
        assertEquals(o.getDateline().getTimeInMillis(), 1453233384327L);
        assertEquals(o.getHomepage(), "https://www.facebook.com/Blood-strick-cla-OsPro-451214078401391/?skip_nax_wizard=true#");
        assertEquals(o.getQQ(), "RC: 1546124 skype :GGG1 grupo no wats ad la 27997558075");
        assertEquals(o.getYY(), "Canal do yotube : https://www.youtube.com/channel/UCrxhJokgJzsdAaPVn0hlulg");
        assertEquals(o.getRank(), 83);
        assertNull(o.isApply());
        assertEquals(o.getBattleEndNum(), 213);
        assertEquals(o.getWinNum(), 41);
        assertEquals(o.getFailNum(), 167);
    }

}
