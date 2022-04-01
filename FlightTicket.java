import java.util.ArrayList;
import java.util.Date;

/**
 * Class for managing data in a flight ticket which is added to a user. This is a child class of Ticket
 * and this class holds luggage data.
 */
public class FlightTicket extends UserTicket{

    private String duration;
    private Location startLocation; //Location start in user ticket? 
    private Location endLocation;
    private ArrayList<Luggage> luggage;
    private String seat;
    private boolean available;
    private String flightType;
    private String date;

    /**
     * Constructor
     */
    public FlightTicket(String ID, String company, ArrayList<Rating> ratings, String duration, Location startLocation, Location endLocation, String date, String seat) {
        super(ID, company, ratings);
        this.duration = duration;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.date = date;
        this.seat = seat;
    }

    /**
     * toString method
     */
    public String toString() {
        return "Airline: " + company
                + "\nStart Address: " + startLocation.toString()
                + "\nEnd Address: " + endLocation
                + "\nFlight Date: " + date
                + "\nSeat Number " + seat;
    }

    /**
     * Method to add a luggage instance to the array list of luggage.
     * @param luggageInst the instance of luggage to add.
     */
    public void addLuggage(Luggage luggageInst) {
        luggage.add(luggageInst);
    }
}
