public class Main {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        double sum = 0;
        for (int i = 0; i < classPoints.length; i++){
            sum = sum + classPoints[i];
        }

        if(sum/classPoints.length > yourPoints)
            return false;
        else
            return true;
    }
}
