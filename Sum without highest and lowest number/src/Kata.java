import java.util.Arrays;

public class Kata
{
    public static int sum(int[] numbers) {

        if(numbers == null || numbers.length == 0 || numbers.length == 1)   return 0;
        int sum = Arrays.stream(numbers).sum();
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        return sum - max - min;


        }
}