//public class Counter {
//    public static int countSheeps(Boolean[] arrayOfSheeps) {
//        int counter = 0;
//        System.out.println(arrayOfSheeps.length);
//
//        for(int i = 0; i < arrayOfSheeps.length; i++){
//            if(arrayOfSheeps[i]) counter++;
//        }
//
////        for(int i = 0; i < arrayOfSheeps.length; i++){
////           // System.out.println(arrayOfSheeps[i]);
////
////            try{
////                if(arrayOfSheeps[i] == true){
////                    counter++;
////                }
////            }
////            catch(Exception e){
////                //System.out.println("Invalid data");
////            }
////        }
//
//         System.out.println(counter);
//        return counter;
//    }
//}
public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int counter = 0;
        for (Boolean present : arrayOfSheeps) {
            if (present != null && present) {
                counter += 1;
            }
        }
        return counter;
    }
}