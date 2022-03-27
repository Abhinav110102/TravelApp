import java.util.ArrayList;
import java.util.Date;

public class FlightTicket extends UserTicket{
       // - duration: double
    // - startLocation: Location
    // - endLocation: Location
    // - luggage: ArrayList<Luggage>
    // - seating: ArrayList<Seat> 
    // - available: boolean
    // -  flightType: String
    private String duration;
    private Location startLocation; //Location start in user ticket? 
    private Location endLocation;
    private ArrayList<Luggage> luggage;
    private ArrayList<Seat> seating;
    private boolean available;
    private String flightType;
    private Date date;

    // + Flight(double duration, Location startLocation, Location endLocation)
    // + printTicket(): String
    // + addLuggage(): void
    public FlightTicket(String ID, String company, ArrayList<Rating> ratings, String duration, Location startLocation, Location endLocation, Date date) {
        super(ID, company, ratings);
        this.duration = duration;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.date = date;
    }

    public String toString() {
        return "Airline: " + company
                + "\nStart Address: " + startLocation.toString()
                + "\nEnd Address: " + endLocation
                + "\nFlight Date: " + date
                + "\nSeat Number " + seating.toString();
    }

    public void addLuggage() {
        ;
    }
}
