public class Kata {

    public static String encryptThis(String text){

        if(text.isEmpty())
            return "";

        String result = "";
        String[] givenSentence = text.split(" ");


        for(int i = 0 ; i < givenSentence.length ; i++){

            result += (int) givenSentence[i].charAt(0);

            if(givenSentence[i].length() > 1){
                result += givenSentence[i].charAt(givenSentence[i].length()-1);

              if(givenSentence[i].length() > 2){
                  for(int j = 2 ; j < givenSentence[i].length()-1 ; j++){
                    result += givenSentence[i].charAt(j);
                  }
                  result += givenSentence[i].charAt(1);
              }
            }

            if(i < givenSentence.length -1 ){
                result += " ";
            }
        }
        return result;
    }
}
