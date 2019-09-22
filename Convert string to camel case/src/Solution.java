public class Solution {

    public static String toCamelCase(String s){
        String[] text;
        String result ="";

        if(s.isEmpty())
            return "";

        if(s.contains("-"))
            text = s.split("-");
        else if(s.contains("_"))
            text = s.split("_");
        else if(s.contains(" "))
            text = s.split(" ");
        else
            text = null;

        result = text[0];

        for(int i = 1 ; i < text.length; i ++){
            String word = text[i].substring(0,1).toUpperCase()+text[i].substring(1);
            result += word;
        }
        return result;
    }
}
