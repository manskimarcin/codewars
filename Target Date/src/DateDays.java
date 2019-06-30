import java.text.*;
import java.util.*;

public class DateDays {

    public static String dateNbDays(double a0, double a, double p) {

        int dayCount=0;

        while(a0 < a ){
            a0= a0 + a0*p/36000;
            dayCount++;
        }

        System.out.println("-------------------------------");
        System.out.println("day count: "+dayCount);

        int year = 2016+dayCount/360;
        dayCount = dayCount%360;
        System.out.println(year);

        int month =dayCount/30 ;
        System.out.println(month);

        int day = dayCount%30;
        System.out.println(day);

        String result = (year+"-"+month+"-"+day);

//        if(day <10) {String  MM= "0"+Integer.toString(day); result = (year+"-"+MM+"-"+day);}
//
//        if(month <10) {String DD  = "0"+Integer.toString(month); result = (year+"-"+month+"-"+DD);}



        System.out.println(result);
        //return result.toString();
        return null;
    }
}