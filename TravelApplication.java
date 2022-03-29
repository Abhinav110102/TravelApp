import java.util.ArrayList;

public class TravelApplication {
//     - users: AllUsers
// - flights: AllFlights
// - hotels: AllHotels
// - currentUser: User
// - database: Database
private AllUsers users;
private AllFlights flights;
private AllHotels hotels;
private User currentUser;
private Database database;


// - TravelApplication()
// + getInstance(): TravelApplication()
// - login(String username, String password): String
// - signUp(String username, String password): String
// - logout(): String
// + addUser(String age): void
// + Search(String input): Ticket
// + Booking(Ticket): void 
// - addTicketToUser(Ticket): void
// - updateTicket(Flight): void
// - updateTicket(Hotel): void
// - printTickets(): String
// + displayOptions(): String
// + inputOption(int input): String
// + displayAvailableMonth(int month): void
// + displayUserID(): String

//private TravelApplication();
public static TravelApplication getInstance(){
    ;
}
private String login(){
    ;
}
private String login(String username,String password) {
    ;
}
private String signUp(String username,String password){
    ;
}
private String Logout(){
    ;
}
public void addUser(String age){
    ;
}
public String Search(String input){
    String results = "";
    ArrayList<Flight> flightsToSearch = flights.getFlights();
    for (int i = 0; i < flightsToSearch.size(); i++) {
        if (flightsToSearch.get(i).getDestinationAirport().equals("input")) {
            results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        } else if (flightsToSearch.get(i).getArrivalAirport().equals("input")) {
            results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        }

    }
    return results;
}
public void Booking(Ticket){
    ;
}
private void addTicketToUser(Ticket){
    ;
}
private void updateTicket(Flight){
    ;
}
private void updateTicket(Hotel){
    ;
}
private String printTicket(){
    ;
}
public String displayOptions(){
    ;
}
public String inputOption(int input){
    ;
}
public void displayAvailableMonth(int month){
    ;
}
public String displayUserID(){
    ;
}
}
