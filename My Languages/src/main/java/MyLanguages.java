import java.util.*;

public class MyLanguages {

    public static List<String> myLanguages(final Map<String, Integer> input) {

        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();

        input.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        List<String> result = new ArrayList<>();

        for(String key : reverseSortedMap.keySet()){
            if(input.get(key) >= 60){
                result.add(key);
            }
        }

        return result;
    }
}
