public class LongestConsec {

    public static String longestConsec(String[] strarr, int k){

        int loopLength = strarr.length;
        int highestCounter = 0;
        int indexOfHighestCounter = 0;
        int counter;

        if(loopLength == 0 || k ==0 || k > loopLength -1)
            return "";

        for(int i = 0 ; i < k ; i++){
            for(int j = strarr.length - loopLength; j <= strarr.length -k ; j++){
                counter = 0;
                for(int l = 0 ; l < k ; l ++){
                    counter = counter + strarr[j + l].length();
                    if(counter > highestCounter){
                        highestCounter = counter;
                        indexOfHighestCounter = j;
                    }
                }
            }
            loopLength--;
        }
        String result ="";
        for(int i = 0 ; i < k ; i ++){
            result += strarr[indexOfHighestCounter + i];
        }
        return result;
    }
}
