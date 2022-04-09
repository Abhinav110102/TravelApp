import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UsersTester {
    private AllUsers users = AllUsers.getInstance();
    private ArrayList<User> userList = users.getUsers();
	
	@BeforeEach
	public void setup() {
		userList.clear();
		userList.add(new User());
		userList.add(new User());
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		users.getInstance().getUsers().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testHaveUserValidFirstItem() {
		boolean hasAmy = users.haveUser("asmith");
		assertTrue(hasAmy);
	}
	
	@Test
	void testHaveUserValidLastItem() {
		boolean hasBob = users.haveUser("bwhite");
		assertTrue(hasBob);
	}
	
	@Test
	void testHaveUserInValid() {
		boolean hasJoe = users.haveUser("jsmith");
		assertFalse(hasJoe);
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
