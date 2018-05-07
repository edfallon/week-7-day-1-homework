import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BrainEraserTest {

    BrainEraser brainEraser;

    @Before
    public void before(){
        brainEraser = new BrainEraser(5, 120);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5, brainEraser.getPrice());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(120, brainEraser.getMinHeight());
    }
}
