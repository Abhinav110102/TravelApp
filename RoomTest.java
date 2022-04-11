//Tested by Mia Dia
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RoomTest {
    private Room room;

	/*
    @BeforeClass
	public static void oneTimeSetup() {
		
	}
	
	@AfterClass
	public static void oneTimeTearDown() {
		
	}
	*/
	
	@BeforeEach
	public void setup() {
        ArrayList<Date> unavailableDates = new ArrayList<Date>();
		Date unavailableDate = new Date(4, 20, 2022);
        unavailableDates.add(unavailableDate);
        room = new Room(401, 2, unavailableDates);
	}
	
	@AfterEach
	public void tearDown() {
		
	}

	@Test
	public void isAvailableTest(){
		Date date = new Date(4, 21, 2022);
        boolean isAvailable = room.isAvailable(date);
		assertTrue(isAvailable);
	}

	@Test
	public void isUnavailableTest(){
		Date date = new Date(4, 20, 2022);
        boolean isAvailable = room.isAvailable(date);
		assertFalse(isAvailable);
	}

}
