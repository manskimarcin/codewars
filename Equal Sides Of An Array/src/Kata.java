public class Kata {
    public static int findEvenIndex(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int sumL = 0, sumR = 0 ;
            for(int l = 0; l < i; l++){
                sumL += arr[l];
            }
            for(int r = i+1; r < arr.length; r++){
                sumR += arr[r];
            }
            if(sumL == sumR)
                return i;
        }
        return -1;
    }
}
