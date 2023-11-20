import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    private RomanToInteger romanToInteger;
    @BeforeEach
    void setUp() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    void romanToIntegerTest() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}