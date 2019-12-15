
public class Kata {

    public static String encrypt(final String text, final int n) {

        String input = text;
        String encryptedText = "";

        if(n <= 0)
            return input;

        if(text.equals(null))
            return null;

        for(int i = 0 ; i < n ; i++){

            String odd = "";
            String even = "";

            for(int j = 0 ; j < text.length() ; j++){
                if( j % 2 == 0){
                    odd += input.charAt(j);
                }
                else{
                    even += input.charAt(j);
                }
            }
            encryptedText = even + odd;
            input = encryptedText;
        }
        return encryptedText;
    }

    public static String decrypt(final String encryptedText, final int n) {

        if(n <= 0)
            return encryptedText;

        if(encryptedText.equals(null))
            return null;

        String input = encryptedText;
        String decryptedText = encryptedText;
        int encryptedTextLength = encryptedText.length();

        for(int i = 0 ; i < n ; i++){
            String result = "";
            String odd = decryptedText.substring(0,encryptedTextLength/2);
            String even = decryptedText.substring(encryptedTextLength/2, encryptedTextLength);

            for(int j = 0 ; j < encryptedTextLength/2 ; j++){
                result += even.charAt(j);
                result += odd.charAt(j);

                if(j == encryptedTextLength/2 -1  && even.length() != odd.length()){
                    result += even.charAt(encryptedTextLength/2);
                }
            }
            decryptedText = result;
        }
        return decryptedText;
    }
}