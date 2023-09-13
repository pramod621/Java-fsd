package assistedPracticeProject1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpImpmts {
    public static void main(String[] args) {
    	String regexPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
        String[] emails = {
            "jrtn.sgf@gmail.com",
            "xyz.1234@gmail.com",
            "invalid-email",
            "gmail@.com",
            "@example.com",
            "1234567"
            };
        Pattern pattern = Pattern.compile(regexPattern);
        for (String email : emails) {
            boolean isValid = validateEmail(email, pattern);
            System.out.println(email + " is valid: " + isValid);
        }
    }
    public static boolean validateEmail(String email, Pattern pattern) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}