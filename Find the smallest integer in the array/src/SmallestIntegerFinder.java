public class SmallestIntegerFinder {

    public static void main(String[] args){
        findSmallestInt(new int[]{78,56,232,12,11,43});
        findSmallestInt(new int[]{78,56,-2,12,8,-33});
    }

    public static int findSmallestInt(int[] args) {

        int min = args[0];

        for(int a : args){
            if(a < min)
                min = a;
        }
        System.out.println(min);
        return min;
    }
}