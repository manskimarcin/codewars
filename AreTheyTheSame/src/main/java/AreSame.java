import java.util.Arrays;

public class AreSame {
    public static boolean comp(int[] a, int[] b){

        if(a == null || b == null  ||a.length != b.length)
            return false;

        for(int i = 0 ; i < a.length; i++){
            a[i] = a[i]*a[i];
        }

        Arrays.sort(a);
        Arrays.sort(b);

        if(Arrays.equals(a,b))
            return true;
        else
            return false;
    }
}
