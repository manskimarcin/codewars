import java.util.ArrayList;
import java.util.List;

class Solution {
    public static String whoLikesIt(String... inputNames) {
        switch(inputNames.length){
            case 0 : return "no one likes this";
            case 1 : return String.format("%s likes this", inputNames[0]);
            case 2 : return String.format("%s and %s like this", inputNames[0], inputNames[1]);
            case 3 : return String.format("%s, %s and %s like this", inputNames[0], inputNames[1], inputNames[2]);
            default: return String.format("%s, %s and %d others like this", inputNames[0], inputNames[1], inputNames.length-2);
        }
    }
}