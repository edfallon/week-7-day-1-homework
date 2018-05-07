import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscoInfernoTest {

    DiscoInferno discoInferno;

    @Before
    public void before(){
        discoInferno = new DiscoInferno(5, 140);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5, discoInferno.getPrice());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(140, discoInferno.getMinHeight());
    }
}
