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
	public void getHotelAddressTest(){
		ArrayList<String> address = new ArrayList<String>();
		address.add("a");
		address.add("a");
		address.add("a");
		address.add("a");
		address.add("a");
		Hotel hotel = new Hotel("a", "a", "a", address,
		1, 1, 1, 1, "a", "a", false, 5.0);
		
		assertTrue(hotel.location.getCity().equals("a") &&
		hotel.location.getCountry().equals("a") &&
		hotel.location.getState().equals("a") &&
		hotel.location.getStreet().equals("a") &&
		hotel.location.getZipcode().equals("a"));
	}


  
}
