import java.util.ArrayList;

public class FlightTicket extends UserTicket{
       // - duration: double
    // - startLocation: Location
    // - endLocation: Location
    // - luggage: ArrayList<Luggage>
    // - seating: ArrayList<Seat> 
    // - available: boolean
    // -  flightType: String
    private String duration;
    //private Location startLocation; Location start in user ticket
    private Location endLocation;
    private ArrayList<Luggage> luggage;
    private ArrayList<Seat> seating ;
    private boolean available;
    private String flightType;

    // + Flight(double duration, Location startLocation, Location endLocation)
    // + printTicket(): String
    // + addLuggage(): void
    public FlightTicket(String ID, String company, Location location, ArrayList<Rating> ratings, String duration, Location startLocation, Location endLocation) {
        super(ID, company, location, ratings);
        this.duration = duration;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
    }

    public String printTicket() {
        return "";
    }

    public void addLuggage() {
        ;
    }
}
