import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HotelTest {

	private Hotel hotel;
	
	@BeforeEach
	public void setup() {
		ArrayList<String> address = new ArrayList<String>();
		address.add("a");
		address.add("a");
		address.add("a");
		address.add("a");
		address.add("a");
		hotel = new Hotel("a", "a", "a", address,
		1, 1, 1, 1, "a", "a", false, 5.0);
	}

	@Test
	public void getHotelAddressTest(){
		setup();	
		assertTrue(hotel.location.getCity().equals("a") &&
		hotel.location.getCountry().equals("a") &&
		hotel.location.getState().equals("a") &&
		hotel.location.getStreet().equals("a") &&
		hotel.location.getZipcode().equals("a"));
	}


  
}
