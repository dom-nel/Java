import java.util.HashMap;

public class HMDuplicateInArray {
   
   private static int[][] findDuplicateUsingHashMap(int[] arr) {
      HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>(); 

      // Step 1: Count the occurrences of each number in the array
      for (int x : arr) {
         if (!hm.containsKey(x)) {
            hm.put(x, 1);
         } else {
            hm.put(x, hm.get(x) + 1);
         }
      }

      // Step 2: Create a 2D array to store keys and their corresponding values
      int[][] result = new int[hm.size()][2];
      int index = 0;

      // Step 3: Populate the 2D array
      for (int key : hm.keySet()) {
         result[index][0] = key;            // Key (number)
         result[index][1] = hm.get(key);    // Value (number of times duplicated)
         index++;
      }

      return result;
   }
   
   public static void main(String[] args) {
      int[] inputArr = {2, 5, 6, 7, 11, 8, 2, 9, 5, 7};
      
      // Call the method to find duplicates and store in a 2D array
      int[][] duplicatesArray = findDuplicateUsingHashMap(inputArr);

      // Print the results
      for (int[] pair : duplicatesArray) {
         System.out.println("Number: " + pair[0] + ", Occurrences: " + pair[1]);
      }
   }
}
