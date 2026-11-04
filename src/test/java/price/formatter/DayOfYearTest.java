package refactoring;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import java.time.DateTimeException;

public class DayOfYearTest {
    @Test
    void testJanuaryFirst(){
        assertEquals(1, DayOfYear.dayOfYear(1, 1, 2025));
    }
    @Test
    void testMarchFirst(){
        assertEquals(60, DayOfYear.dayOfYear(3, 1, 2025));
    }

    @Test
    void testLeapYear(){
        assertEquals(61, DayOfYear.dayOfYear(3, 1, 2024));
    }
    
    @Test
    void testDecemberFirst(){
        assertEquals(365, DayOfYear.dayOfYear(12, 31, 2025));
    }

    @Test 
    void testInvalidDate(){
        assertThrows(DateTimeException.class,() -> DayOfYear.dayOfYear(2, 30, 2025));
    }
}
