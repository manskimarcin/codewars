public class Kata {
    public static String reverseWords(final String original){

        String[] words = original.split(" ");

        if(words.length == 0)
            return original;

        String result = "";

        for (int i = 0 ; i < words.length ; i++) {

            String word = words[i];

            for(int j = word.length()-1 ; j >=0 ; j--){
                result += word.charAt(j);
            }

            if(i <= words.length -2){
                result += " ";
            }

        }

        System.out.println(result);

        return result;
    }
}
