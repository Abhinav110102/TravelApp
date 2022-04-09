import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightsTester {
    private AllFlights flights = AllFlights.getInstance();
    private ArrayList<Flight> flightList = flights.getFlights();
	
	@BeforeEach
	public void setup() {
		flightList.clear();
		ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");
		ArrayList<String> Address1_2 = new ArrayList<String> ();
		Address1_1.add("Los Angeles International Airport");
		Address1_1.add("Los Angeles");
		Address1_1.add("California");
		Address1_1.add("45776");
		Address1_1.add("United States");
		ArrayList<Integer> SeatDim1 = new ArrayList<Integer> ();
		SeatDim1.add(4);
		SeatDim1.add(10);

		ArrayList<String> Address2_1 = new ArrayList<String> ();
		Address1_1.add("New Jersey International Airport");
		Address1_1.add("New Jersey");
		Address1_1.add("New Jersey");
		Address1_1.add("66666");
		Address1_1.add("United States");
		ArrayList<String> Address2_2 = new ArrayList<String> ();
		Address1_1.add("Miami International Airport");
		Address1_1.add("Miami");
		Address1_1.add("Florida");
		Address1_1.add("55555");
		Address1_1.add("United States");
		ArrayList<Integer> SeatDim2 = new ArrayList<Integer> ();
		SeatDim2.add(4);
		SeatDim2.add(10);

		flightList.add(new Flight("df567496024", "Delta", "New York International Airport", Address1_1,
									"Los Angeles International Airport", Address1_2, 250, "4-9-2022",
									"12:00 Hours", "OneWay", "dsjfh756948t", "jshf45743t890", SeatDim1));
		flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
									"Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
									"OneWay", "nb2008vv1984", "tc1998cs2001", SeatDim2));
		DataWriter.saveFlights();
	}
	
	@AfterEach
	public void tearDown() {
		flights.getInstance().getFlights().clear();
		DataWriter.saveFlights();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		boolean hasFlight = flights.haveFlight("asmith");
		assertTrue(hasFlight);
	}
	
	@Test
	void testHaveFlightValidLastItem() {
		boolean hasFlight = flights.haveFlight("bwhite");
		assertTrue(hasFlight);
	}
	
	@Test
	void testHaveUserInValid() {
		boolean hasFlight = flights.haveFlight("jsmith");
		assertFalse(hasFlight);
	}
	
	@Test
	void testHaveUserEmpty() {
		boolean hasEmpty = flights.haveFlight("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveUserNull() {
		boolean hasNull = flights.haveFlight(null);
		assertFalse(hasNull);
	}
}
