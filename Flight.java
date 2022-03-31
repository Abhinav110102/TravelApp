import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Flight extends Ticket {
    // - duration: double
    // - startLocation: Location
    // - endLocation: Location
    // - luggage: ArrayList<Luggage>
    // - seating: ArrayList<Seat> 
    // - available: boolean
    // -  flightType: String
    private Seat seating;
    private boolean available;

    //Variables from JSON files & others;
    private String planeName;
    private String airline;
    private String arrivalAirport;
    private String destinationAirport;
    private int planeCapacity;
    private String departureDate;
    private String duration;
    private String flightType;
    private String userID;
    private String flightID;
    private Location startLocation;
    private Location endLocation;
    private ArrayList<Luggage> luggage;
    private Date depart;
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

    /**
     * Flight constructor with constants passed in via DataLoader
     */
    public Flight(String planeName, String airline, String arrivalAirport,
                ArrayList<String> arrivalAddress, String destinationAirport,
                ArrayList<String> destinationAddress, int planeCapacity,
                String departureDate, String duration, String flightType,
                String userID, String flightID, int SeatX, int SeatY) {
        this.planeName = planeName;
        this.airline = airline;
        this.arrivalAirport = arrivalAirport;
        this.destinationAirport = destinationAirport;
        this.planeCapacity = planeCapacity;
        this.departureDate = departureDate;
        this.duration = duration;
        this.flightType = flightType;
        this.userID = userID;
        this.flightID = flightID;

        startLocation = new Location(arrivalAddress.get(0), arrivalAddress.get(1), arrivalAddress.get(2),
                                    arrivalAddress.get(3), arrivalAddress.get(4));
        endLocation = new Location(destinationAddress.get(0), destinationAddress.get(1), destinationAddress.get(2),
                                    destinationAddress.get(3), destinationAddress.get(4));

        try {
            this.depart = sdf.parse(departureDate);
        } catch (Exception e) {
            System.out.println("Error parsing dates");
        }

        seating = new Seat(SeatX, SeatY);
    }

    /**
     * Method to return 
     * @return
     */
    public String getPlaneName() {
        return planeName;
    }

    public String getAirline() {
        return airline;
    }

    public String getArrivalAirport() {
        return arrivalAirport;
    }

    public String getDestinationAirport() {
        return destinationAirport;
    }

    public int getPlaneCapacity() {
        return planeCapacity;
    }

    public String getFlightDepartureDate() {
        return departureDate;
    }

    public String getFlightDuration() {
        return duration;
    }

    public String getFlightType() {
        return flightType;
    }

    public String getUserID() {
        return userID;
    }

    public String getFlightID() {
        return flightID;
    }

    public Location getStartLocation() {
        return startLocation;
    }

    public ArrayList<String> getArrivalAddress() {
        ArrayList<String> addressvals = new ArrayList<>();
        addressvals.add(startLocation.getStreet());
        addressvals.add(startLocation.getCity());
        addressvals.add(startLocation.getState());
        addressvals.add(startLocation.getZipcode());
        addressvals.add(startLocation.getCountry());
        return addressvals;
    }

    public void transferSplit(Flight flight, String airportMidpoint, ArrayList<String> midpoint, String newFlightID) {
        if (flight.flightType.equalsIgnoreCase("TRANSFER")) {
            AllFlights.addFlight(planeName, airline, arrivalAirport, getArrivalAddress(),
                                airportMidpoint, midpoint, planeCapacity,
                                departureDate, duration, flightType, userID, flightID, seating.getXpos(), seating.getYpos());
            AllFlights.addFlight(planeName, airline, airportMidpoint, midpoint,
                                destinationAirport, getDestinationAddress(), planeCapacity,
                                departureDate, duration, flightType, userID, newFlightID, seating.getXpos(), seating.getYpos());
        }
    }

    public Location getEndLocation() {
        return endLocation;
    }

    public ArrayList<String> getDestinationAddress() {
        ArrayList<String> addressvals = new ArrayList<>();
        addressvals.add(endLocation.getStreet());
        addressvals.add(endLocation.getCity());
        addressvals.add(endLocation.getState());
        addressvals.add(endLocation.getZipcode());
        addressvals.add(endLocation.getCountry());
        return addressvals;
    }

    public String printTicket() {
        FlightTicket flightTicket = new FlightTicket(flightID, airline, ratings, duration, startLocation, endLocation, depart, seating);
        return flightTicket.toString();
    }

    public void addLuggage(double weight) {
        luggage.add(new Luggage(getUserID(), getFlightID(), weight));
    }

    public Seat getSeating() {
        return seating;
    }

    public int getSeatXPos() {
        return seating.getXpos();
    }

    public int getSeatYPos() {
        return seating.getYpos();
    }

    @Override
    public Ticket bookTicket() {
      // TODO Auto-generated method stub
      return null;
    }
    
    /**
     * Method to return all data on a Flight in a String
     * @return String the data to be returned.
     */
    public String toString() {
        return planeName + " " +
        airline + " " +
        arrivalAirport + " " +
        destinationAirport + " " +
        planeCapacity + " " +
        departureDate + " " +
        duration + " " +
        flightType + " " +
        userID + " " +
        flightID + " " +
        startLocation + " " +
        endLocation  + " " +
        depart + " " +
        luggage;
    }
}
