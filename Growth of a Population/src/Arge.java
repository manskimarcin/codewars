public class Arge {
    public static int nbYear(int p0, double percent, int aug, int p){
        int sum = p0, counter =0;

        while(sum < p){
            sum += sum*percent/100 + aug;
            counter++;
        }
        return counter;
    }
}
