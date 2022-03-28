import java.util.ArrayList;

public class HotelTicket extends UserTicket {
    private int roomNumberInt;
    private String dateArriving;
    private String dateLeaving;
    private int numOfBeds;
    private Location location;

    //++ printTicket(): String
    public HotelTicket(String ID, String company, Location location, ArrayList<Rating> ratings, int roomNumberInt, String dateArriving, String dateLeaving, int numOfBeds) { 
        super(ID, company, ratings);
        this.location = location;
        this.roomNumberInt = roomNumberInt;
        this.dateArriving = dateArriving;
        this.dateLeaving = dateLeaving;
        this.numOfBeds = numOfBeds;
    }
        
    public String toString() {
        return "Hotel: " + company
                + "\nAddress: " + location.toString()
                + "\nRoom Number: " + roomNumberInt
                + "\nArrival Date: " + dateArriving
                + "\nDeparture Date: " + dateLeaving
                + "\nNumber of Beds: " + numOfBeds;
    }
}
