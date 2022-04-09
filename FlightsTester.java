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
		flightList.add(new Flight());
		flightList.add(new Flight());
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
