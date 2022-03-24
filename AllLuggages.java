import java.util.ArrayList;

public class AllLuggages {
// -allFlights: AllFlights
// -flights: ArrayList<Flight
private AllLuggages allLuggages;
private ArrayList<Luggage> luggages;

// -AllFlights()
// +  getInstance(): AllFlights
// + addFlight(): void
// +logout: void
private AllLuggages(){}

public AllLuggages getInstance(){
    if (allLuggages == null) {
        allLuggages = new AllLuggages();
    }
    return allLuggages;
}
public void addLuggage(String userID, String flightID, double weight){
    Luggage luggage = new Luggage(userID, flightID, weight);
    luggages.add(luggage);
}
public void logout(){
    DataWriter.saveLuggages();
}
}