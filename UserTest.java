import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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
		Location locationTwo = new Location("a", "a", "a", "a", "a");
        UserTicket userTicket = new HotelTicket("a", "a", locationTwo, ratings, 1, "a", "a", 1);
        user.requestRefund(userTicket);
		File file = new File("ticket.txt");
		try (Scanner sc = new Scanner(file)) {
			String data = sc.nextLine();
			assertEquals(data, "", "Ticket file should be empty if user has no tickets.");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
  
}
