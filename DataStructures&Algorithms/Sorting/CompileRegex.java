import java.util.*;
import java.util.regex.*;

public class CompileRegex {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numTestCases = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character after the integer

        for (int i = 0; i < numTestCases; i++) {
            String pattern = scanner.nextLine();
            boolean isValid = isValidRegexPattern(pattern);
            System.out.println(isValid ? "Valid" : "Invalid");
        }
    }

    // Function to check if a regex pattern is valid
    public static boolean isValidRegexPattern(String pattern) {
        try {
            Pattern.compile(pattern);
            return true;
        } catch (PatternSyntaxException e) {
            return false;
        }
    }
}