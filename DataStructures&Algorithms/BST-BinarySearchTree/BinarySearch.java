/*
   1. Let min = 0 and max = n-1.
   2. If max < min, then stop: target is not present in array. Return -1.
   3. Compute guess as the average of max and min, rounded down (so that it is an integer).
   4. If array[guess] equals target, then stop. You found it! Return guess.
   5. If the guess was too low, that is, array[guess] < target, then set min = guess + 1.
   6. Otherwise, the guess was too high. Set max = guess - 1.
   7. Go back to step 2.
*/
import java.util.*;

public class BinarySearch{

   public int doSearch(int[] array, int targetValue)
   {
      int min = 0;
      int max = array.length - 1;
      
      
      while(min <= max)
      {
         /* intializes guess as the min size of the array (which is 0) and adds
         the size of the array (which is n) and finds the average size of the 
         array (which is the middle element ) 
      
         */
         int guess = (min + max) / 2;
         
         // returns guess if the target value is found
         if(array[guess] == targetValue)
         {
            return guess;
         }
         
         //
         if(array[guess] < targetValue)
         {
            min = guess + 1;
         }
         
         else
         {
            max = guess - 1;
         }
      }
      
      
      // returns -1 if the targetValue is not in the array
      return -1;
      
    }

}// Do search end





