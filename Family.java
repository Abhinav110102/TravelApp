/**
 * @author Mark Valentino
 * @add stub creator as author?
 */
public class Family {
//     - firstName: String
// - lastName: String 
// - age: int

    private String firstName;
    private String lastName;
    private int age;


// (for those under the age of 18)
// + Family(String name, int age)
// + ticketNeeded(): bool
    public Family(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    /**
     * Method to determine wether a ticket is needed.
     * @return true if age >= 18
     */
    public boolean ticketNeeded() {
        return age >= 18;
    }
}

