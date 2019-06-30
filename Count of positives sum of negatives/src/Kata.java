public class Kata
{
    public static int[] countPositivesSumNegatives(int[] input)
    {
        int positives = 0, negatives = 0;

        for(int element: input){
            System.out.print(element+", ");
        }
        System.out.println();

        for(int i : input){
            if(i >0){
                positives = positives +1;
            //    System.out.println(positives);
            }
            else{
                negatives = negatives  + i;
             //   System.out.println(negatives);
            }
        }
        //int[] result ={positives,negatives};
        System.out.println(positives+"\t"+negatives);
        return  new int[]{positives, negatives};
    }

}