import java.util.*;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int counter = 0;

        for(int i = 0; i < arr.size(); i++){

            int charCount = 0;

            if(arr.get(i).length() == 2){
                if(arr.get(i).charAt(0) == ':' || arr.get(i).charAt(0) == ';' )
                    charCount++;
                if(arr.get(i).charAt(1) == ')' || arr.get(i).charAt(1) == 'D')
                    charCount ++;
                if(charCount ==2)
                    counter ++;
            }
            else if(arr.get(i).length() == 3){
                if(arr.get(i).charAt(0) == ':' || arr.get(i).charAt(0) == ';' )
                    charCount++;
                if(arr.get(i).charAt(1) == '-' || arr.get(i).charAt(1) == '~')
                    charCount ++;
                if(arr.get(i).charAt(2) == ')' || arr.get(i).charAt(2) == 'D')
                    charCount ++;
                if(charCount ==3)
                    counter ++;
            }
        }
        return counter;
    }
}
