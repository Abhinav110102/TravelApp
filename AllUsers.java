import java.util.ArrayList;
import java.util.UUID;

public class AllUsers {

    private static AllUsers allUsers = null;
    private static ArrayList <User> users = new ArrayList<>();

    // + logout: void
    private AllUsers() {}

    /**
     * Method to return an instance of itself.
     * @return allUsers the object to be returned.
     */
    public static AllUsers getInstance() {
        if (allUsers == null) {
			allUsers = new AllUsers();
		}
		return allUsers;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    /**
     * Constructor
     */
    public void addUser(String username, String firstName, String lastName,
    int phone, String email, int userAge, int passportNumber, String password,
    ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        String userID = UUID.randomUUID().toString();
        User user = new User(username, firstName, lastName, userID, phone, email, userAge, passportNumber, password,
        address, friends, family, senior);
        users.add(user);
    }

    public void logout() {
        DataWriter.saveUsers();;
    }

}
