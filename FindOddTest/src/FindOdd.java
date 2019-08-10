public class FindOdd {
    public static int findIt(int[] a) {
        int odd=0;

        for(int i = 0 ; i < a.length; i++){
            for( int j = 0; j < a.length ; j++){
                if(a[i] == a[j])
                    odd ++;
            }
            if(odd %2 != 0){
                odd = a[i];
                break;
            }
        }


        return odd;
    }
}