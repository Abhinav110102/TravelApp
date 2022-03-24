import java.util.ArrayList;

public class AllUsers {

    private AllUsers allUsers;
    private ArrayList <User> users;

    // + logout: void
    private AllUsers() {}

    /**
     * Method to return an instance of itself.
     * @return allUsers the object to be returned.
     */
    public AllUsers getInstance() {
        if (allUsers == null) {
			allUsers = new AllUsers();
		}
		return allUsers;
    }

    /**
     * Constructor
     */
    public void addUser(String username, String firstName, String lastName, String userID,
    int phone, String email, int userAge, int passportNumber, String password,
    ArrayList<String> address, ArrayList<String> friends, ArrayList<ArrayList<String>> family, boolean senior) {
        User user = new User(username, firstName, lastName, userID, phone, email, userAge, passportNumber, password,
        address, friends, family, senior);
        users.add(user);
    }

    public void logout() {
        DataWriter.saveUsers();;
    }

}
