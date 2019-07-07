import java.util.Arrays;
import java.util.Collection;

public class DescendingOrder {

    public static void main(String[] args){
        System.out.println(sortDesc(21445));
        String kupa = "kupa";
        System.out.println(kupa.charAt(2));
    }

    public static int sortDesc(final int num) {

        String text = String.valueOf(num);
        String result="";
        int ints[] = new int[String.valueOf(num).length()];

        for(int i = 0; i < text.length(); i++){
            ints[i] = Integer.parseInt(String.valueOf(text.charAt(i)));
            System.out.println(ints[i]);
        }

        Arrays.sort(ints);

        for(int i = 0; i < text.length(); i++){
            result = result + ""+ints[text.length()-1-i];
        }

        return Integer.parseInt(result);
    }
}