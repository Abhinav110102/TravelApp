/**
 * Tested by Mark Valentino
 */

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
    private Location location;
	private UserTicket userTicket;
	private Rating rating;
	private User user;
	
	@BeforeEach
	public void setup() {
		ArrayList<Rating> ratings = new ArrayList<Rating>();
		rating = new Rating("a", 1, false);
        ratings.add(rating);
		location = new Location("a", "a", "a", "a", "a");
		userTicket = new HotelTicket("a", "a", location, ratings, 1, "a", "a", 1);
		user = new User("a", "a", "a", "a", "a", "a", "a", location, -1, false);
	}

	@Test
	public void calCostTest(){
		setup();
        double cost = user.calCost();
		assertEquals(0, cost, "a person with negative age should not exist or be charged.");
	}

    @Test
	public void requestRefundTest(){
		setup();
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
