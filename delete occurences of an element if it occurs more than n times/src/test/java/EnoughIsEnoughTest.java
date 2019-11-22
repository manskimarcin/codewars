import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class EnoughIsEnoughTest {

    @Test
    void checkArrayWithZeoOccurrences() throws Exception{
        assertArrayEquals(
                new int[]{},
                EnoughIsEnough.deleteNth(new int[]{20,37,20,21},0)
        );
    }

    @Test
    void checkArrayWithOneOccurrences() throws Exception{
        assertArrayEquals(
                new int[]{20,37,21},
                EnoughIsEnough.deleteNth(new int[]{20,37,20,21},1)
        );
    }

    @Test
    void checkArrayWithTwoOccurrences() throws Exception{
        assertArrayEquals(
                new int[]{1, 13, 2, 1, 2, 3, 4, 5, 13},
                EnoughIsEnough.deleteNth(new int[]{1, 13, 2, 1, 2, 3, 4, 5, 13, 1, 2},2)
        );
    }

    @Test
    void checkArrayWithThreeOccurrences() throws Exception{
        assertArrayEquals(
                new int[]{},
                EnoughIsEnough.deleteNth(new int[]{},3)
        );
    }
}