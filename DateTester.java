import static org.junit.jupiter.api.Assertions.*;

public class DateTester {
    Date date = new Date(9, 7, 2022);
    
    public void testConvertToMonth() {
        assertTrue(date.convertToMonth() == "July");
    }
}
