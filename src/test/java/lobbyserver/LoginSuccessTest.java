package lobbyserver;

import java.util.Map;

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
        
        assertEquals(in.readInt(), 728);
        
        try {
            APC apc = (APC) in.readObject();
            in.close();
            assertNotNull(apc);

            assertEquals(apc.getFunctionName(), "callBackLoginSuccess");
    
            UserInfo u = (UserInfo) apc.getParameters()[0];
            System.out.println(u);
        } catch (Exception e) {
            System.out.println(trace);
            e.printStackTrace();
        }
    }

}
