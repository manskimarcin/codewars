import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class EnoughIsEnough {


    public static int[] deleteNth(int[] elements, int maxOccurrences){

        List<Integer> listOfElements = new ArrayList<>();

        for (int i = 0; i < elements.length ; i++){
            listOfElements.add(elements[i]);
        }

        for(int i = 0; i < elements.length ; i ++){
            int occurrences = Collections.frequency(listOfElements, elements[i]);
            if(occurrences > maxOccurrences) {
                listOfElements.remove(listOfElements.lastIndexOf(elements[i]));
            }
        }

        int[] result = new int[listOfElements.size()];

        for(int i = 0 ; i < listOfElements.size() ; i++){
            result[i] = listOfElements.get(i);
        }

        return result;
    }
}
