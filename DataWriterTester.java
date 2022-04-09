import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataWriterTester {
	private AllUsers users = AllUsers.getInstance();
    private AllFlights flights = AllFlights.getInstance();
    private AllLuggages luggages = AllLuggages.getInstance();
    private AllHotels hotels = AllHotels.getInstance();
	private ArrayList<User> userList = users.getUsers();
    private ArrayList<Flight> flightList = flights.getFlights();
    private ArrayList<Luggage> luggageList = luggages.getLuggages();
    private ArrayList<Hotel> hotelList = hotels.getHotels();
	
	@BeforeEach
	public void setup() {
		AllUsers.getInstance().getUsers().clear();
        AllFlights.getInstance().getFlights().clear();
        AllLuggages.getInstance().getLuggages().clear();
        AllHotels.getInstance().getHotels().clear();
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		AllUsers.getInstance().getUsers().clear();
        AllFlights.getInstance().getFlights().clear();
        AllLuggages.getInstance().getLuggages().clear();
        AllHotels.getInstance().getHotels().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testWritingZeroUsers() {
		userList = DataLoader.loadUsers();
		assertEquals(0, userList.size());
	}

	@Test
	void testWritingOneUser() {
		userList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
		DataWriter.saveUsers();
		assertEquals("asmith", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testWritingFiveUsers() {
		userList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("bsmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("csmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("dsmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("esmith", "Amy", "Smith", 19, "803-454-3344"));
		DataWriter.saveUsers();
		assertEquals("esmith", DataLoader.loadUsers().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyUser() {
		userList.add(new User("", "", "", 0, ""));
		DataWriter.saveUsers();
		assertEquals("", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testWritingNullUser() {
		userList.add(new User(null, "", "", 0, ""));
		DataWriter.saveUsers();
		assertEquals(null, DataLoader.loadUsers().get(0).getUserName());
	}
	
}