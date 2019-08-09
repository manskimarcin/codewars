public class XO {

    public static boolean getXO (String str) {

        int xCount = 0;
        int oCount = 0;

        str = str.toLowerCase();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == 'o')
                oCount++;
            else if(str.charAt(i) == 'x')
                xCount++;
        }

        if(xCount == oCount)
            return true;
        else
            return false;

    }
}