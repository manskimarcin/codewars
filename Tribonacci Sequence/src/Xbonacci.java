public class Xbonacci {

    public static double[] tribonacci(double[] s, int n) {

        double[] result = new double[n];

        switch(n){
            case 0: return result;
            case 1: result[0] = s[0]; return result;
            case 2: result[0] = s[0]; result[1] = s[1]; return result;
            case 3: result[0] = s[0]; result[1] = s[1]; result[2] = s[2]; return result;
            default:{
                result[0] = s[0]; result[1] = s[1]; result[2] = s[2];
                double sum = result[1] + result[2] + result[3];

                for (int i = 3; i < n; i++) {
                    sum = result[i - 1] + result[i - 2] + result[i - 3];
                    result[i] = sum;

                }
                return result;
            }
        }

    }
}


