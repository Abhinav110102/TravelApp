import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HotelTest {
    
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
	public void isAvailableTest(){
        Date unavailableDate = new Date(1, 1, 1);
        Date date = new Date(1,1,1);
        ArrayList<Date> unavailableDates = new ArrayList<Date>();
        unavailableDates.add(unavailableDate);
        Room room = new Room(1, 0, unavailableDates);
        boolean isAvailable = room.isAvailable(date);
		assertTrue(isAvailable);
	}


  
}
