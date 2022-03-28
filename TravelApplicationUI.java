import java.util.Scanner;

public class TravelApplicationUI {
    private Scanner scanner = new Scanner(System.in);
    private TravelApplication travelApplication; // NOT IN UML
    
    public TravelApplicationUI(){
        Scanner scanner = new Scanner(System.in);
        TravelApplication travelApplication = new TravelApplication();
    }

    public void run() {
        int option = 0;
        String usernameInput;
        String passwordInput;
        String searchInput;
        System.out.println("Welcome to our Booking App!");
        while (true) {
            printOptions();
            System.out.println("What would you like to do?:");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    System.out.println("Enter your username:");
                    usernameInput = scanner.nextLine();
                    System.out.println("Enter your password:");
                    passwordInput = scanner.nextLine();
                    travelApplication.login(usernameInput, passwordInput);
                    break;
                case 2:
                    System.out.println("Enter a username:");
                    usernameInput = scanner.nextLine();
                    System.out.println("Enter a password:");
                    passwordInput = scanner.nextLine();
                    travelApplication.singup(usernameInput, passwordInput);
                    break;
                case 3:
                    System.out.println("Where would you like to fly to?");
                    searchInput = scanner.nextLine();
                    travelApplication.Search(searchInput);
                    break;
                case 4:
                    System.out.println("Where would you like to book a hotel?");
                    searchInput = scanner.nextLine();
                    travelApplication.Search(searchInput);
                    break;
                case 5:
                    // insert code to save to json and a system.exit(0)
                    break;
                default:
                    System.out.println("Sorry! That's not an option, please try again: ");
            }
        }
    }

        

        
    public void printOptions(){
        System.out.println("************ Main Menu ************");
        System.out.println("1. Login");
        System.out.println("2. Sign up");
        System.out.println("3. Book a Flight");
        System.out.println("4. Book a Hotel");
        System.out.println("5. Quit app");
        
    }

    public static void main(String[] args) {
        TravelApplicationUI travelApplicationUI = new TravelApplicationUI();
        travelApplicationUI.run();

    }


}
