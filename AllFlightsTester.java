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
		ArrayList<Seat> seating1 = new ArrayList<Seat> ();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; i < 10; i++) {
                seating1.add(new Seat(i, j, false));
            }
        }

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
		ArrayList<Seat> seating2 = new ArrayList<Seat> ();
        for (int i = 0; i < 4; i++) {
            for (int j = 0; i < 10; i++) {
                seating2.add(new Seat(i, j, false));
            }
        }

		flightList.add(new Flight("df567496024", "Delta", "New York International Airport", Address1_1,
									"Los Angeles International Airport", Address1_2, 250, "4-9-2022",
									"12:00 Hours", "OneWay", "dsjfh756948t", "jshf45743t890", seating1));
		flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
									"Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
									"OneWay", "nb2008vv1984", "tc1998cs2001", seating2));
		DataWriter.saveFlights();
	}
	
	@AfterEach
	public void tearDown() {
		flights.getInstance().getFlights().clear();
		DataWriter.saveFlights();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		boolean has_jshf45743t890 = flights.haveFlight("jshf45743t890");
		assertTrue(has_jshf45743t890);
	}
	
	@Test
	void testHaveFlightValidLastItem() {
		boolean has_tc1998cs2001 = flights.haveFlight("tc1998cs2001");
		assertTrue(has_tc1998cs2001);
	}
	
	@Test
	void testHaveUserInValid() {
		boolean hasPlaneWithSnakes = flights.haveFlight("Plane With Snakes");
		assertFalse(hasPlaneWithSnakes);
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
