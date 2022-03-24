import java.util.ArrayList;

public class AllFlights {
// -allFlights: AllFlights
// -flights: ArrayList<Flight
private AllFlights allFlights;
private ArrayList<Flight> flights;

// -AllFlights()
// +  getInstance(): AllFlights
// + addFlight(): void
// +logout: void
private AllFlights(){}

public AllFlights getInstance(){
    if (allFlights == null) {
        allFlights = new AllFlights();
    }
    return allFlights;
}

public void addFlight(String planeName, String airline, String arrivalAirport,
                        ArrayList<String> arrivalAddress, String destinationAirport,
                        ArrayList<String> destinationAddress, int planeCapacity,
                        String departureDate, String duration, String flightType,
                        String userID, String flightID) {
    Flight flight = new Flight(planeName, airline, arrivalAirport, arrivalAddress, destinationAirport,
                                destinationAddress, planeCapacity, departureDate, duration, flightType,
                                userID, flightID);
    flights.add(flight);
}

public void logout() {
    DataWriter.saveFlights();
}



}
