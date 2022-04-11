import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
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
		travelApplication = TravelApplication.getInstance();
	}
	
	@AfterEach
	public void tearDown() {
		travelApplication = TravelApplication.getInstance();
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
		ArrayList<String> friends = new ArrayList<String>();
		ArrayList<ArrayList<String>> family = new ArrayList<ArrayList<String>>();
		// User user = new User("username", "firstName", "lastName", ID, "803 192 1211", "email",
		//  12, "passportNum", "password", address, friends, family, false);

		travelApplication.login("username", "password");
		travelApplication.logout();
		User currentUser = travelApplication.getCurrentUser();
		assertEquals(null, currentUser);
	}


	//"PlaneName": "M876578",
	// "Airline": "Delta",
	// "ArrivalAirport": "Columbia Metropolitan Airport",
	// "ArrivalAddress" : ["1001 Park st", "Columbia", "SC", "20222", "United States"],
	// "DestinationAirport": "Los Angeles International Airport",
	// "DestinationAddress": ["1 World Way", "Los Angeles", "California", "90045", "United States"],
	// "PlaneCapacity": 100, 
	// "DepatureDate": "March 1, 2022",
	// "Duration": "3:45 hours",
	// "FlightType": "OneWay",
	// "UserID": "8bhbug34b7839",
	// "FlightID": "2i45b4b52ibj",
	// "Seats": [4, 10],

	
	// "TakenSeats": []

	@Test
	public void successFindFlightTest() {
		Location arrivalAddress = new Location("1001 Park st", "Columbia", "SC", "20222", "United States");
		Location destinationAddress = new Location("1 World Way", "Los Angeles", "California", "90045", "United States");
		ArrayList<Seat> seating = new ArrayList<Seat>();
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 10; k++) {
				seating.add(new Seat(j, k, false));
			}
		}
		Flight flight = new Flight("M876578", "Delta", "Columbia Metropolitan Airport", 
		 arrivalAddress, "Los Angeles International Airport", 
	 	destinationAddress, 100, "March 1, 2022", "3:45 hours", "OneWay", "8bhbug34b7839", "2i45b4b52ibj", seating);
	 	ArrayList<Flight> flightList = new ArrayList<Flight>();
		flightList.add(flight);

		ArrayList<Flight> check = travelApplication.SearchFlights("1001 Park st");
	 	assertEquals(flightList, check);
	}

	@Test
	public void unsuccessFindFlightTest() {
		ArrayList<Flight> flightList = new ArrayList<Flight>();

		ArrayList<Flight> check = travelApplication.SearchFlights("Kachow");
	 	assertEquals(check, flightList);
	}

	@Test
	public void successFindHotelTest() {
		Location arrivalAddress = new Location("1001 Park st", "Columbia", "SC", "20222", "United States");
		Location destinationAddress = new Location("1 World Way", "Los Angeles", "California", "90045", "United States");
		ArrayList<Seat> seating = new ArrayList<Seat>();
		for (int j = 0; j < 4; j++) {
			for (int k = 0; k < 10; k++) {
				seating.add(new Seat(j, k, false));
			}
		}
		Flight flight = new Flight("M876578", "Delta", "Columbia Metropolitan Airport", 
		 arrivalAddress, "Los Angeles International Airport", 
	 	destinationAddress, 100, "March 1, 2022", "3:45 hours", "OneWay", "8bhbug34b7839", "2i45b4b52ibj", seating);
	 	ArrayList<Flight> flightList = new ArrayList<Flight>();
		flightList.add(flight);

		ArrayList<Flight> check = travelApplication.SearchFlights("1001 Park st");
	 	assertSame(flightList, check);
	}

	@Test
	public void saveUsersTest() {
		travelApplication.signUp("Mr.Mime", "password", "firstName", "lastName", "803 192 1211", 
		"email", "passportNum", "street", "city", "state", "zipcode", "country", 21);
		travelApplication.quit();

		boolean check = travelApplication.login("Mr.Mime", "password");
		assertTrue(check);
	}
}
