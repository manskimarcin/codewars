public class Order {

    public static String order(String text){

        String[] words = text.split(" ");
        String[] buf = new String[words.length];
        String result = "";

        if(words.length == 1)
            return text;

        for(int i = 0; i < words.length; i++){
            int number = 0;
            for(int j = 0; j < words[i].length(); j++){
                if(Character.isDigit(words[i].charAt(j))){
                    number = Character.getNumericValue(words[i].charAt(j));
                    System.out.println(number);
                }
            }
            buf[number-1] = words[i];
        }
        for(int i = 0; i < words.length; i++){
            result += buf[i];
            if(i < words.length-1)
                result += " ";
        }
        return result;
    }
}
