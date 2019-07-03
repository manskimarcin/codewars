public class Maps {
    public static int[] map(int[] arr) {
        int[] table = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            table[i]= 2* arr[i];
        }
        return table;
    }
}