import java.util.ArrayList;
import java.util.List;

public class WhichAreIn {

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

        //String[] result = new String[array1.length];
        List<String> result = new ArrayList<String>();


        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {

                if(array1[i].length() > array2[j].length()){
                    System.out.println("Not enough room");
                    continue;
                }
                else if(array1[i].length() <= array2[j].length()){
                    int counter = array2[j].length()-array1[i].length()+1;

                    if(are_in != true){
                        for(int k = 0; k <counter; k++){
                            String array2_buff = "";
                            for(int l = k; l < array1[i].length()+k; l++){
                                array2_buff = array2_buff + array2[j].charAt(l);
                            }
                            if(array2_buff.equals(array1[i])){
                                result_size++;
                                result.add(array2_buff);
                                are_in= true;
                            }
                            System.out.println("Array2 buff:    "+array2_buff);
                        }
                    }
                    else are_in = false;
                }

                System.out.println(i + " " + array1[i].length() + " " + j + " " + array2[j].length());
            }
        }


        String[] output = new String[result_size];

        for(int i = 0; i < result.size(); i++){
            output[i] = result.get(i);
            System.out.print(output[i]+", ");
        }
        System.out.println(result_size);

        return output;

    }
}
