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
private boolean checkUsername(String username) {
    for (User user : users.getUsers()) {
        if(user.getUserName().equals(username)) {
            return true;
        }
    }
    return false;
}

private boolean login(String username, String password) {
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
private boolean signUp(String username,String password){
    ;
}

// / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
private void Logout(){
    ;
}
public void addUser(String age){
    ;
}
public Ticket Search(String input){
    ;
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
