/*
Given a sorted array of unique integers and a target integer, 
return true if there exists a pair of numbers that sum to target, 
false otherwise. This problem is similar to Two Sum.

For example, given nums = [1, 2, 4, 6, 8, 9, 14, 15] and target = 13, 
return true because 4 + 9 = 13.
*/


public class CheckForTarget
{

   public static boolean checkForTargetMethod(int[] nums, int target)
   {
      int left = 0;
      int right = nums.length - 1;
      
      while (left < right)
      {
         int curr = nums[left] + nums[right];
         
         if (curr == target)
         {
            return true;
         }
         
         if (curr > target)
         {
            right--;
         }else
         {
            left++;
         }
      }
      
      return false;
   }  
   
   public static void main(String[] args)
   {
      int[] nums = {1, 2, 4, 6, 8, 9, 14, 15};
      
      boolean trueOrFalse = checkForTargetMethod(nums, 42);
      System.out.println(trueOrFalse);
   }
}// public class checkIfPalindrome end