/**
 * Tested by Mark Valentino
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightTest {
    private Flight flight;
	
	@BeforeEach
	public void setup() {
        ArrayList<String> address = new ArrayList<String>();
        address.add("a");
        address.add("a");
        address.add("a");
        address.add("a");
        address.add("a");
        ArrayList<Seat> seating = new ArrayList<Seat>();
        for (int j = 0; j < 4; j++) {
            for (int k = 0; k < 10; k++) {
                seating.add(new Seat(j, k, false));
            }
        }
        flight = new Flight("a", "a", "a", address, "a",
            address, 40, "a", "a", "a", "a", "a", seating);
	}
	

	@Test
	public void printSeatingChartTest() {
        setup();
        String testResult = flight.printSeatingChart();
        // Counts how many rows there should be.
        int newLineCount = 0;
        for (int i = 0; i < testResult.length(); i++) {
            if (testResult.charAt(i) == '\n') {
                newLineCount++;
            }
        }
        assertSame(newLineCount, 11, "There should be 10 rows of seats in printed"
        + "seating chart plus column letters.");
    }
}
