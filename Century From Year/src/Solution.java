public class Solution {
    public static int century(int number) {
        if(number%100 > 0)
            return number/100 + 1;
        else
            return number/100;
    }
}