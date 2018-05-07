import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunawayMineTrainTest {

    RunawayMineTrain runawayMineTrain;
    Customer customer1;
    Customer customer2;

    @Before
    public void before(){
        runawayMineTrain = new RunawayMineTrain(5, 140);
        customer1 = new Customer(170, 35, 50);
        customer2 = new Customer(70, 35, 50);
    }

    @Test
    public void canGetPrice(){
        assertEquals(5, runawayMineTrain.getPrice());
    }

    @Test
    public void canGetMinHeight(){
        assertEquals(140, runawayMineTrain.getMinHeight());
    }

    @Test
    public void canRideIfTallEnough(){
        assertEquals(true, runawayMineTrain.canRide(customer1));
    }

    @Test
    public void canNotRideIfTooShort(){
        assertEquals(false, runawayMineTrain.canRide(customer2));
    }


}
