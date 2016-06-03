package lobbyserver;

import org.junit.Test;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class MailListTest extends TestCase {

    @Test
    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/callbackGetMailList.dump"));

        assertEquals(in.readInt(), 347);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "callbackGetMailList");

        MailBean m = (MailBean) ((Object[]) apc.getParameters()[0])[0];
        assertEquals(m.getId(), 109675920);
        assertEquals(m.getCharId(), 1653573);
        assertEquals(m.getFromCharId(), 0);
        assertEquals(m.getFromer(), "");
        assertEquals(m.getType(), 1);
        assertEquals(m.getTitle(), "Comunicado do Clã, content=Parabéns! Você é novo integrante do clã {[OsPro]}, você já pode entrar na página do clã");
        assertEquals(m.getReadFlag(), 1);
        assertEquals(m.getDateline().getTimeInMillis(), 1463848288269L);
        assertEquals(m.getMailPackId(), 0);
        assertEquals(m.getReceivePackFlag(), 0);
        assertFalse(m.isSelected());
        assertEquals(m.getLabel(), "");
        assertEquals(m.getIcon(), "");
        assertEquals(m.isDirty(), null);

    }

}
