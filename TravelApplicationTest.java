import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TravelApplicationTest {
    
	private TravelApplication travelApplication = TravelApplication.getInstance();

    // @BeforeClass
	// public static void oneTimeSetup() {
		
	// }
	
	// @AfterClass
	// public static void oneTimeTearDown() {
		
	// }
	
	@BeforeEach
	public void setup() {
		//runs before each test
	}
	
	@AfterEach
	public void tearDown() {
		//runs after each test
	}

	@Test
	public void setColumnTest(){
		// In Seat.java
		Seat seat = new Seat(-1, 0, false);
		String letter = seat.setColumn(-1);
		assertEquals(null, letter, "Should not set a letter.");
	}
    
	@Test
	public void checkCorrectUsernameTest() {
		travelApplication.signUp("username", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 21);

		boolean check = travelApplication.checkUsername("username");
		assertTrue(check);
	}
	@Test
	public void successLoginTest() {
		travelApplication.signUp("username", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 21);

		boolean check = travelApplication.login("username", "password");
		assertTrue(check);
	}
	@Test
	public void unsuccessLoginTest() {
		travelApplication.signUp("username", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 21);

		boolean check = travelApplication.login("Nice", "Work");
		assertFalse(check);
	}
	@Test
	public void saveUsersTest() {
		travelApplication.signUp("Mr.Mime", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 21);
		travelApplication.quit();

		boolean check = travelApplication.login("Mr.Mime", "password");
		assertTrue(check);
	}
	@Test
	public void createUserWithNegativeAgeTest() {
		travelApplication.signUp("Ghost", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", -1);
	
		boolean check = travelApplication.login("Ghost", "password");
		assertFalse(check);
	}
	@Test
	public void createUserUnder18Test() {
		travelApplication.signUp("Child", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 12);
	
		boolean check = travelApplication.login("Child", "password");
		assertFalse(check);
	}
	@Test
	public void successfullyLogoutTest() {
		travelApplication.signUp("username", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 12);

		String ID = travelApplication.getCurrentUser().getUserID();
		Location address = new Location("street", "city", "state", "zipcode", "country");
		User user = new User("username", "firstName", "lastName", ID, "803 192 1211", "email",
		 12, "passportNum", "password", address, null, null, false);

		travelApplication.login("username", "password");
		travelApplication.logout();
		User currentUser = travelApplication.getCurrentUser();
		assertEquals(currentUser, user);
	}

	// public void successFindFlightTest() {
	// 	Flight flight = new Flight(planeName, airline, arrivalAirport, arrivalAddress, destinationAirport, 
	// 	destinationAddress, planeCapacity, departureDate, duration, flightType, userID, flightID, seating) 
	// 	boolean check = travelApplication.SearchFlights("Columbia");
	// 	assertTrue(check);
	// }
}
