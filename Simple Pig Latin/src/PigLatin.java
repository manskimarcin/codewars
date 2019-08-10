public class PigLatin {

    public static String pigIt(String str) {

        String result = "";
        String[] words = str.split(" ");

        for(int i = 0; i < words.length; i++){
            if(words[i].matches(".*\\p{Punct}")){
                result = result + " " + words[i];
                continue;
            }
            else if(i != 0)
                result = result + " " + words[i].substring(1,words[i].length())+words[i].charAt(0)+"ay";
            else
                result = result + words[i].substring(1,words[i].length())+words[i].charAt(0)+"ay";
        }
        return result;
    }
}