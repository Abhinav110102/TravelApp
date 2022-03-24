import java.util.ArrayList;

public class Flight {
    // - duration: double
    // - startLocation: Location
    // - endLocation: Location
    // - luggage: ArrayList<Luggage>
    // - seating: ArrayList<Seat> 
    // - available: boolean
    // -  flightType: String
    private ArrayList<Luggage> luggage;
    private ArrayList<Seat> seating ;
    private boolean available;

    //Variables from JSON files;
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

    // + Flight(double duration, Location startLocation, Location endLocation)
    // + printTicket(): String
    // + addLuggage(): void
    public Flight(double duration, Location startLocation, Location endLocation) {
        //Constructor shall generate an arrayList of seats - Mark V
        ;
    }

    //Flight constructor with constants passed in via DataLoader
    public Flight(String planeName, String airline, String arrivalAirport,
                ArrayList<String> arrivalAddress, String destinationAirport,
                ArrayList<String> destinationAddress, int planeCapacity,
                String departureDate, String duration, String flightType,
                String userID, String flightID) {
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
    }

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
        ;
    }

    public void addLuggage() {
        ;
    }
}