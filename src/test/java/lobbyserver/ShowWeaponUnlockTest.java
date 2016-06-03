package lobbyserver;

import bean.*;
import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class ShowWeaponUnlockTest extends TestCase {
    APC apc;
    Amf3Input in;
    
    protected void setUp() throws Exception {
        this.in = new Amf3Input(SerializationContext.getSerializationContext());
        this.in.setInputStream(this.getClass().getResourceAsStream("/response/callBackShowWeaponUnlock.dump"));
        
        assertEquals(this.in.readInt(), 249);
        this.apc = (APC) this.in.readObject();
        in.close();
        assertNotNull(this.apc);
        assertEquals(apc.getFunctionName(), "callBackShowWeaponUnlock");
    }
    
    public void testPrimaryWeapon() throws Exception {
        WeaponUnlockBean w = (WeaponUnlockBean) ((Object[]) this.apc.getParameters()[0])[0];
        assertEquals(w.getId(), 40);
        assertEquals(w.getStatus(), 3);
        assertEquals(w.getItemId(), 0);
        assertEquals(w.getKind(), 0);
        assertEquals(w.getPosition(), 0);
    }
    
    public void testSecondaryWeapon() throws Exception {
        WeaponUnlockBean w = (WeaponUnlockBean) ((Object[]) this.apc.getParameters()[0])[1];
        assertEquals(w.getId(), 12);
        assertEquals(w.getStatus(), 2);
        assertEquals(w.getItemId(), 0);
        assertEquals(w.getKind(), 0);
        assertEquals(w.getPosition(), 0);
    }
    
    public void testMeleeWeapon() throws Exception {
        WeaponUnlockBean w = (WeaponUnlockBean) ((Object[]) this.apc.getParameters()[0])[2];
        assertEquals(w.getId(), 6);
        assertEquals(w.getStatus(), 2);
        assertEquals(w.getItemId(), 0);
        assertEquals(w.getKind(), 0);
        assertEquals(w.getPosition(), 0);
    }
    
    public void testBoomWeapon() throws Exception {
        WeaponUnlockBean w = (WeaponUnlockBean) ((Object[]) this.apc.getParameters()[0])[3];
        assertEquals(w.getId(), 13);
        assertEquals(w.getStatus(), 2);
        assertEquals(w.getItemId(), 0);
        assertEquals(w.getKind(), 0);
        assertEquals(w.getPosition(), 0);
    }

}
