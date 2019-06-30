public class Main {

    public static void main(String[] args) {

        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, true,  true };

        Boolean[] array2 = {null, null, true, null, false};

        Counter.countSheeps(array2);
    }
}
