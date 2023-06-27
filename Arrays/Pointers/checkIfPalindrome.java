public class checkIfPalindrome
{

   public static boolean checkIfPalindromeMethod(String s)
   {
      int left = 0;
      int right = s.length() - 1;
      
      while (left < right)
      {
         if (s.charAt(left) != s.charAt(right))
         {
            return false;
         }
         
         left++;
         right--;
      }
      
      return true;
   }  
   
   public static void main(String[] args)
   {
      boolean trueOrFalse = checkIfPalindromeMethod("racecar");
      System.out.println(trueOrFalse);
   }
}// public class checkIfPalindrome end