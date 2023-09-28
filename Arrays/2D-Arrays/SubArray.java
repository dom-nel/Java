import java.util.Scanner;

public class SubArray {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the length of the array
        int n = scanner.nextInt();

        // Read the elements into an array
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Initialize a count to keep track of the number of negative subarrays
        int count = 0;

        // Nested loops to iterate through all subarrays
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // Calculate the sum of the current subarray
                sum += arr[j];
                // If the sum is negative, increment the count
                if (sum < 0) {
                    count++;
                }
            }
        }

        // Print the count of negative subarrays
        System.out.println(count);

        scanner.close();
    }
}



