import java.util.ArrayList;
import java.util.List;

public class FindOutlier{
    static int find(int[] integers){

        List<Integer> odd = new ArrayList<>();
        List<Integer> even = new ArrayList<>();

        for(int i = 0; i < integers.length; i++){
            if(integers[i] % 2 == 0)
                even.add(integers[i]);
            else
                odd.add(integers[i]);
        }
        if(even.size() > 1)
            return odd.get(0);
        else
            return even.get(0);
    }
}