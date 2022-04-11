import static org.junit.jupiter.api.Assertions.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DateTester {
    Date date = new Date(9, 7, 2022);
    
    @Test
    public void testConvertToMonth() {
        assertTrue(date.convertToMonth() == "July");
    }
}
