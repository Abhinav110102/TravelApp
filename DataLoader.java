import java.io.FileReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Map;

import javax.xml.namespace.QName;

import java.lang.Integer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
	private static int seatXMax;
	private static int seatYMax;

	
	public static void setSeatXMax(int setXVal) {
		seatXMax = setXVal;
	}

	public static void setSeatYMax(int setYVal) {
		seatYMax = setYVal;
	}

	public int getSeatXMax() {
		return seatXMax;
	}

	public int getSeatYMax() {
		return seatYMax;
	}

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
                String capacity = (String)flightJSON.get(FLIGHT_PLANE_CAPACITY);
				int planeCapacity = Integer.parseInt(capacity);
                String departureDate = (String)flightJSON.get(FLIGHT_DEPARTURE_DATE);
                String duration = (String)flightJSON.get(FLIGHT_DURATION);
                String flightType = (String)flightJSON.get(FLIGHT_TYPE);
                String userID = (String)flightJSON.get(FLIGHT_USER_ID);
                String flightID = (String)flightJSON.get(FLIGHT_ID);
				ArrayList<Integer> seats = (ArrayList<Integer>)flightJSON.get(FLIGHT_SEATS);
				
				setSeatXMax(seats.get(0));
				setSeatYMax(seats.get(1));
				ArrayList<Seat> seating = new ArrayList<Seat>();
				for (int j = 0; j < seats.get(0); j++) {
					for (int k = 0; k < seats.get(1); k++) {
						seating.add(new Seat(j, k, false));
					}
				}

				ArrayList<ArrayList<Integer>> takenSeats = (ArrayList<ArrayList<Integer>>)flightJSON.get(FLIGHT_TAKEN_SEATS);

				System.out.println(departureDate);
				flights.add(new Flight(planeName, airline, arrivalAirport, arrivalAddress, destinationAirport,
                 destinationAddress, planeCapacity, departureDate, duration, flightType, userID, flightID, seating));

				 /*
				flights.add(new Flight(planeName, airline, arrivalAirport, arrivalAddress,
                                        destinationAirport, destinationAddress, planeCapacity,
                                        departureDate, duration, flightType, userID, flightID,
										seatX, seatY));*/
			}
			
			System.out.println("RETURNING FLIGHTS");
			return flights;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("ERROR NO FLIGHTS");
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
                String userAge = (String)userJSON.get(USER_AGE);
				int age = Integer.parseInt(userAge);
                String passportNumber = (String)userJSON.get(USER_PASSPORT_NUMBER);
                String password = (String)userJSON.get(USER_PASSWORD);
				System.out.println("Im here");
                ArrayList<String> address = (ArrayList<String>)userJSON.get(USER_ADDRESS);
                ArrayList<String> friends = (ArrayList<String>)userJSON.get(USER_FRIENDS);
                ArrayList<ArrayList<String>> family = (ArrayList<ArrayList<String>>)userJSON.get(USER_FAMILY);
                boolean senior = (boolean)userJSON.get(USER_SENIOR);
				Location location = new Location(address);
				System.out.println("Got through");
				users.add(new User(username, firstName, lastName, userID,
					phone, email, age, passportNumber, password, location ,friends, family, senior));
				/*
				users.add(new User(username, password, firstName, lastName, phone, email,
                                    passportNumber, new Location(address.get(0), address.get(1),
									address.get(2), address.get(3), address.get(4)), userAge,
									senior));
									*/
			}
			System.out.println("RETURNING USERS");
			return users;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("RETURNING ERROR USERS");
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
