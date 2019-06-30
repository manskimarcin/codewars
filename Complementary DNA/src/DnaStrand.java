public class DnaStrand {
    public static String makeComplement(String dna) {

        char[] chars  = new char[dna.length()];


        for(int i = 0; i < dna.length(); i++){
            if(dna.charAt(i)  == 'A') chars[i]='T';
            else if(dna.charAt(i)  == 'T') chars[i]='A';
            else if(dna.charAt(i)  == 'C') chars[i]='G';
            else if(dna.charAt(i)  == 'G') chars[i]='C';
        }
        String result = String.valueOf(chars);
       System.out.println(result);
        //return null;
        return String.valueOf(chars);
    }
}