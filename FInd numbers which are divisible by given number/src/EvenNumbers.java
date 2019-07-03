import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

    public static void main(String[] args){
        for(int a: divisibleBy(new int[] {1,2,3,4,5,6},2)){
            System.out.println(a);
        }
        System.out.println();
        for(int a: divisibleBy(new int[] {1,2,3,4,5,6},3)){
            System.out.println(a);
        }
        System.out.println();
        for(int a: divisibleBy(new int[] {0,1,2,3,4,5,6},4)){
            System.out.println(a);
        }
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i < numbers.length; i++){
            if(numbers[i] % divider == 0)
                list.add(numbers[i]);
        }
        int[] result = new int[list.size()];

        for(int i=0; i < result.length; i++){
            result[i] = list.get(i);
        }

        return  result;
    }
}