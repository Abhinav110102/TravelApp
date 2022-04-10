import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AllUsersTester {
    private AllUsers users = AllUsers.getInstance();
    private ArrayList<User> userList = users.getUsers();
	
	@BeforeEach
	public void setup() {
		userList.clear();

		Location address1 = new Location("Rain Street", "Jefferson City", "Missouri", "65043", "United States");

		ArrayList<String> friends1 = new ArrayList<String> ();
		friends1.add("hgrfy59658");
		friends1.add("fjkgh6850j");

		ArrayList<ArrayList<String>> family1 = new ArrayList<ArrayList<String>> ();
		family1.get(0).add("Amanda");
		family1.get(0).add("Munny");
		family1.get(0).add("66");

		Location address2 = new Location("Ocean Avenue", "Liberty City", "Florida", "33125", "United States");

		ArrayList<String> friends2 = new ArrayList<String> ();
		friends2.add("dkggkh56895");
		friends2.add("gjfk6950653");

		ArrayList<ArrayList<String>> family2 = new ArrayList<ArrayList<String>> ();
		family2.get(0).add("Philip");
		family2.get(0).add("Talbot");
		family2.get(0).add("32");

		userList.add(new User("williammunny1975", "William", "Munny", "fjhiu587087", "8039999999", "williammunny@gmail.com", 45,
								"95683020", "kjh8780b345", address1, friends1, family1, false));
		userList.add(new User("George Talbot", "George", "Talbot", "djgh47678576", "8034558008", "gtalbot@protonmail.com", 24,
								"38540234", "458hg95y800", address1, friends2, family2, false));
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		users.getInstance().getUsers().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		boolean hasWilliam = users.haveUser("williammunny1975");
		assertTrue(hasWilliam);
	}
	
	@Test
	void testHaveUserValidLastItem() {
		boolean hasGeorge = users.haveUser("George Talbot");
		assertTrue(hasGeorge);
	}
	
	@Test
	void testHaveUserInValid() {
		boolean hasPiggsy = users.haveUser("Piggsy");
		assertFalse(hasPiggsy);
	}
	
	@Test
	void testHaveUserEmpty() {
		boolean hasEmpty = users.haveUser("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveUserNull() {
		boolean hasNull = users.haveUser(null);
		assertFalse(hasNull);
	}
}
