package lobbyserver;

import java.util.Calendar;
import java.util.TimeZone;

import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

public class SyncServerTimeTest extends TestCase {

    public void test() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/response/callBackSyncServerTime.dump"));
        
        assertEquals(in.readInt(), 82);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "callBackSyncServerTime");
        
        long timestamp = Long.parseLong(String.format("%.0f", apc.getParameters()));
        
        TimeZone zone = TimeZone.getDefault();
        zone.setRawOffset(Integer.parseInt(apc.getParameters()[1].toString()));
        
        Calendar date = Calendar.getInstance(zone);
        date.setTimeInMillis(timestamp);
    }

}
