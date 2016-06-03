package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class AnnounceListTest extends TestCase {

    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/callBackGetAnnounceList.dump"));
        
        assertEquals(in.readInt(), 392);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "callBackGetAnnounceList");

        AnnounceInfo a = (AnnounceInfo) ((Object[]) apc.getParameters()[0])[0];
        assertEquals(a.getId(), 11);
        assertEquals(a.getTType(), 1);
        assertEquals(a.getContent(), "<a href='http://goo.gl/forms/mX0GMJAeoa' target='_blank'>Evento promovendo talentos, concorra a uma rugido balrog e ganhe código brinde (só os duzentos primeiros*)! Clique aqui e participe!</a>");
        assertEquals(a.getFlag(), 1);
        assertEquals(a.getStartTime().getTimeInMillis(), 1464268334000L);
        assertEquals(a.getEndTime().getTimeInMillis(), 1464311602000L);
        assertNull(a.getFlagGM());
        assertNull(a.getDateline());
        assertEquals(a.getRoomChannelId(), 0);
        assertEquals(a.getAnnounceType(), 0);
        assertEquals(a.getIntervalTime(), 0);
    }

}
