public class Solution {

    public static String camelCase(String str){

        String[] input = str.split(" ");
        String result="";

        for(int i = 0 ; i < input.length ; i++){
         if(input[i].length() > 0){
             result += String.valueOf(input[i].charAt(0)).toUpperCase();
             if(input[i].length() > 1){
                 result += input[i].substring(1);
             }
         }
        }
        return result;
    }
}
