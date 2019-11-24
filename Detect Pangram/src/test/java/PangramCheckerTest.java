import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PangramCheckerTest {
    @Test
    void testCorrectPangram(){
        String pangram = "The quick brown fox jumps over the lazy dog";
        PangramChecker pangramChecker = new PangramChecker();
        assertEquals(true, pangramChecker.check(pangram));
    }

    @Test
    void testInvalidPangram(){
        String pangram = "You shall not pass!";
        PangramChecker pangramChecker = new PangramChecker();
        assertEquals(false, pangramChecker.check(pangram));
    }

}