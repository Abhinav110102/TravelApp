/**
 * @author Mark Valentino, Samuel Godfrey, Abhinav Myadala
 */
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AllLuggagesTester {
    private AllLuggages luggages = AllLuggages.getInstance();
    private ArrayList<Luggage> luggageList = luggages.getLuggages();
	
	@BeforeEach
	public void setup() {
		luggageList.clear();
		luggageList.add(new Luggage("gfkhdgh657579", "dhjsghhj6597659", 30));
		luggageList.add(new Luggage("djsgh7459640", "ggfsh3643534767", 45));
		DataWriter.saveLuggages();
	}
	
	@AfterEach
	public void tearDown() {
		luggages.getInstance().getLuggages().clear();
		DataWriter.saveLuggages();
	}
	
	
	@Test
	void testHaveLuggageValidFirstItem() {
		boolean has_gfkhdgh657579 = luggages.haveLuggage("gfkhdgh657579");
		assertTrue(has_gfkhdgh657579);
	}
	
	@Test
	void testHaveLuggageValidLastItem() {
		boolean has_djsgh7459640 = luggages.haveLuggage("djsgh7459640");
		assertTrue(has_djsgh7459640);
	}
	
	@Test
	void testHaveLuggageInValid() {
		boolean hasWeaponsOfMassDestruction = luggages.haveLuggage("Weapons of Mass Destruction");
		assertFalse(hasWeaponsOfMassDestruction);
	}
	
	@Test
	void testHaveLuggageEmpty() {
		boolean hasEmpty = luggages.haveLuggage("");
		assertFalse(hasEmpty);
	}
	
	@Test
	void testHaveLuggageNull() {
		boolean hasNull = luggages.haveLuggage(null);
		assertFalse(hasNull);
	}
}
