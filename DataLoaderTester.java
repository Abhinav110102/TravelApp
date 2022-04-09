import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DataLoaderTester {
	private AllUsers users = AllUsers.getInstance();
	private ArrayList<User> userList = users.getUsers();
	
	@BeforeEach
	public void setup() {
		userList.clear();
		userList.add(new User("asmith", "Amy", "Smith", 19, "803-454-3344"));
		userList.add(new User("bwhite", "Bob", "White", 23, "803-333-3544"));
		DataWriter.saveUsers();
	}
	
	@AfterEach
	public void tearDown() {
		AllUsers.getInstance().getUsers().clear();
		DataWriter.saveUsers();
	}
	
	
	@Test
	void testGetUsersSize() {
		userList = DataLoader.getUsers();
		assertEquals(2, userList.size());
	}

	@Test
	void testGetUsersSizeZero() {
		AllUsers.getInstance().getUsers().clear();
		DataWriter.saveUsers();
		assertEquals(0, userList.size());
	}
	
	@Test
	void testGetUserFirstUserName() {
		userList = DataLoader.getUsers();
		assertEquals("asmith", userList.get(0).getUserName());
	}
}
}
