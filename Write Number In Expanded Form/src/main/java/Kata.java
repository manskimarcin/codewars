public class Kata {

    public static String expandedForm(int input){
        String result = "";
        String number = String.valueOf(input);

        for(int i = 0 ; i < number.length() ; i++){
            if(number.charAt(i) == '0')
                continue;

            result += number.charAt(i);

            for(int j = i ; j < number.length()-1 ; j++){
                result += "0";
            }

            if((number.substring(i+1).replaceAll("0","").length() == 0))
                continue;

            if(i != number.length()-1)
                    result +=" + ";
        }
        return result;
    }
}

