import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HotelsTester {
    private AllHotels hotels = AllHotels.getInstance();
    private ArrayList<Hotel> hotelList = hotels.getHotels();
	
	@BeforeEach
	public void setup() {
		hotelList.clear();
		hotelList.add(new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber, daysBooked,
								capacity, numberOfBeds, arrivalDate, departureDate, pool, rating));
		hotelList.add(new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber, daysBooked,
								capacity, numberOfBeds, arrivalDate, departureDate, pool, rating));
		DataWriter.saveHotels();
	}
	
	@AfterEach
	public void tearDown() {
		hotels.getInstance().getHotels().clear();
		DataWriter.saveHotels();
	}
	
	
	@Test
	void testHaveHotelValidFirstItem() {
		boolean hasAmy = hotels.haveHotel("asmith");
		assertTrue(hasAmy);
	}
	
	@Test
	void testHaveHotelValidLastItem() {
		boolean hasBob = hotels.haveHotel("bwhite");
		assertTrue(hasBob);
	}
	
	@Test
	void testHaveHotelInValid() {
		boolean hasJoe = hotels.haveHotel("jsmith");
		assertFalse(hasJoe);
	}
	
	@Test
	void testHaveHotelEmpty() {
		boolean hasEmpty = hotels.haveHotel("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveHotelNull() {
		boolean hasNull = hotels.haveHotel(null);
		assertFalse(hasNull);
	}
}
