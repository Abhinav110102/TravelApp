
public class HotelTicket extends UserTicket {
    private int roomNumberInt;
    private String dateArriving;
    private String dateLeaving;
    private int numOfBeds;

    //++ printTicket(): String
    public HotelTicket(int roomNumberInt, String dateArriving, String dateLeaving, int numOfBeds) { 
    this.roomNumberInt = roomNumberInt;
    this.dateArriving = dateArriving;
    this.dateLeaving = dateLeaving;
    this.numOfBeds = numOfBeds;
    }
        
    public String printTicket() {
        return "Room Number: " + roomNumberInt
                + "\nArrival Date: " + dateArriving
                + "\nDeparture Date: " + dateLeaving
                + "\nNumber of Beds: " + numOfBeds;
    }
}
