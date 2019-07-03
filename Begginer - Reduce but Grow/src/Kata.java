public class Kata{

    public static void main(String[] args){
        System.out.println(grow(new int[] {1,2,3,4}));
    }

    public static int grow(int[] x){
        int sum=1;
        for(int i : x){
            sum = sum * i;
        }
        return sum;

    }

}