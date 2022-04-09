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
		ArrayList<String> friends1 = new ArrayList<String>();
        friends1.add("hgrfy59658");
		friends1.add("fjkgh6850j");
        ArrayList<ArrayList<String>> family1 = new ArrayList<ArrayList<String>> ();
		family1.get(0).add("Alisa");
		family1.get(0).add("Smith");
		family1.get(0).add("24");
		userList.add(new User("asmith", "Amy", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		DataWriter.saveUsers();
		assertEquals("asmith", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testWritingFiveUsers() {
        ArrayList<String> friends1 = new ArrayList<String>();
        friends1.add("hgrfy59658");
		friends1.add("fjkgh6850j");
        ArrayList<ArrayList<String>> family1 = new ArrayList<ArrayList<String>> ();
		family1.get(0).add("Alisa");
		family1.get(0).add("Smith");
		family1.get(0).add("24");
		userList.add(new User("asmith", "Amy", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		userList.add(new User("bsmith", "Bertram", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		userList.add(new User("csmith", "Carl", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		userList.add(new User("dsmith", "Dale", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		userList.add(new User("esmith", "Ernest", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
        19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
        friends1, family1, false));
		DataWriter.saveUsers();
		assertEquals("esmith", DataLoader.loadUsers().get(4).getUserName());
	}
	
	@Test
	void testWritingEmptyUser() {
        ArrayList<String> friendsnull = new ArrayList<String>();
        friendsnull.add("");
		friendsnull.add("");
        ArrayList<ArrayList<String>> familynull = new ArrayList<ArrayList<String>> ();
		familynull.get(0).add("");
		familynull.get(0).add("");
		familynull.get(0).add("");
		userList.add(new User("", "", "", "", "", "", 0, "", "", new Location("", "", "", "", ""),
        friendsnull, familynull, false));
		DataWriter.saveUsers();
		assertEquals("", DataLoader.loadUsers().get(0).getUserName());
	}
	
	@Test
	void testWritingNullUser() {
		ArrayList<String> friendsnull = new ArrayList<String>();
        friendsnull.add("");
		friendsnull.add("");
        ArrayList<ArrayList<String>> familynull = new ArrayList<ArrayList<String>> ();
		familynull.get(0).add("");
		familynull.get(0).add("");
		familynull.get(0).add("");
		userList.add(new User(null, "", "", "", "", "", 0, "", "", new Location("", "", "", "", ""),
        friendsnull, familynull, false));
		DataWriter.saveUsers();
		assertEquals(null, DataLoader.loadUsers().get(0).getUserName());
	}
	
    @Test
	void testWritingZeroFlights() {
		flightList = DataLoader.loadFlights();
		assertEquals(0, flightList.size());
	}

	@Test
	void testWritingOneFlight() {
		ArrayList<String> Address1_1 = new ArrayList<String> ();
        Address1_1.add("New York International Airport");
        Address1_1.add("New York");
        Address1_1.add("New York");
        Address1_1.add("33333");
        Address1_1.add("United States");
        ArrayList<String> Address1_2 = new ArrayList<String> ();
        Address1_1.add("Los Angeles International Airport");
        Address1_1.add("Los Angeles");
        Address1_1.add("California");
        Address1_1.add("45776");
        Address1_1.add("United States");
        ArrayList<Integer> SeatDim1 = new ArrayList<Integer> ();
		SeatDim1.add(4);
		SeatDim1.add(10);
        flightList.add(new Flight("df567496024", "Delta", "New York International Airport", Address1_1,
                                    "Los Angeles International Airport", Address1_2, 250, "4-9-2022",
                                    "12:00 Hours", "OneWay", "dsjfh756948t", "jshf45743t890", SeatDim1));
		DataWriter.saveFlights();
		assertEquals("jshf45743t890", DataLoader.loadFlights().get(0).getFlightID());
	}
	
	@Test
	void testWritingFiveFlights() {
        ArrayList<String> Address1_1 = new ArrayList<String> ();
        Address1_1.add("New York International Airport");
        Address1_1.add("New York");
        Address1_1.add("New York");
        Address1_1.add("33333");
        Address1_1.add("United States");
        ArrayList<String> Address1_2 = new ArrayList<String> ();
        Address1_1.add("Los Angeles International Airport");
        Address1_1.add("Los Angeles");
        Address1_1.add("California");
        Address1_1.add("45776");
        Address1_1.add("United States");
        ArrayList<Integer> SeatDim1 = new ArrayList<Integer> ();
		SeatDim1.add(4);
		SeatDim1.add(10);
		ArrayList<String> Address2_1 = new ArrayList<String> ();
		Address1_1.add("New Jersey International Airport");
		Address1_1.add("New Jersey");
		Address1_1.add("New Jersey");
		Address1_1.add("66666");
		Address1_1.add("United States");
		ArrayList<String> Address2_2 = new ArrayList<String> ();
		Address1_1.add("Miami International Airport");
		Address1_1.add("Miami");
		Address1_1.add("Florida");
		Address1_1.add("55555");
		Address1_1.add("United States");
		ArrayList<Integer> SeatDim2 = new ArrayList<Integer> ();
		SeatDim2.add(4);
		SeatDim2.add(10);
        flightList.add(new Flight("df567496024", "Delta", "New York International Airport", Address1_1,
                                    "Los Angeles International Airport", Address1_2, 250, "4-9-2022",
                                    "12:00 Hours", "OneWay", "dsjfh756948t", "jshf45743t890", SeatDim1));
        flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
                                    "Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
                                    "OneWay", "nb2008vv1984", "tc1998cs2001", SeatDim2));
        flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
                                    "Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
                                    "OneWay", "nb2008vv1984", "hjghjrt7576", SeatDim2));
        flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
                                    "Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
                                    "OneWay", "nb2008vv1984", "gdfhjgh586679", SeatDim2));
        flightList.add(new Flight("djfkdg59655", "United Airlines", "New Jersey International Airport", Address2_1,
                                    "Miami International Airport", Address2_2, 250, "3-4-1986", "9:00 Hours",
                                    "OneWay", "nb2008vv1984", "hryt45i6548", SeatDim2));
		DataWriter.saveFlights();
		assertEquals("hryt45i6548", DataLoader.loadFlights().get(4).getFlightID());
	}
	
	@Test
	void testWritingEmptyFlight() {
        ArrayList<String> Address1_1 = new ArrayList<String> ();
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        ArrayList<String> Address1_2 = new ArrayList<String> ();
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        ArrayList<Integer> SeatDim1 = new ArrayList<Integer> ();
		SeatDim1.add(0);
		SeatDim1.add(0);
        flightList.add(new Flight("", "", "", Address1_1,
                                    "", Address1_2, 0, "",
                                    "", "", "", "", SeatDim1));
		DataWriter.saveFlights();
		assertEquals("", DataLoader.loadFlights().get(0).getFlightID());
	}
	
	@Test
	void testWritingNullFlight() {
		ArrayList<String> Address1_1 = new ArrayList<String> ();
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        ArrayList<String> Address1_2 = new ArrayList<String> ();
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        Address1_1.add("");
        ArrayList<Integer> SeatDim1 = new ArrayList<Integer> ();
		SeatDim1.add(0);
		SeatDim1.add(0);
        flightList.add(new Flight("", "", "", Address1_1,
                                    "", Address1_2, 0, "",
                                    "", "", "", null, SeatDim1));
		DataWriter.saveUsers();
		assertEquals(null, DataLoader.loadUsers().get(0).getUserName());
	}

    @Test
	void testWritingZeroLuggages() {
		luggageList = DataLoader.loadLuggage();
		assertEquals(0, flightList.size());
	}

	@Test
	void testWritingOneLuggage() {
		luggageList.add(new Luggage("gfkhdgh657579", "dhjsghhj6597659", 30));
		DataWriter.saveLuggages();
		assertEquals("gfkhdgh657579", DataLoader.loadLuggage().get(0).getFlightID());
	}
	
	@Test
	void testWritingFiveLuggages() {
        luggageList.add(new Luggage("gfkhdgh657579", "dhjsghhj6597659", 30));
        luggageList.add(new Luggage("gfj4850512333", "dhjsghhj6597659", 30));
        luggageList.add(new Luggage("dhjghj6796554", "dhjsghhj6597659", 30));
        luggageList.add(new Luggage("fjhgh57699968", "dhjsghhj6597659", 30));
        luggageList.add(new Luggage("hryt45i654812", "dhjsghhj6597659", 30));
		DataWriter.saveLuggages();
		assertEquals("hryt45i654812", DataLoader.loadLuggage().get(4).getFlightID());
	}
	
	@Test
	void testWritingEmptyLuggage() {
        luggageList.add(new Luggage("", "", 0));
		DataWriter.saveLuggages();
		assertEquals("", DataLoader.loadLuggage().get(0).getFlightID());
	}
	
	@Test
	void testWritingNullLuggage() {
		luggageList.add(new Luggage(null, "", 0));
		DataWriter.saveLuggages();
		assertEquals(null, DataLoader.loadLuggage().get(0).getFlightID());
	}

    @Test
	void testWritingZeroHotels() {
		hotelList = DataLoader.loadHotels();
		assertEquals(0, hotelList.size());
	}

	@Test
	void testWritingOneHotel() {
		ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");
		hotelList.add(new Hotel("fhdjfgh7596407", "Hilton Hotel", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
		DataWriter.saveHotels();
		assertEquals("Hilton Hotel", DataLoader.loadHotels().get(0).getHotelName());
	}
	
	@Test
	void testWritingFiveHotels() {
        ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");
        hotelList.add(new Hotel("fhdjfgh7596407", "Hilton Hotel", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
        hotelList.add(new Hotel("fhdjfgh7596407", "Days Inn", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
        hotelList.add(new Hotel("fhdjfgh7596407", "Holiday Inn", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
        hotelList.add(new Hotel("fhdjfgh7596407", "Comfort Inn", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
        hotelList.add(new Hotel("fhdjfgh7596407", "Home2 Suites", "Hilton", Address1_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
		DataWriter.saveHotels();
		assertEquals("Home2 Suites", DataLoader.loadHotels().get(4).getHotelName());
	}
	
	@Test
	void testWritingEmptyHotel() {
        ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		hotelList.add(new Hotel("", "", "", Address1_1, 0, 0,
								0, 0, "", "", false, 0.0));
		DataWriter.saveHotels();
		assertEquals("", DataLoader.loadHotels().get(0).getHotelName());
	}
	
	@Test
	void testWritingNullLuggage() {
		ArrayList<String> Address1_1 = new ArrayList<String> ();
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		Address1_1.add("");
		hotelList.add(new Hotel("", null, "", Address1_1, 0, 0,
								0, 0, "", "", false, 0.0));
		DataWriter.saveHotels();
		assertEquals(null, DataLoader.loadHotels().get(0).getHotelName());
	}
}