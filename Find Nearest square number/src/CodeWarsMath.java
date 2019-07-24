public class CodeWarsMath {

    public static void main(String[] args){
        System.out.println(nearestSq(1));
    }

    public static int nearestSq(final int n){
        int diff=n;
        int result=1;
        if(n==1)
            return result;

        for(int i = 0 ; i < n; i++){
            if(Math.abs(i*i - n)<= diff){
                diff = Math.abs(i*i - n);
                result = i*i;
            }
            else
                break;
        }

        return  result;
    }
}