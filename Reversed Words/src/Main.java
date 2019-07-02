public class Main {

    public static void main(String[] args){
        System.out.println(reverseWords("Ala ma kota"));
    }

    public static String reverseWords(String str){
        String[] table = str.split(" ");
        String result="";

        for(int i = table.length-1 ; i>=0; i--){
            result = result + table[i];
            if (i !=0)
                result = result +" ";
        }
        return result;
    }
}
