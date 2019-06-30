import static java.lang.Math.pow;

public class PiApprox {

    public static String iterPi2String(Double epsilon) {

        double Pi=1;
        double n=0;

        // PI / 4 = 1 - 1/3 + 1/5 - 1/7 + ... which gives an approximation of PI / 4.

        while(epsilon < Math.abs(4*Pi-Math.PI)){

            if(n%2 != 0){
                Pi = Pi + 1/(3+2*n);
            }
            if(n%2 == 0){
                Pi = Pi - 1/(3+2*n);
            }
           n++;
        }
        System.out.println("Styka "+ ((int)n+1));

        System.out.println("Pi: "+Pi*4);
        System.out.println("Pi ref: "+Math.PI);

        int counter = (int)(n+1);
        String Pi_final = String.format("%.11g", Pi*4);


        //String[] result = {Double.toString(n+2), Double.toString(Pi)};
        String result = "["+Integer.toString(counter)+", "+Pi_final + "]";



        System.out.println(result);

//        for(n = 0; n <=1000000; n++){
//
//            if(n%2 != 0){
//                Pi = Pi + 1/(3+2*n);
//            }
//            if(n%2 == 0){
//                Pi = Pi - 1/(3+2*n);
//            }
//            if(epsilon >= Math.abs(4*Pi-Math.PI)){
//                int counter = ((int)n+2);
//                System.out.println("Styka "+ counter);
//                break;
//            }
//        }


        return result;
    }



}