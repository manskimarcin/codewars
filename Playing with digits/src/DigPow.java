public class DigPow {
        public static long digPow(int n, int p){
            long sum = 0;
            String input = String.valueOf(n);
            for(int i=0; i < input.length(); i++){
                sum += Math.pow(Character.getNumericValue(input.charAt(i)),p);
                p++;
            }
            return (sum%n != 0) ? -1 : sum/n;
    }

}

