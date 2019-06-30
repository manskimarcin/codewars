public class Evaporator {

    public static int evaporator(double content, double evap_per_day, double threshold) {

        System.out.println(content+"    "+evap_per_day+"    "+threshold+"\n");

        int counter=0;
        evap_per_day = evap_per_day/100;
        threshold = threshold/100;


        if(content >0 && evap_per_day >0 && threshold >0){
            double end = threshold*content;
            while(content >= end){
                counter++;
                System.out.println(counter+") "+content +" - "+evap_per_day+" * "+content+" = "+(content-evap_per_day*content) );
                content = content - (content * evap_per_day);
            }
        }
        System.out.println("counter: "+counter);

        return counter;
    }
}