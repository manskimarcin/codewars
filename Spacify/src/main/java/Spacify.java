public class Spacify {


    public static String spacify(String str){
        String result = "";

        for(int i = 0; i < str.length(); i++){
            result = result+ str.charAt(i);
            if(i != str.length()-1 )
                result += " ";
        }
        return result;
    }
}
