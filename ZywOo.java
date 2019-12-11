public class ZywOo {
    public static boolean validateUsr(String s) {
        return s.matches("[\\p{Lower}_\\d]{4,16}");
    }
}