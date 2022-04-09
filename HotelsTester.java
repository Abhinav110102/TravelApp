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

		ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");

		ArrayList<String> Address2_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");

		hotelList.add(new Hotel("fhdjfgh7596407", "Hilton Hotel", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
		hotelList.add(new Hotel("jfhg56023djehj", "Holiday Inn", "Holiday", Address2_1, 238, 3,
								150, 2, "4-22-2022", "4-24-2022", false, 3.5));
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
