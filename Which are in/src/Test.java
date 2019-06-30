import java.util.ArrayList;
import java.util.List;

public class Test {

    public static String[] inArray(String[] array1, String[] array2) {

        System.out.println("Array1: ");
        for(int i = 0; i <array1.length; i++){
            System.out.println(array1[i]);
        }
        System.out.println("-------------------------------------------------------------------");
        System.out.println("Array2: ");
        for(int i = 0; i <array2.length; i++){
            System.out.println(array2[i]);
        }
        System.out.println("-------------------------------------------------------------------");

        int result_size=0;
        boolean are_in=false;       //boolean to avoid duplicates
        String buff="";
        List<String> result = new ArrayList<String>();


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if(array1[i].length() > array2[j].length()){
                    continue;
                }
                else if(array1[i].length() <= array2[j].length()){
                    int counter = array2[j].length()-array1[i].length()+1;

                        for(int k = 0; k <counter; k++){

                            String array2_buff = "";

                            for(int l = k; l < array1[i].length()+k; l++){
                                array2_buff = array2_buff + array2[j].charAt(l);
                            }
                            if(array2_buff.equals(array1[i]) && !array2_buff.equals(buff)){
                                result_size++;
                                result.add(array2_buff);
                                buff= array2_buff;
                            }

                        }
                }
            }
        }


        java.util.Collections.sort(result);

        String[] output = new String[result_size];

        for(int i = 0; i < result.size(); i++){
            output[i] = result.get(i);
            System.out.print(output[i]+", ");
        }
        System.out.println(result_size);

        return output;

    }
}
