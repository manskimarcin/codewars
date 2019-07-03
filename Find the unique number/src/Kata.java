public class Kata {

    public static void main(String[] args){
        System.out.println(findUniq(new double[]{0, 1, 0}));
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }

    public static double findUniq(double arr[]) {

        double result=0;

        for(int i = 0; i < arr.length; i++){
            int counter=0;
            for(int j = 0; j < arr.length; j++){
                if(arr[i] == arr[j] && i != j )
                    counter ++;
            }
            if(counter == 0)
                result = arr[i];
                //continue;
        }
        return result;
    }

}