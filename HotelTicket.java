import java.util.Date;

public class HotelTicket extends UserTicket {
    private int roomNumberInt;
    private String dateArriving;
    private String dateLeaving;
    private String roomNumberString;
    private int numOfBeds;

    //++ printTicket(): String
    public HotelTicket(int roomNumberInt, String dateArriving, String dateLeaving, String roomNumberString, int numOfBeds) { 
    this.roomNumberInt = roomNumberInt;
    this.dateArriving = dateArriving;
    this.dateLeaving = dateLeaving;
    this.roomNumberString = roomNumberString; 
    this.numOfBeds = numOfBeds;
    }
        
    public String printTicket() {
        return "";
    }
}
