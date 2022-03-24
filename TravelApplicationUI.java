import java.util.Scanner;

// - scanner: Scanner
public class TravelApplicationUI {
    private Scanner scanner = new Scanner(System.in);
    
// + TravelApplicationUI()
// + run(): void
// + printOptions(): void
// + main(): void
    public TravelApplicationUI(){
        Scanner scanner = new Scanner(System.in);
    }
    public void run() {
        int option = 0;
        System.out.println("Welcome to our Booking App!");
        while (true) {
            printOptions();
            System.out.println("What would you like to do?:");
            option = scanner.nextInt();

            switch(option) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
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
