public class Kata {
    public static int rentalCarCost(int d) {
        int total=0;
        if(d >= 7){
            total = 40*d - 50;
        }
        else if(d >= 3){
            total = 40*d - 20;
        }
        else{
            total = 40*d;
        }
            return total;
    }
}
