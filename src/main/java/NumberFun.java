public class NumberFun {

    public static long findNextSquare(long sq){

        if(Math.sqrt(sq) % 1 != 0){
            return -1;
        }

        else{
            return (long) Math.pow(Math.sqrt(sq)+1, 2);
        }

    }
}
