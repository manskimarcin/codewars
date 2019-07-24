public class Kata {

    public static void main(String[] args){
        System.out.println(Kata.remove("Hi!", 100));
        System.out.println(Kata.remove("!!!Hi !!hi!!! !hi", 3));
    }

    public static String remove(String s, int n){
        for(int i = 0; i < n ; i++){
            s = s.replaceFirst("!","");

        }

        return s;

    }

}