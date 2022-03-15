import java.io.FileReader;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataLoader extends DataConstants {
    public static ArrayList<Flight> loadFlights() {
		ArrayList<Flight> flights = new ArrayList<Flight>();
		
		try {
			FileReader reader = new FileReader(FLIGHT_FILE_NAME);
			JSONParser parser = new JSONParser();
			JSONArray flightsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < flightsJSON.size(); i++) {
				JSONObject flightJSON = (JSONObject)flightsJSON.get(i);
				String const1 = (String)flightJSON.get(CONST_NAME_1);
				String const2 = (String)flightJSON.get(CONST_NAME_2);
				String const3 = (String)flightJSON.get(CONST_NAME_3);
				
				flights.add(new Flight(const1, const2, const3));
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
			JSONParser parser = new JSONParser();
			JSONArray usersJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < usersJSON.size(); i++) {
				JSONObject userJSON = (JSONObject)usersJSON.get(i);
				String const1 = (String)userJSON.get(CONST_NAME_1);
				String const2 = (String)userJSON.get(CONST_NAME_2);
				String const3 = (String)userJSON.get(CONST_NAME_3);
				
				users.add(new User(const1, const2, const3));
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
			JSONParser parser = new JSONParser();
			JSONArray hotelsJSON = (JSONArray)new JSONParser().parse(reader);
			
			for(int i=0; i < hotelsJSON.size(); i++) {
				JSONObject hotelJSON = (JSONObject)hotelsJSON.get(i);
				String const1 = (String)hotelJSON.get(CONST_NAME_1);
				String const2 = (String)hotelJSON.get(CONST_NAME_2);
				String const3 = (String)hotelJSON.get(CONST_NAME_3);
				
				hotels.add(new Hotel(const1, const2, const3));
			}
			
			return hotels;
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
