public class TenMinWalk {
    public static boolean isValid(char[] walk) {

        int horizontalCounter = 0, verticalCounter = 0, timeCounter = 0;

        for(int i = 0; i < walk.length; i++){
            if(walk[i] == 'n')
                verticalCounter++;
            else if(walk[i] == 's')
                verticalCounter--;
            else if(walk[i] == 'w')
                horizontalCounter++;
            else if(walk[i] == 'e')
                horizontalCounter--;
            timeCounter++;
        }
        if(horizontalCounter == 0 && verticalCounter == 0 && timeCounter == 10 )
            return true;
        else
            return false;
    }
}