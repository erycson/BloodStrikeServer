package lobbyserver;

import org.junit.Test;

import common.net.APC;
import flex.messaging.io.SerializationContext;
import flex.messaging.io.amf.Amf3Input;
import junit.framework.TestCase;

/**
 *  1               Cadastro OK
 *  0   WORD_916    Pane no sistema
 * -1   WORD_917    Escreva algo, vc não é fantasma
 * -2   WORD_918    Nome muito comprido
 * -3   WORD_919    O nome de personagem contém palavras inadequadas
 * -4   WORD_509    Nome já existe, por favor escolhe outro.
 */
public class CheckPlayerNameTest extends TestCase {

    @Test
    public void testRequest() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/request/checkPlayerName.dump"));

        assertEquals(in.readInt(), 73);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "checkPlayerName");
        assertEquals(apc.getParameters()[0], 0);
        assertEquals(apc.getParameters()[1], "ExtremsX");
    }
    @Test
    public void testInUseResponse() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/request/callBackCheckPlayerName1.dump"));

        assertEquals(in.readInt(), 74);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "callBackCheckPlayerName");
        assertEquals(apc.getParameters()[0], -4);
        System.out.println(apc.getParameters()[0]);
    }

    @Test
    public void testOkResponse() throws Exception {
        Amf3Input in = new Amf3Input(SerializationContext.getSerializationContext());
        in.setInputStream(this.getClass().getResourceAsStream("/request/callBackCheckPlayerName2.dump"));

        assertEquals(in.readInt(), 71);
        
        APC apc = (APC) in.readObject();
        in.close();
        assertNotNull(apc);

        assertEquals(apc.getFunctionName(), "callBackCheckPlayerName");
        assertEquals(apc.getParameters()[0], 1);
    }
}
