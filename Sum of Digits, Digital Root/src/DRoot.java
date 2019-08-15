public class DRoot{

    public static int digital_root(int n) {
        int result = 0;
        String text = String.valueOf(n);

        while(text.length() >= 2){
            for(int i = 0 ;i < text.length(); i++){
            result += Character.getNumericValue(text.charAt(i));
            }
            text = String.valueOf(result);
            result = 0;
        }
        return Integer.parseInt(text);
    }
}