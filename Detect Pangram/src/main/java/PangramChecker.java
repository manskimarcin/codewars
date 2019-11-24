import java.util.ArrayList;
import java.util.List;

public class PangramChecker {

    public boolean check(String sentence){

        sentence = sentence.toUpperCase();

        List<Character> listOfLetters = new ArrayList<>();

        for(int i = 65 ; i <= 90 ; i++)
            listOfLetters.add((char)i);

        for(int i = 0 ; i < sentence.length(); i++){
            if(listOfLetters.contains(sentence.charAt(i)))
                listOfLetters.remove(Character.valueOf((char)sentence.charAt(i)));
        }

        if(listOfLetters.size() == 0)
            return true;
        else
            return false;
    }
}
