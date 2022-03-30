import java.util.ArrayList;

public class AllLuggages {
// -allFlights: AllFlights
// -flights: ArrayList<Flight
private static AllLuggages allLuggages = null;
private static ArrayList<Luggage> luggages = new ArrayList<>();

// -AllFlights()
// +  getInstance(): AllFlights
// + addFlight(): void
// +logout: void
private AllLuggages(){}

public static AllLuggages getInstance(){
    if (allLuggages == null) {
        allLuggages = new AllLuggages();
    }
    return allLuggages;
}

public ArrayList<Luggage> getLuggages() {
    return luggages;
}

public void addLuggage(String userID, String flightID, double weight){
    Luggage luggage = new Luggage(userID, flightID, weight);
    luggages.add(luggage);
}
public static void logout(){
    DataWriter.saveLuggages();
}
}