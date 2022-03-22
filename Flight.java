import java.util.ArrayList;

public class Flight {
    // - duration: double
    // - startLocation: Location
    // - endLocation: Location
    // - luggage: ArrayList<Luggage>
    // - seating: ArrayList<Seat> 
    // - available: boolean
    // -  flightType: String
    private double duration;
    private Location startLocation;
    private Location endLocation;
    private ArrayList<Luggage> luggage;
    private ArrayList<Seat> seating ;
    private boolean available;
    private String flightType ;

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
        this.arrivalAddress = arrivalAddress;
        this.destinationAirport = destinationAirport;
        this.destinationAddress = destinationAddress;
        this.planeCapacity = planeCapacity;
        this.departureDate = departureDate;
        this.duration = Double.parseDouble(duration);
        this.flightType = flightType;
        this.userID = userID;
        this.flightID = flightID;
    }

    public String printTicket() {
        ;
    }

    public void addLuggage() {
        ;
    }
}