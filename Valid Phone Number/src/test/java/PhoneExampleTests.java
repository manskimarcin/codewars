
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneExampleTests {
    @Test
    public void test1() {
        assertEquals(true, Kata.validPhoneNumber("(123) 456-7890"));
    }

    @Test
    public void tests2() {
        assertEquals(false, Kata.validPhoneNumber("(1111)555 2345"));
    }

    @Test
    public void tests3() {
        assertEquals(false, Kata.validPhoneNumber("(098) 123 4567"));
    }
}