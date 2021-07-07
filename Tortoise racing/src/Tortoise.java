public class Tortoise {


    public static void main(String[] args){
        // podawane w stopach na godzinę, potrzeba stopy na sekundę
        int[] wynik;
        wynik = race(80, 100, 40);
        wynik = race(80, 91, 37);
        wynik = race(720, 850, 70);

        //System.out.println(wynik[0]+"\t"+wynik[1]+"\t"+wynik[2]);
    }

    public static int[] race(int v1, int v2, int g){
        int t=1;
        double v_1 = v1 / 3600.0;
        double v_2 = v2 / 3600.0;

     //   System.out.println(v_1 +" "+v_2);

        while((v_1 * t +g ) > (v_2 *t) ){
            t++;
            //System.out.println(t+"\t"+(v1 * t +g)+"\t"+"\t"+ v2 *t);
        }
        System.out.println((v_1 * (t-1) +g)+"\t"+(v_2 *(t-1)));
        System.out.println((v_1 * t +g)+"\t"+(v_2 *t));

       // System.out.println(t+"\t"+(v1 * t +g)+"\t"+"\t"+ v2 *t);


        int hour = 0;
        int min = 0;
        int sec = 0;

        System.out.println(t);

        hour = t/3600;
        t = t - hour*3600;



        min = t/60;
        t = t-min*60;

        sec = t;



        int[] result  = {hour, min, sec};
        System.out.println("Hours: "+hour+", Minutes: "+min+", Seconds: "+sec);
        System.out.println();
        System.out.println();
        return  result;
    }
}
