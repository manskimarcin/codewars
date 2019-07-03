public class AbbreviateTwoWords {

    public static void main(String[] args){
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("David Mendieta"));
    }

    public static String abbrevName(String name) {
        String[] table = name.split(" ");
        table[0] = String.valueOf(table[0].charAt(0)).toUpperCase();
        table[1] = String.valueOf(table[1].charAt(0)).toUpperCase();

        return table[0]+"."+table[1];
    }
}