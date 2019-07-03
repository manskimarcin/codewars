public class Kata
{
    public static void main(String[] args){
        System.out.println(squareSum(new int[] {1,2,2}));
        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5,-3,4}));
    }

    public static int squareSum(int[] n)
    {
        int sum=0;

        for(int i = 0 ; i < n.length; i++){
            sum = sum + n[i]*n[i];
        }

        return sum;
    }
}