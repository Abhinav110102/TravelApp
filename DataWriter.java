import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class DataWriter extends DataConstants {
    public static void saveFlights() {
        Flight flight = Flight.getInstance();
		ArrayList<Flight> flights = flight.getFlights();
		JSONArray jsonFlights = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< flights.size(); i++) {
			jsonFlights.add(getFlightsJSON(flights.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(FLIGHT_FILE_NAME)) {
 
            file.write(jsonFlights.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveUsers() {
        User user = User.getInstance();
		ArrayList<User> users = user.getUsers();
		JSONArray jsonUsers = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< users.size(); i++) {
			jsonUsers.add(getUsersJSON(users.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(USER_FILE_NAME)) {
 
            file.write(jsonUsers.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveHotels() {
        Hotel hotel = Hotel.getInstance();
		ArrayList<Hotel> hotels = hotel.getHotels();
		JSONArray jsonHotels = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< hotels.size(); i++) {
			jsonHotels.add(getHotelsJSON(hotels.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(HOTEL_FILE_NAME)) {
 
            file.write(jsonHotels.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void saveLuggages() {
        Luggage luggage = Luggage.getInstance();
		ArrayList<Luggage> luggages = luggage.getLuggages();
		JSONArray jsonLuggages = new JSONArray();
		
		//creating all the json objects
		for(int i=0; i< luggages.size(); i++) {
			jsonLuggages.add(getLuggagesJSON(luggages.get(i)));
		}
		
		//Write JSON file
        try (FileWriter file = new FileWriter(LUGGAGE_FILE_NAME)) {
 
            file.write(jsonLuggages.toJSONString());
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static JSONObject getFlightsJSON (Flight flight) {
        JSONObject flightDetails = new JSONObject();
		flightDetails.put(FLIGHT_PLANE_NAME, flight.getPlaneName());
		flightDetails.put(FLIGHT_AIRLINE, flight.getAirline());
		flightDetails.put(FLIGHT_ARRIVAL_AIRPORT, flight.getArrivalAirport());
        flightDetails.put(FLIGHT_ARRIVAL_ADDRESS, flight.getArrivalAddress());
        flightDetails.put(FLIGHT_DESTINATION_AIRPORT, flight.getDestinationAirport());
        flightDetails.put(FLIGHT_DESTINATION_ADDRESS, flight.getDestinationAddress());
        flightDetails.put(FLIGHT_PLANE_CAPACITY, flight.getPlaneCapacity());
        flightDetails.put(FLIGHT_DEPARTURE_DATE, flight.getFlightDepartureDate());
        flightDetails.put(FLIGHT_DURATION, flight.getFlightDuration());
        flightDetails.put(FLIGHT_TYPE, flight.getFlightType());
        flightDetails.put(FLIGHT_USER_ID, flight.getUserID());
        flightDetails.put(FLIGHT_ID, flight.getFlightID());
        
        return flightDetails;
    }

    public static JSONObject getUsersJSON (User user) {
        JSONObject userDetails = new JSONObject();
		userDetails.put(USER_NAME, user.getUserName());
		userDetails.put(USER_FIRST_NAME, user.getFirstName());
		userDetails.put(USER_LAST_NAME, user.getLastName());
        userDetails.put(USER_ID, user.getUserID());
        userDetails.put(USER_PHONE, user.getPhoneNumber());
        userDetails.put(USER_EMAIL, user.getEmail());
        userDetails.put(USER_AGE, user.getUserAge());
        userDetails.put(USER_PASSPORT_NUMBER, user.getPassportNumber());
        userDetails.put(USER_PASSWORD, user.getPassword());
        userDetails.put(USER_ADDRESS, user.getAddress());
        userDetails.put(USER_FRIENDS, user.getFriends());
        userDetails.put(USER_FAMILY, user.getFamily());
        userDetails.put(USER_SENIOR, user.isOver50());
        
        return userDetails;
    }

    public static JSONObject getHotelsJSON (Hotel hotel) {
        JSONObject hotelDetails = new JSONObject();
		hotelDetails.put(HOTEL_USER_ID, hotel.getUserID());
		hotelDetails.put(HOTEL_NAME, hotel.getHotelName());
		hotelDetails.put(HOTEL_COMPANY, hotel.getHotelCompany());
        hotelDetails.put(HOTEL_ADDRESS, hotel.getHotelAddress());
        hotelDetails.put(HOTEL_ROOM_NUMBER, hotel.getRoomNumber());
        hotelDetails.put(HOTEL_DAYS_BOOKED, hotel.getDaysBooked());
        hotelDetails.put(HOTEL_CAPACITY, hotel.getHotelCapacity());
        hotelDetails.put(HOTEL_NUMBER_OF_BEDS, hotel.getNumberOfBeds());
        hotelDetails.put(HOTEL_ARRIVAL_DATE, hotel.getHotelArrivalDate());
        hotelDetails.put(HOTEL_DEPARTURE_DATE, hotel.getHotelDepartureDate());
        
        return hotelDetails;
    }

    public static JSONObject getLuggagesJSON (Luggage luggage) {
        JSONObject luggageDetails = new JSONObject();
		luggageDetails.put(LUGGAGE_USER_ID, luggage.getUserID());
		luggageDetails.put(LUGGAGE_FLIGHT_ID, luggage.getFlightID());
		luggageDetails.put(LUGGAGE_WEIGHT, luggage.getWeight());
        
        return luggageDetails;
    }
}
