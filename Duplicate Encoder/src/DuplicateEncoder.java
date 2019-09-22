import java.sql.SQLOutput;

public class DuplicateEncoder {

    public static void main(String[] args){
        String word = "Prespecialized";
        //word = "abcdefa";
//        word = word.replaceAll("e",")");
       //encode(word);
        System.out.println(word.lastIndexOf("zed"));
    }
    static String encode(String word){

        System.out.println(word);
        word = word.toLowerCase();
        String result = "";

        for(int i = 0; i < word.length(); i++){

            char letter = word.charAt(i);
            if(word.lastIndexOf(letter) == word.indexOf(letter))
                result += "(";
            else
                result += ")";
        }
        return result;
    }



}
