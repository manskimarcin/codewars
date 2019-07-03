public class Correct {

    public static void main(String[] args){
        System.out.println(correct("1F-RUDYARD K1PL1NG"));
    }

    public static String correct(String string) {
        String result = "";

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i)== '5')
                result = result + 'S';
            else if (string.charAt(i)== '0')
                result = result + 'O';
            else if (string.charAt(i)== '1')
                result = result + 'I';
            else
                result = result + String.valueOf(string.charAt(i));
        }
        return result;
    }
}