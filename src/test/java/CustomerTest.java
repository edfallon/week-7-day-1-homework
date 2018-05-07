import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer1;
    Customer customer2;
    RunawayMineTrain ride;

    @Before
    public void before(){
        customer1 = new Customer(170, 35, 50);
        customer2 = new Customer(115, 12, 20);

    }

    @Test
    public void canGetHeight(){
        assertEquals(170, customer1.getHeight());
    }

    @Test
    public void canGetAge() {
        assertEquals(12, customer2.getAge());
    }

    @Test
    public void canGetMoney() {
        assertEquals(50, customer1.getMoney());
    }

    @Test
    public void ridingTakesPriceFromCustomer(){
        ride = new RunawayMineTrain(5, 120);
        customer1.payForRide(ride.getPrice());
        assertEquals(45, customer1.getMoney());
    }

}
