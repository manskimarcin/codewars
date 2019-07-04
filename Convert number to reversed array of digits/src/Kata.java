public class Kata {

    public static void main(String[] args){
        digitize(1234567);
    }
    public static int[] digitize(long n) {
        String text = Long.toString(n);
        int[] result = new int[text.length()];
        for(int i = text.length()-1; i >=0; i --){
            result[(text.length()-1-i)] = Character.getNumericValue(text.charAt(i));//text.charAt(i);
        }
        return result;
    }
}