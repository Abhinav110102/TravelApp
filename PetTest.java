public class PetTest {
    public void testPetTicketNeeded() {
        Pet pet = new Pet("Lance", 37, 12);
        assertTrue(pet.ticketNeeded());
    }

    public void testPetTicketNotNeeded() {
        Pet pet = new Pet("Vance", 33, 8);
        assertFalse(pet.ticketNeeded());
    }
}
