import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Kata {

    public static boolean validPhoneNumber(String phoneNumber){

        Pattern pattern = Pattern.compile("\\(\\d{3}\\)\\p{Space}\\d{3}\\-\\d{4}");
        Matcher matcher = pattern.matcher(phoneNumber);

        return matcher.matches();
    }
}

