import java.util.Arrays;

public class Kata {

    public static void main(String[] args){
       // sortArray(new int[]{ 5, 3, 2, 8, 1, 4 });
        sortArray(new int[]{ 5, 3, 1, 8, 0 });
    }

    public static int[] sortArray(int[] array) {

        int[] odd = new int[array.length];
        int[] even = new int[array.length];
        int[] result = new int[array.length];

        for(int a: array){
            System.out.println("Array: "+a);
        }

        for(int i = 0; i < array.length; i++){
            if(array[i]%2 !=0)
                odd[i] = array[i];
            else
                even[i] = array[i];
        }

        Arrays.sort(odd);
        int index =0;

        for(int i =0; i< odd.length; i++){
            if(odd[i] != 0 ){
                index = i;
                break;
            }

        }
        int counter =0;

        for(int i = 0; i < array.length; i++){
            if(even[i] != 0)
                result[i] = even[i];
            else {
                if ((counter + index) < array.length) {
                    result[i] = odd[counter + index];
                    counter++;
                }
            }
        }

//        for(int i = 0; i < odd.length; i++){
////            if
////        }

        for(int a: odd){
            System.out.println("Odd: "+a);
        }

        for(int a: even){
            System.out.println("Even: "+a);
        }
        for(int a: result){
            System.out.println("Result: "+a);
        }

        return result;
    }
}