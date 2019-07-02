public class Main {
    public static int enough(int cap, int on, int wait){
        if(on+wait <= cap)
            return 0;
        else{
            if(cap-on > wait)
                return wait;
            else
                return wait%(cap-on);


        }
    }
}
