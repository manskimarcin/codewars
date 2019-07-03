public class Kata {

    public static void main(String[] args){
        System.out.println(oddCount(7));
        System.out.println(oddCount(15));
        System.out.println(oddCount(15023));
    }


    public static int oddCount(int n){
        int count = 0;
        for(int i = 1; i <= n-1; i+=2){
            count ++;
        }
        return count;
    }

}