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
		flightDetails.put(PEOPLE_FIRST_NAME, flight.getFirstName());
		flightDetails.put(PEOPLE_LAST_NAME, flight.getLastName());
		flightDetails.put(PEOPLE_PHONE_NUMBER, flight.getPhoneNumber());
        
        return flightDetails;
    }

    public static JSONObject getUsersJSON (User user) {
        JSONObject userDetails = new JSONObject();
		userDetails.put(PEOPLE_FIRST_NAME, user.getFirstName());
		userDetails.put(PEOPLE_LAST_NAME, user.getLastName());
		userDetails.put(PEOPLE_PHONE_NUMBER, user.getPhoneNumber());
        
        return userDetails;
    }

    public static JSONObject getHotelsJSON (Hotel hotel) {
        JSONObject hotelDetails = new JSONObject();
		hotelDetails.put(PEOPLE_FIRST_NAME, hotel.getFirstName());
		hotelDetails.put(PEOPLE_LAST_NAME, hotel.getLastName());
		hotelDetails.put(PEOPLE_PHONE_NUMBER, hotel.getPhoneNumber());
        
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
