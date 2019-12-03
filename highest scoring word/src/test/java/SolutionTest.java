import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void sampleTests() {

//        System.out.println(Kata.high("oprstuw abcde efghi jklmn"));
        assertEquals("taxi", Kata.high("man i need a taxi up to ubud"));
        assertEquals("volcano", Kata.high("what time are we climbing up to the volcano"));
        assertEquals("semynak", Kata.high("take me to semynak"));
    }
}