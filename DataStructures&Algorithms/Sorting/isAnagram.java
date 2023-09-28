import java.io.*;
import java.util.*;

public class isAnagram {
      public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);

        // Gathers the input
        String input1 = scanner.next();
        String input2 = scanner.next();

        // Change both inputs to lowercase
        String lower1 = input1.toLowerCase();
        String lower2 = input2.toLowerCase();

        // Add both strings to arrays
        char[] c1 = lower1.toCharArray();
        char[] c2 = lower2.toCharArray();

        // Check the size of the arrays to see if they're not equal
        if (c1.length != c2.length) {
            System.out.println("Not Anagrams");
            System.exit(0);
        }

        // Sort the arrays
        Arrays.sort(c1);
        Arrays.sort(c2);

        // Check if the sorted arrays are equal
        boolean isAnagram = true;
        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                isAnagram = false;
                break;
            }
        }

        if (isAnagram) {
            System.out.println("Anagrams");
        } else {
            System.out.println("Not Anagrams");
        }
    }
    
    }
