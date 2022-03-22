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


    // - address: Location
    // - tickets: ArrayList<Ticket>
    // - flights: ArrayList<Flight>
    // - hotels: ArrayList<Hotel>
    // - friends: ArrayList<User>
    // - family: ArrayList<Family>
    public User (String username, String firstName, String lastName, String userID,
                int phone, String email, int userAge, int passportNumber, String password,
                String[] address, String[] friends, String[][] family, boolean senior) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = userID;
        this.phoneNumber = phone.toString();
        this.email = email;
        this.age = userAge;
        this.passportNumber = passportNumber.toString;
        this.password = password;
        this.address = address;
        this.friends = friends;
        this.family = family;
        this.senior = senior;
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

