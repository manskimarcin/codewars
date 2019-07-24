public class SmashWords {

    public static String smash(String... words) {
        String result = "";
        for(int i =0; i < words.length; i++){
            result += words[i]+" ";
        }
        return result.trim();
    }
}