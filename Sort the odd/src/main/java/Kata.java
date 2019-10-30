import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static int[] sortArray(int [] array){

        if(array.length == 0)
            return array;

        int[] odd = new int[array.length];
        int[] equal = new int[array.length];
        int[] result = new int[array.length];
        List<Integer> oddElements = new ArrayList<>();
        List<Integer> indexesOfOddElements = new ArrayList<>();


        for(int i = 0; i < equal.length ; i++){
            if(array[i] % 2 == 0)
                equal[i] = array[i];
            else{
                odd[i] = array[i];
                oddElements.add(array[i]);
                indexesOfOddElements.add(i);
            }
        }

        Collections.sort(oddElements);

        for(int i = 0 ; i < indexesOfOddElements.size(); i++){
            odd[indexesOfOddElements.get(i)] = oddElements.get(i);
        }

        for(int i  = 0 ; i < result.length ; i ++){
            result[i] = odd[i] + equal[i];
        }
        return result;
    }
}
