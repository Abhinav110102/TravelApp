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
    if (AllLuggages == null) {
        allLuggages = new AllLuggages();
    }
    return allLuggages;
}
public void addLuggage(){
    ;
}
public void logout(){
    ;
}
}