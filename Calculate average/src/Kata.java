import java.util.Arrays;

public class Kata {
    public static void main(String[] args) {
        System.out.println(find_average(new int[]{1, 2, 3}));
    }

    public static double find_average(int[] array) {
        return Arrays.stream(array).average().orElse(0);

    }
}
