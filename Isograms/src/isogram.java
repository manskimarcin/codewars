public class isogram {

    public static boolean isIsogram(String str){
        str = str.toLowerCase();
        while(str.length() !=0){

            char firstLetter = str.charAt(0);
            String substring = str.substring(1,str.length());

            if(substring.contains(String.valueOf(firstLetter)))
                return false;

            else
                str = str.replaceAll(String.valueOf(firstLetter),"");
        }
        return true;
    }
}
