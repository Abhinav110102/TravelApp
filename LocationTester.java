import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LocationTester {
    @Test
    public void testAnyEquals() {
        Location location = new Location("Main Street", "Salt Lake City", "Utah", "84044", "United States");
        assertTrue(location.anyEquals("Utah"));
    }

    @Test
    public void testAnyEqualsInvalid() {
        Location location = new Location("Main Street", "Salt Lake City", "Utah", "84044", "United States");
        assertFalse(location.anyEquals("Steelport"));
    }

    @Test
    public void testAnyEqualsEmpty() {
        Location location = new Location("", "", "", "", "");
        assertTrue(location.anyEquals(""));
    }

    @Test
    public void testAnyEqualsNull() {
        Location location = new Location("", null, "", "", "");
        assertTrue(location.anyEquals(null));
    }
}
