import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    public static ArrayList<Flight> loadFlights() {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		try {
			//JSONParser jsonP = new JSONParser();
			//JSONObject jsonO = (JSONObject) jsonP.parse(new FileReader(FLIGHT_FILE_NAME));

			FileReader reader = new FileReader(FLIGHT_FILE_NAME);
			//JSONParser parser = new JSONParser();
			JSONArray flightsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < flightsJSON.size(); i++) {
				JSONObject flightJSON = (JSONObject)flightsJSON.get(i);
				String planeName = (String)flightJSON.get(FLIGHT_PLANE_NAME);
				String airline = (String)flightJSON.get(FLIGHT_AIRLINE);
				String arrivalAirport = (String)flightJSON.get(FLIGHT_ARRIVAL_AIRPORT);
                ArrayList<String> arrivalAddress = (ArrayList<String>)flightJSON.get(FLIGHT_ARRIVAL_ADDRESS);
                String destinationAirport = (String)flightJSON.get(FLIGHT_DESTINATION_AIRPORT);
                ArrayList<String> destinationAddress = (ArrayList<String>)flightJSON.get(FLIGHT_DESTINATION_ADDRESS);
                int planeCapacity = (int)flightJSON.get(FLIGHT_PLANE_CAPACITY);
                String departureDate = (String)flightJSON.get(FLIGHT_DEPARTURE_DATE);
                String duration = (String)flightJSON.get(FLIGHT_DURATION);
                String flightType = (String)flightJSON.get(FLIGHT_TYPE);
                String userID = (String)flightJSON.get(FLIGHT_USER_ID);
                String flightID = (String)flightJSON.get(FLIGHT_ID);
				int seatX = (int)flightJSON.get(FLIGHT_SEAT_X);
				int seatY = (int)flightJSON.get(FLIGHT_SEAT_Y);
				
				flights.add(new Flight(planeName, airline, arrivalAirport, arrivalAddress,
                                        destinationAirport, destinationAddress, planeCapacity,
                                        departureDate, duration, flightType, userID, flightID,
										seatX, seatY));
			}
			
			return flights;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

    public static ArrayList<User> loadUsers() {
		ArrayList<User> users = new ArrayList<User>();
		
		try {
			FileReader reader = new FileReader(USER_FILE_NAME);
			//JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String username = (String)userJSON.get(USER_NAME);
				String firstName = (String)userJSON.get(USER_FIRST_NAME);
				String lastName = (String)userJSON.get(USER_LAST_NAME);
                String userID = (String)userJSON.get(USER_ID);
                String phone = (String)userJSON.get(USER_PHONE);
                String email = (String)userJSON.get(USER_EMAIL);
                int userAge = (int)userJSON.get(USER_AGE);
                String passportNumber = (String)userJSON.get(USER_PASSPORT_NUMBER);
                String password = (String)userJSON.get(USER_PASSWORD);
                ArrayList<String> address = (ArrayList<String>)userJSON.get(USER_ADDRESS);
                ArrayList<String> friends = (ArrayList<String>)userJSON.get(USER_FRIENDS);
                ArrayList<ArrayList<String>> family = (ArrayList<ArrayList<String>>)userJSON.get(USER_FAMILY);
                boolean senior = (boolean)userJSON.get(USER_SENIOR);
				
				users.add(new User(username, password, firstName, lastName, phone, email,
                                    passportNumber, new Location(address.get(0), address.get(1),
									address.get(2), address.get(3), address.get(4)), userAge,
									senior));
			}
			
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

    public static ArrayList<Hotel> loadHotels() {
		ArrayList<Hotel> hotels = new ArrayList<Hotel>();
		
		try {
			FileReader reader = new FileReader(HOTEL_FILE_NAME);
			//JSONParser parser = new JSONParser();
			JSONArray hotelsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < hotelsJSON.size(); i++) {
				JSONObject hotelJSON = (JSONObject)hotelsJSON.get(i);
				String userID = (String)hotelJSON.get(HOTEL_USER_ID);
				String hotelName = (String)hotelJSON.get(HOTEL_NAME);
				String hotelCompany = (String)hotelJSON.get(HOTEL_COMPANY);
                ArrayList<String> hotelAddress = (ArrayList<String>)hotelJSON.get(HOTEL_ADDRESS);
                int roomNumber = (int)hotelJSON.get(HOTEL_ROOM_NUMBER);
                int daysBooked = (int)hotelJSON.get(HOTEL_DAYS_BOOKED);
                int capacity = (int)hotelJSON.get(HOTEL_CAPACITY);
                int numberOfBeds = (int)hotelJSON.get(HOTEL_NUMBER_OF_BEDS);
                String arrivalDate = (String)hotelJSON.get(HOTEL_ARRIVAL_DATE);
                String departureDate = (String)hotelJSON.get(HOTEL_DEPARTURE_DATE);
				boolean pool = (boolean)hotelJSON.get(HOTEL_POOL);
				double rating = (double)hotelJSON.get(HOTEL_RATING);
				
				hotels.add(new Hotel(userID, hotelName, hotelCompany, hotelAddress, roomNumber,
                                        daysBooked, capacity, numberOfBeds, arrivalDate, departureDate, pool, rating));
			}
			
			return hotels;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public static ArrayList<Luggage> loadLuggage() {
		ArrayList<Luggage> luggages = new ArrayList<Luggage>();
		
		try {
			FileReader reader = new FileReader(LUGGAGE_FILE_NAME);
			//JSONParser parser = new JSONParser();
			JSONArray luggagesJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < luggagesJSON.size(); i++) {
				JSONObject luggageJSON = (JSONObject)luggagesJSON.get(i);
				String userID = (String)luggageJSON.get(LUGGAGE_USER_ID);
				String flightID = (String)luggageJSON.get(LUGGAGE_FLIGHT_ID);
				double weight = (double)luggageJSON.get(LUGGAGE_WEIGHT);
				
				luggages.add(new Luggage(userID, flightID, weight));
			}
			
			return luggages;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
