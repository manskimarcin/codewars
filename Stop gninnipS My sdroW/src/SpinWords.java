public class SpinWords {

    public String spinWords(String sentence) {
        String result = "";
        String words [] = sentence.split(" ");
        for(int i = 0; i < words.length; i++){
            if(words[i].length() >= 5){
                for(int j = words[i].length()-1 ; j >=0; j--){
                    result += words[i].charAt(j);
                }
            }
            else{
                result += words[i];
            }
            if( i < words.length-1)
                result += " ";
        }
        return result;
    }
}