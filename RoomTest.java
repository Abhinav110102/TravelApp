import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UserTest {
    
    @BeforeClass
	public static void oneTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	
	@BeforeEach
	public static void setup() {
		//runs before each test
	}
	
	@AfterEach
	public static void tearDown() {
		//runs after each test
	}

	@Test
	public void calCostTest(){
		// In User.java
        Location location = new Location("a", "a", "a", "a", "a");
        User user = new User("a", "a", "a", "a", "a", "a", "a", location, -1, false);
        double cost = user.calCost();
		assertEquals(0, 0, "a person with negative age should not exist or be charged.");
	}

    @Test
	public void requestRefundTest(){
		// In User.java
        Location location = new Location("a", "a", "a", "a", "a");
        User user = new User("a", "a", "a", "a", "a", "a", "a", location, 20, false);
        Rating rating = new Rating("a", 1, false);
        ArrayList<Rating> ratings = new ArrayList<Rating>();
        ratings.add(rating);
        UserTicket userTicket = new UserTicket("a", "a", ratings);
		user.addTicket(userTicket);
        user.requestRefund(userTicket);
		assertSame(user.tickets.getSize(), 0, "If a user has one ticket and removes a ticket, the user should have zero tickets.");
	}
  
}
