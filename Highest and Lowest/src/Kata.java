public class Kata {

    public static String HighAndLow(String numbers) {

        String[] tableStr = numbers.split(" ");
        Integer[] tableInt = new Integer[tableStr.length];

        for(int i =0; i < tableInt.length; i++){
            tableInt[i] = Integer.parseInt(tableStr[i]);
        }

        int min = tableInt[0];
        int max = tableInt[0];

        for(int i =0; i < tableInt.length; i++) {
            if( tableInt[i] < min)
                min = tableInt[i];
            else if (tableInt[i] > max)
                max = tableInt[i];
        }

        return max+" "+min;
    }
}