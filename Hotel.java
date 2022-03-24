import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Hotel extends Ticket{
    //Variables from JSON Files
    private String userID;
    private String hotelName;
    private String hotelCompany;
    private ArrayList<String> hotelAddress;
    private int roomNumber;
    private int daysBooked;
    private int capacity;
    private int numberOfBeds;
    private Date dateArriving;
    private Date dateLeaving;

    public Hotel(String userID, String hotelName, String hotelCompany, ArrayList<String> hotelAddress,
                int roomNumber, int daysBooked, int capacity, int numberOfBeds,
                String arrivalDate, String departureDate) {
        this.userID = userID;
        this.hotelName = hotelName;
        this.hotelCompany = hotelCompany;
        this.hotelAddress = hotelAddress;
        this.roomNumber = roomNumber;
        this.daysBooked = daysBooked;
        this.capacity = capacity;
        this.numberOfBeds = numberOfBeds;

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.dateArriving = sdf.parse(arrivalDate);
            this.dateLeaving = sdf.parse(departureDate);
        } catch (Exception e) {
            System.out.println("Error parsing dates");
        }
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
        return roomNumber;
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

    public Date getHotelArrivalDate() {
        return dateArriving;
    }

    public Date getHotelDepartureDate() {
        return dateLeaving;
    }

    //+ printTicket(): String
    public String printTicket() {
        ;
    }
}