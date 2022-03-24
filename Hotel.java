import java.util.ArrayList;
import java.util.Date;
public class Hotel extends Ticket{
    //     - roomNumber: int
    // - dateArriving: Date
    // - dateLeaving: Date
    // - roomNumber: String
    // - capacity: int
    // - numOfBeds
    private int roomNumberInt;
    private Date dateArriving;
    private Date dateLeaving;
    private String roomNumberString;
    private int capacity;
    private int numOfBeds;

    //Variables from JSON Files
    private String userID;
    private String hotelName;
    private String hotelCompany;
    private ArrayList<String> hotelAddress;
    private int roomNumber;
    private int daysBooked;
    private int capacity;
    private int numberOfBeds;
    private String arrivalDate;
    private String departureDate;

    public Hotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                String arrivalDate, String departureDate) {
        this.userID = userID;
        this.hotelName = hotelName;
        this.hotelCompany = hotelCompany;
        this.hotelAddress = hotelAddress;
        this.roomNumberInt = roomNumber;
        this.daysBooked = daysBooked;
        this.capacity = capacity;
        this.numOfBeds = numberOfBeds;
        this.dateArriving = arrivalDate;
        this.dateLeaving = departureDate;
    }

    public String getUserID() {
        return userID;
    }

    public String getHotelName() {
        return hotelName;
    }

    public String getHotelCompany() {
        return hotelCompany;
    }

    public ArrayList<String> getHotelAddress() {
        return hotelAddress;
    }

    public int getRoomNumber() {
        return roomNumberInt;
    }

    public int getDaysBooked() {
        return daysBooked;
    }

    public int getHotelCapacity() {
        return capacity;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public String getHotelArrivalDate() {
        return arrivalDate;
    }

    public String getHotelDepartureDate() {
        return departureDate;
    }

    //+ printTicket(): String
    public String printTicket() {
        ;
    }
}