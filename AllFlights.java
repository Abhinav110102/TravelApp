import java.util.ArrayList;

/**
 * Method for managing data for all flights. Calls the DataWrtiter and holds an
 * array list of Flights.
 */
public class AllFlights {

    private static AllFlights allFlights = null;
    private static ArrayList<Flight> flights = new ArrayList<>();

    /**
     * Constructor
     */
    private AllFlights(){
        flights = DataLoader.loadFlights();
    }

    /**
     * Method to return an instance of AllFLights
     * @return AllFlights the instance to be returned.
     */
    public static AllFlights getInstance(){
        if (allFlights == null) {
            allFlights = new AllFlights();
        }
        return allFlights;
    }

    /**
     * Method to return an ArrayList of flights
     * @return flights the ArrayList to be returned.
     */
    public ArrayList<Flight> getFlights() {
        return flights;
    }

    /**
     * Method to add a flight to ArrayList<Flight> flights
     * @param planeName value in Flight constructor
     * @param airline value in Flight constructor
     * @param arrivalAirport value in Flight constructor
     * @param arrivalAddress value in Flight constructor
     * @param destinationAirport value in Flight constructor
     * @param destinationAddress value in Flight constructor
     * @param planeCapacity value in Flight constructor
     * @param departureDate value in Flight constructor
     * @param duration value in Flight constructor
     * @param flightType value in Flight constructor
     * @param userID value in Flight constructor
     * @param flightID value in Flight constructor
     * @param seatX value in Flight constructor
     * @param seatY value in Flight constructor
     */
    public static void addFlight(String planeName, String airline, String arrivalAirport,
                        ArrayList<String> arrivalAddress, String destinationAirport,
                        ArrayList<String> destinationAddress, int planeCapacity,
                        String departureDate, String duration, String flightType,
                        String userID, String flightID, ArrayList<Seat> seating) {
        Flight flight = new Flight(planeName, airline, arrivalAirport, arrivalAddress, destinationAirport,
                                destinationAddress, planeCapacity, departureDate, duration, flightType,
                                userID, flightID, seating);
        flights.add(flight);
    }

    public void bookFlight(Flight flight, String seat) {
        for (Flight f : flights) {
            
        }
    }

    /**
     * Method to call DataWriter and save flights to JSON file
     */
    public static void logout() {
        DataWriter.saveFlights();
    }

    public boolean haveFlight(String flightID) {
		for(Flight flight : flights) {
			if(flight.getFlightID().equals(flightID)) {
				return true;
			}
		}
		
		return false;
	}
}
