import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {

        public static String high(String s){

            String[] input = s.split(" ");
            int inputLength = input.length;

            List<Integer> scoreOfEachWord = new ArrayList<>();

            for(int i = 0 ; i < inputLength ; i++){
                int score = 0;
                for(int j = 0 ; j < input[i].length(); j++){
                    score += (int)input[i].charAt(j) - 96;
                }
                scoreOfEachWord.add(score);
            }

            int indexOfHighestScore = scoreOfEachWord.indexOf(Collections.max(scoreOfEachWord));

        return input[indexOfHighestScore];
    }
}
