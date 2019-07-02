public class Main {

    public static void main(String[] args){
        int[] table = monkeyCount(10);

        for(int i = 0; i<table.length; i++){
            System.out.println(table[i]);
        }

    }

    public static int[] monkeyCount(final int n){
        int[] result = new int[n];

        for(int i = 0; i < n; i++){
            result[i] = i+1;
        }
        return result;
    }
}
