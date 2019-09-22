public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        if(input == null || input.length ==0)
            return new int[]{};

        int count = 0, negatives = 0;

        for(int i = 0; i < input.length; i++){
            System.out.println(input[i]);
            if(input[i] > 0)
                count++;
            else
                negatives += Math.abs(input[i]);
        }

        return  new int[]{count,-negatives};
    }
}

