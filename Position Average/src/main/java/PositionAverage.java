public class PositionAverage {
    public static double posAverage(String s) {

        int totalAmountOfChars = 0;
        int counterOfSameElemens = 0;

        String[] substrings = s.split(", ");
        int numberOfSubstrings = substrings.length;
        int substringLength = substrings[0].length();

        int counter = 0;

        for(int i = 0 ; i< numberOfSubstrings ; i++){
            for(int j = i ; j < numberOfSubstrings ; j++){
                if(i != j){
                    counter ++;
                    counterOfSameElemens = counterOfSameElemens + compareStrings(substrings[i], substrings[j]);
                }
            }
        }
        totalAmountOfChars = counter * substringLength;
        return (double)counterOfSameElemens/(double)totalAmountOfChars * 100.0;
    }


    public static int compareStrings(String string1, String string2){
        int counter = 0;

        for(int i = 0 ; i < string1.length(); i++){
            if (string1.charAt(i) == string2.charAt(i)){
                counter++;
            }
        }
        return counter;
    }
}