import java.util.ArrayList;

public class User {
    private String ID;
    private String username;
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String passportNumber;
    private String phoneNumber;
    private int age;
    //private ArrayList<Ticket> tickets;
    private ArrayList<Flight> flights;
    private ArrayList<Hotel> hotels;
    private ArrayList<User> friends;
    private ArrayList<Family> family;
    private boolean senior;

    //Variables from JSON Files
    private String username;
    private String firstName;
    private String lastName;
    private String userID;
    private int phone;
    private String email;
    private int userAge;
    private int passportNumber;
    private String password;
    private ArrayList<String> address;
    private ArrayList<String> friends;
    private ArrayList<ArrayList<String>> family;
    private boolean senior;

    // - address: Location
    // - tickets: ArrayList<Ticket>
    // - flights: ArrayList<Flight>
    // - hotels: ArrayList<Hotel>
    // - friends: ArrayList<User>
    // - family: ArrayList<Family>
    public User (String username, String firstName, String lastName, String userID,
                int phone, String email, int userAge, int passportNumber, String password,
                ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = userID;
        this.phoneNumber = Integer.toString(phone);
        this.email = email;
        this.age = userAge;
        this.passportNumber = Integer.toString(passportNumber);
        this.password = password;
        this.address = address;
        this.friends = friends;
        this.family = family;
        this.senior = senior;
    }

    public String getUserName() {
        return username;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getUserID() {
        return userID;
    }

    public int getPhoneNumber() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public int getUserAge() {
        return userAge;
    }

    public int getPassportNumber() {
        return passportNumber;
    }

    public String getPassword() {
        return password;
    }

    public ArrayList<String> getAddress() {
        return address;
    }

    public ArrayList<String> getFriends() {
        return friends;
    }

    public ArrayList<ArrayList<String>> getFamily() {
        return family;
    }

    public boolean isOver50() {
        return senior;
    }

    public void registerLuggage() {
        ;
    }

    public void addTicket() {
        ;
    }

    public void requestRefund() {
        ;
    }

    public void printAllTickets() {
        ;
    }
    
    public void printFlights() {
        ;
    }

    public void printHotels() {
        ;
    }

    public void addFriend(User user) {
        ;
    }

    public void addRating(String Username, int rating, boolean isNameVisible) {
        ;
    }

    public int calCost() {
        ;
    }

    // + addDeal(): Deal
    // + registerLuggage(): void
    // + addTicket(Ticket): void
    // + requestRefund(): void
    // + printAllTickets(): void
    // + printFlights(): void
    // + printHotels(): void
    // + addFriend(User user): void
    // + addRating(String username, int rating, boolean isNameVisible)
    // + calCost(): int //frequent flyer and senior
}

