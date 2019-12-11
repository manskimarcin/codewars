import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static boolean isDigit(String s) {
        Pattern pattern = Pattern.compile("\\d");
        Matcher matcher = pattern.matcher(s);

        return matcher.matches();
    }
}