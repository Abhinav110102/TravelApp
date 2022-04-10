import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FlightTest {
    
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
	public void printSeatingChartTest() {
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
        Flight flight = new Flight("a", "a", "a", address, "a",
            address, 40, "a", "a", "a", "a", "a", seating);
        
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
