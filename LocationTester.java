import static org.junit.jupiter.api.Assertions.*;

public class LocationTester {
    public void testAnyEquals() {
        Location location = new Location("Main Street", "Salt Lake City", "Utah", "84044", "United States");
        assertTrue(location.anyEquals("Utah"));
    }

    public void testAnyEqualsInvalid() {
        Location location = new Location("Main Street", "Salt Lake City", "Utah", "84044", "United States");
        assertFalse(location.anyEquals("Steelport"));
    }

    public void testAnyEqualsEmpty() {
        Location location = new Location("", "", "", "", "");
        assertTrue(location.anyEquals(""));
    }

    public void testAnyEqualsNull() {
        Location location = new Location(null, null, null, null, null);
        assertTrue(location.anyEquals(null));
    }
}
