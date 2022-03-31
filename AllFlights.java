import java.util.ArrayList;

public class AllFlights {
// -allFlights: AllFlights
// -flights: ArrayList<Flight
private static AllFlights allFlights = null;
private static ArrayList<Flight> flights = new ArrayList<>();

// -AllFlights()
// +  getInstance(): AllFlights
// + addFlight(): void
// +logout: void
private AllFlights(){}

public static AllFlights getInstance(){
    if (allFlights == null) {
        allFlights = new AllFlights();
    }
    return allFlights;
}

public static ArrayList<Flight> getFlights() {
    return flights;
}

public static void addFlight(String planeName, String airline, String arrivalAirport,
                        ArrayList<String> arrivalAddress, String destinationAirport,
                        ArrayList<String> destinationAddress, int planeCapacity,
                        String departureDate, String duration, String flightType,
                        String userID, String flightID, int seatX, int seatY) {
    Flight flight = new Flight(planeName, airline, arrivalAirport, arrivalAddress, destinationAirport,
                                destinationAddress, planeCapacity, departureDate, duration, flightType,
                                userID, flightID, seatX, seatY);
    flights.add(flight);
}

public static void logout() {
    DataWriter.saveFlights();
}



}
