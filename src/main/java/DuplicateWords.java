import static java.util.regex.Pattern.CASE_INSENSITIVE;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public String transform(final String str) {
        String result = str;
        String regex = "\\b(\\w+)(\\b\\W+\\b\\1\\b)*";

        Pattern p = Pattern.compile(regex, CASE_INSENSITIVE);
        Matcher m = p.matcher(str);

        while (m.find()) {
            result = result.replaceAll(m.group(0), m.group(1));
        }

        return result;
    }
}