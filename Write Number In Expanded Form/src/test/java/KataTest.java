import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KataTest {

    @Test
    public void testSomething() {
        assertEquals("900000", Kata.expandedForm(900000));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
    }


}