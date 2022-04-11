import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SeatTest {
    
    private Seat seat;

	@Test
	public void setColumnTest(){
		// In Seat.java
		seat = new Seat(-1, 0, false);
		String letter = seat.setColumn(-1);
		assertEquals(null, letter, "Should not set a letter.");
	}

}
