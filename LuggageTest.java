import static org.junit.jupiter.api.Assertions.*;

public class LuggageTest {
    public void testIsOver50() {
        Luggage luggage = new Luggage("djsgh4574976", "jgid458745798", 55);
        assertTrue(luggage.isOver50(luggage.getWeight()));
    }

    public void testIsNotOver50() {
        Luggage luggage = new Luggage("djsgh4574976", "jgid458745798", 20);
        assertFalse(luggage.isOver50(luggage.getWeight()));
    }
}
