public class SquareDigit {

    public int squareDigits(int n) {
        String text = Integer.toString(n);
        String result = "";
        for(int i = 0; i < text.length(); i++){
            result = result + Character.getNumericValue(text.charAt(i))*Character.getNumericValue(text.charAt(i));
        }

            return Integer.parseInt(result);
    }

}