public class Sequence{

    public static void main(String[] args){
        reverse(5);
    }

    public static int[] reverse(int n){
        int result [] = new int[n];
        for(int i = n ; i > 0; i--){
            result[n-i] = i;
            System.out.println(result[n-i]);
        }
        return result;
    }

}