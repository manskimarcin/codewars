import java.util.Arrays;
import java.util.List;

public class MixedSum {

    public static void main(String[] args){
        sum(Arrays.asList(5,"5"));
    }

    public static int sum(List<?> mixed) {
        int sum = 0;
        for(int i = 0; i < mixed.size(); i++){
            if(mixed.get(i) instanceof String)
                sum = sum + Integer.parseInt((String)mixed.get(i));
            else
                sum = sum + (Integer) mixed.get(i);
        }
        return sum;
    }
}