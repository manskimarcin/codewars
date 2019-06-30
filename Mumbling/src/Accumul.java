public class Accumul {

    public static String accum(String s) {
        String result = "";

        for(int i = 0; i< s.length(); i++){

            if(i>0) result = result+"-";

            for(int j = 0; j <= i; j++){
                if(j == 0){
                    result = result + Character.toUpperCase(s.charAt(i));
                }
                else{
                    result = result + Character.toLowerCase(s.charAt(i));
                }

            }

        }
        System.out.println(s);
        System.out.println(result);
        return result;
    }
}