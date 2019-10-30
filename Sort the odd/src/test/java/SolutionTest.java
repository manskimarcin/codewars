import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {
    /*
        You have an array of numbers.
        Your task is to sort ascending odd numbers but even numbers must be on their places.
        0 isn't an odd number and you don't have to move it
        If you have an empty array, you need to return it.
     */

    @Test
    public void Test_kata_mixed_array_with_positive_elements(){
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void Test_kata_mixed_array_with_negative_elements(){
        assertArrayEquals(new int[]{-5, -3, -3, -8, -1}, Kata.sortArray(new int[]{-5, -3 , -1, -8, -3}));
    }

    @Test
    public void Test_kata_mixed_array_with_positive_and_negative_elements(){
        assertArrayEquals(new int[]{0, -5, 1, 8, 3}, Kata.sortArray(new int[]{0, 3 , 1, 8, -5}));
    }

    @Test
    public void Test_kata_odd_array(){
        assertArrayEquals(new int[]{-7, -3, 5, 9, 11}, Kata.sortArray(new int[]{11, -7 , 5, -3, 9}));
    }

    @Test
    public void Test_kata_equal_array(){
        assertArrayEquals(new int[]{2, 6 , -2, 10, 22}, Kata.sortArray(new int[]{2, 6 , -2, 10, 22}));
    }

    @Test
    public void Test_kata_empty_array(){
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }
}
