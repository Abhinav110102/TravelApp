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
//private Database database;
private static TravelApplication travelApplication;

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

private TravelApplication() {
  users = AllUsers.getInstance();
  flights = AllFlights.getInstance();
  hotels = AllHotels.getInstance();
  this.currentUser = null;
}
public static TravelApplication getInstance(){
    if (travelApplication == null) {
        travelApplication = new TravelApplication();
    }
    return travelApplication;
}


// Login methods / / / / / / / / / / / / / / / / / / / / / / / / / / /
public boolean checkUsername(String username) {
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            return true;
        }
    }
    return false;
}

public boolean login(String username, String password) {
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            if (user.getPassword().equals(password)) {
                return true;
            }
            return false; // password is wrong
        }
    }
    return false; // password or username is wrong
}


// Sign up methods / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / 
private void signUp(String usernameInput, String passwordInput, String firstName, String lastName, String phone, String email, 
                        String passportNum, String street, String city, String state, String zipcode, String country, int age) {
    users.addUser(usernameInput, passwordInput, firstName, lastName, phone, email, passportNum, street, city, state, zipcode, country, age);
    
    
}

// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
private void Logout(){
    ;
}
public void addUser(String age){
    ;
}
public ArrayList<Flight> Search(String input){
    //String results = "";
    ArrayList<Flight> flightsToSearch = flights.getFlights();
    ArrayList<Flight> flightResults;
    for (int i = 0; i < flightsToSearch.size(); i++) {
        if (flightsToSearch.get(i).destinationAirport.equals("input")) {
            flightResults.add(flightsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        } else if (flightsToSearch.get(i).arrivalAirport.equals("input")) {
            flightResults.add(flightsToSearch.get(i));
            //results += flightsToSearch.get(i).getStartLocation() + " " + flightsToSearch.get(i).getEndLocation() + "\n";
        }

    }
    return flightResults;
}
public void Booking(Ticket ticket){
    ;
}
private void addTicketToUser(Ticket ticket){
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
