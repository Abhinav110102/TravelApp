import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LuggageTest {
    @Test
    public void testIsOver50() {
        Luggage luggage = new Luggage("djsgh4574976", "jgid458745798", 55);
        assertTrue(luggage.isOver50(luggage.getWeight()));
    }

    @Test
    public void testIsNotOver50() {
        Luggage luggage = new Luggage("djsgh4574976", "jgid458745798", 20);
        assertFalse(luggage.isOver50(luggage.getWeight()));
    }
}
