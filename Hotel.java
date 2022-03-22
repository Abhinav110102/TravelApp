
public class Hotel {
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

    public Hotel(String userID, String hotelName, String hotelCompany, String[] hotelAddress,
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

    //+ printTicket(): String
    public String printTicket() {
        ;
    }
}
