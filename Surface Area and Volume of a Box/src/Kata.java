public class Kata {
    public static int[] getSize(int w,int h,int d) {

        int area = 2*w*h + 2*w*d + 2*h*d;
        int volume=w*h*d;

        int[] array = {area, volume};

    //    System.out.println(array[0]+" "+array[1]);
        return array;
    }
}