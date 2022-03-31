import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class for implenting a user interface for the TravelApplication.
 * @author Mark Valentino
 */
public class TravelApplicationUI {
    private Scanner scanner;
    private TravelApplication travelApplication; // NOT IN UML
    
    /**
     * Constructor
     */
    public TravelApplicationUI(){ 
        this.scanner = new Scanner(System.in);
        travelApplication = TravelApplication.getInstance();
        //TravelApplication travelApplication = new TravelApplication();
    }

    /**
     * Method to run the UI. Calls printOptions() method.
     */
    public void run() {
        int option = 0;
        boolean inApp = true;
        System.out.println("Welcome to our Booking App!");
        while (inApp) {
            printOptions();
            System.out.println("What would you like to do?:");
            option = scanner.nextInt();
            if (travelApplication.getCurrentUser() == null) {
                inApp = guest(option);
            } else {
                inApp = registeredUser(option);
            }
        }
        this.scanner.close();
    }

    /**
     * Method to print options of input in UI.
     */
    public void printOptions(){
        if (travelApplication.getCurrentUser() == null) {
            System.out.println("************ Main Menu ************");
            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Book a Flight");
            System.out.println("4. Book a Hotel");
            System.out.println("5. Quit app"); 
            return;
        }
        System.out.println("************ Main Menu ************");
        System.out.println("1. Book a Flight");
        System.out.println("2. Book a Hotel");
        System.out.println("3. Check Accout Profile");
        System.out.println("4. Logout");
        System.out.println("5. Quit app"); 
    }

    public boolean guest(int option) { // returns false if you quit the system.
        switch(option) {
            case 1:
                //login
                if (login()) {
                    System.out.println("Login Successful");
                    System.out.println("Welcome " + travelApplication.getCurrentUser().getFirstName() + "!");
                } else {
                    System.out.println("Login Unsuccessful");
                }
                break;
            case 2:
                    if (signUp()) {
                        System.out.println("Sign Up Successful");
                        System.out.println("Welcome " + travelApplication.getCurrentUser().getFirstName() + "!");
                    } else {
                        System.out.println("Sign Up Unsuccessful");
                    }
                break;
            case 3:
                bookFlight();
                break;
            case 4:
                bookHotel();
                break;
            case 5:
                travelApplication.quit();
                System.out.println("Goodbye!");
                scanner.close();
                return false;
                // insert code to save to json?
                //travelApplication.Logout();
            default:
                System.out.println("Sorry! That's not an option, please try again: ");
        }
        return true;
    }

    public boolean registeredUser(int option) { // returns false if you quit the system
        switch(option) {
            case 1:
                bookFlight();
                break;
            case 2:
                bookHotel();
                break;
            case 3:
                //checkAccount();
                break;
            case 4:
                logout();
                break;
            case 5:
                travelApplication.quit();
                System.out.println("Goodbye!");
                scanner.close();
                return false;
            default:
                System.out.println("Sorry! That's not an option, please try again: ");
        }
        return true;
    }

    /** / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
     * login Method
     * returns
     */
    public boolean login() {
        int attempts = 0;
        boolean loop = true;
        String usernameInput = "";
        String passwordInput = "";
        scanner.nextLine();
        while (attempts < 5 && loop) {
            System.out.println("Enter your username:");
            usernameInput = scanner.nextLine();
            if (travelApplication.checkUsername(usernameInput)) {
                loop = false;
            } else {
                System.out.println("Incorrect Username. Please Try Again");
                attempts++;
            }
        }
        if (attempts == 5) { 
            System.out.println("Error Logging in: Too many failed attempts. Please Try again later");
            return false;
        }

        attempts = 0;
        while (attempts < 5) {
            System.out.println("Enter your password:");
            passwordInput = scanner.nextLine();
            if (travelApplication.login(usernameInput, passwordInput)) {
                return true;
            } else {
                System.out.println("Incorrect Password. Please Try Again");
                attempts++;
            }
        }
        System.out.println("Error Logging in: Too many failed attempts. Please Try again later");
        return false;
    }

    // Sign up Method / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public boolean signUp() {
        boolean loop = true;
        String username = "";
        String password, firstName, lastName, phone, email, passportNum, street, city, state, zipcode, country;
        int age;

        System.out.println("Before we can start creating your account, please enter your age:");
        scanner.nextLine();
        age = scanner.nextInt();

        if (age < 18) {
            System.out.println("I'm sorry, but you're too young to make an account.\nAdults with accounts can add you to their account and book for you!");
            return false;
        }

        
        scanner.nextLine();
        while (loop) {
            System.out.println("Enter a username:");
            username = scanner.nextLine();
            if (!travelApplication.checkUsername(username)) {
                loop = false;
            } else {
                System.out.println("That username is taken. Please Try Again");
            }
        }

        loop = true;
        System.out.println("Enter a Password:");
        password = scanner.nextLine();

        System.out.println("Enter your first name:");
        firstName = scanner.nextLine();

        System.out.println("Enter your last name:");
        lastName = scanner.nextLine();

        System.out.println("Enter your phone number:");
        phone = scanner.nextLine();

        System.out.println("Enter your email:");
        email = scanner.nextLine();

        System.out.println("Enter your passport number:");
        passportNum = scanner.nextLine();

        System.out.println("Enter your street of residence:");
        street = scanner.nextLine();

        System.out.println("Enter your city of residence:");
        city = scanner.nextLine();

        System.out.println("Enter your state of residence:");
        state = scanner.nextLine();
        
        System.out.println("Enter your zipcode of residence:");
        zipcode = scanner.nextLine();

        System.out.println("Enter your country of residence:");
        country = scanner.nextLine();

        travelApplication.signUp(username, password, firstName, lastName, phone, email, passportNum, street, city, state, zipcode, country, age);
        System.out.println("Signed up!!");
        return true;
    }

    // Book Flight / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public void bookFlight() {
        String searchInput;
        int bookingOption;
        scanner.nextLine();
        System.out.println("Where would you like to fly to or from?");
        searchInput = scanner.nextLine();
        ArrayList<Flight> flightResults = travelApplication.SearchFlights(searchInput);
        for (int i = 0 ; i < flightResults.size(); i++){
            System.out.println(i + ". " + flightResults.get(i).toString());
        }
        if (flightResults.size() == 0) {
            System.out.println("No flights available. Maybe try chicago");
            return;
        }
        System.out.println("Which flight would you like to book?");
        bookingOption = scanner.nextInt();
        travelApplication.Booking(flightResults.get(bookingOption));
    }

    // Book Hotel / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / / /
    public void bookHotel() {
        int bookingOption;
        String searchInput;
        scanner.nextLine();
        System.out.println("Where would you like to book a hotel?");
        searchInput = scanner.nextLine();
        ArrayList<Hotel> hotelResults = travelApplication.SearchHotels(searchInput);
        for (int i = 0 ; i < hotelResults.size(); i++){
            System.out.println(i + ". " + hotelResults.get(i).toString());
         }
         System.out.println("Which hotel would you like to book?");
         bookingOption = scanner.nextInt();
         travelApplication.Booking(hotelResults.get(bookingOption));
         // Search() method only works for flights for now.
         //travelApplication.Search(searchInput);
    } 

    // Check account
    public void checkAccout() {
        boolean checkingAccount = true;
        while (checkingAccount) {

        }
    }



    //logout
    public void logout() {
        travelApplication.logout();
    }

    
    /**
     * Method main for running the entire Application.
     */
    public static void main(String[] args) {
        TravelApplicationUI travelApplicationUI = new TravelApplicationUI();
        travelApplicationUI.run();
    }
}
