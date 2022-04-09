import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTester {
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
		userList.clear();
        flightList.clear();
        luggageList.clear();
        hotelList.clear();

        ArrayList<String> friends1 = new ArrayList<String>();
        friends1.add("hgrfy59658");
		friends1.add("fjkgh6850j");
        ArrayList<ArrayList<String>> family1 = new ArrayList<ArrayList<String>> ();
		family1.get(0).add("Alisa");
		family1.get(0).add("Smith");
		family1.get(0).add("24");
        ArrayList<String> friends2 = new ArrayList<String>();
        friends2.add("dkggkh56895");
		friends2.add("gjfk6950653");
        ArrayList<ArrayList<String>> family2 = new ArrayList<ArrayList<String>> ();
		family1.get(0).add("Dale");
		family1.get(0).add("White");
		family1.get(0).add("30");
		userList.add(new User("asmith", "Amy", "Smith", "hjfdgh5067459", "8034543344", "asmith@webmail.com",
                                19, "hdsjig489679", "dfjhgor765676", new Location("Broadway", "Nashville", "Tennessee", "44444", "United States"),
                                friends1, family1, false));
		userList.add(new User("bwhite", "Bob", "White", "hjg45767590", "8033333544", "robertwhite@gmail.com", 23,
                                "ghfhkg59878959", "fdghfdhg34985", new Location("Main Street", "Deadwood", "South Dakota", "57732", "United States"),
                                friends2, family2, false));

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

        luggageList.add(new Luggage("gfkhdgh657579", "dhjsghhj6597659", 30));
        luggageList.add(new Luggage("djsgh7459640", "ggfsh3643534767", 45));

        ArrayList<String> Address3_1 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");
		ArrayList<String> Address3_2 = new ArrayList<String> ();
		Address1_1.add("New York International Airport");
		Address1_1.add("New York");
		Address1_1.add("New York");
		Address1_1.add("33333");
		Address1_1.add("United States");
		hotelList.add(new Hotel("fhdjfgh7596407", "Hilton Hotel", "Hilton", Address3_1, 77, 2,
								150, 2, "2-4-2022", "2-6-2022", true, 4.0));
		hotelList.add(new Hotel("jfhg56023djehj", "Holiday Inn", "Holiday", Address3_2, 238, 3,
								150, 2, "4-22-2022", "4-24-2022", false, 3.5));;

		DataWriter.saveUsers();
        DataWriter.saveFlights();
        DataWriter.saveLuggages();
        DataWriter.saveHotels();
	}
	
	@AfterEach
	public void tearDown() {
		AllUsers.getInstance().getUsers().clear();
        AllFlights.getInstance().getFlights().clear();
        AllLuggages.getInstance().getLuggages().clear();
        AllHotels.getInstance().getHotels().clear();
		DataWriter.saveUsers();
        DataWriter.saveFlights();
        DataWriter.saveLuggages();
        DataWriter.saveHotels();
	}
	
	
	@Test
	void testGetUsersSize() {
		userList = DataLoader.loadUsers();
		assertEquals(2, userList.size());
	}

	@Test
	void testGetUsersSizeZero() {
		AllUsers.getInstance().getUsers().clear();
		DataWriter.saveUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	void testGetUserFirstUserName() {
		userList = DataLoader.loadUsers();
		assertEquals("asmith", userList.get(0).getUserName());
	}
}
}
