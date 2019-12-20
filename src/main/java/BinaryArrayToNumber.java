import java.util.List;

public class BinaryArrayToNumber {

    public static int ConvertBinaryArrayToInt(List<Integer> binary){

        int listSize = binary.size();
        int result = 0;

        for(int i = listSize-1; i >=0 ; i--){
            if(binary.get(listSize-i-1) == 1){
                result += Math.pow(2,i);
            }
        }
        return result;
    }
}
