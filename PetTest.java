import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PetTest {
    @Test
    public void testPetTicketNeeded() {
        Pet pet = new Pet("Lance", 37, 12);
        assertTrue(pet.ticketNeeded());
    }
    @Test
    public void testPetTicketNotNeeded() {
        Pet pet = new Pet("Vance", 33, 8);
        assertFalse(pet.ticketNeeded());
    }
}
