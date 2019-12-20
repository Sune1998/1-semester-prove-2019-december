import junit.framework.TestCase;

public class MainTest extends TestCase {


    public void testHelloAndras() {

        Main m = new Main();

        assertEquals("Hello András!", m.helloAndras("András"));

    }


    public void testHelloEmptyString() {

        Main m = new Main();

        assertEquals("Hello World!", m.hello(""));
    }
}