package RegularExpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String emailRE = "[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+";
        Pattern emailPattern = Pattern.compile(emailRE);
        Matcher matcher = emailPattern.matcher("naveed@uxlabspk.com");

        // printing whether email is valid or not.
        System.out.println((matcher.find()) ? "Valid email address" : "Invalid email address");
    }
}