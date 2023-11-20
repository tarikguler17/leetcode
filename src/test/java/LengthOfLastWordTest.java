import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LengthOfLastWordTest {
    private LengthOfLastWord lengthOfLastWord;

    @BeforeEach
    void setUp() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    void test() {
        int actual = lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  ");
        assertEquals(4, actual);
    }
}