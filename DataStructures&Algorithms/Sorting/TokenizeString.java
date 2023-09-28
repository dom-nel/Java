import java.io.*;
import java.util.*;

public class TokenizeString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scnr = new Scanner(System.in);
        String input = scnr.nextLine();
        // Split by spaces, exclamation points, commas, question marks, periods, underscores, apostrophes, and at symbols
        String regex = "[ !,?._'@]+";
        String[] tokens = input.split(regex);

        int tokenCount = tokens.length;
        System.out.println(tokenCount);

        for (String token : tokens) {
            System.out.println(token);
        }
    }
}
