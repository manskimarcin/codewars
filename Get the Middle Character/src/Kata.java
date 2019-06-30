class Kata {
    public static String getMiddle(String word) {

        int pointer = word.length();

        if(pointer%2 != 0){
                //System.out.println(((String) word.charAt(pointer / 2)));
                return(String.valueOf(word.charAt(pointer/2)));
        }
        else{
            //System.out.println(word.charAt(pointer/2-1)+""+word.charAt(pointer/2));
            return(word.charAt(pointer/2-1)+""+word.charAt(pointer/2));
        }

    }
}