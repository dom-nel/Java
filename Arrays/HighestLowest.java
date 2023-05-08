import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class HighestLowest
{
   public static void main(String[] args)
   {
      int highest = numbers[0]; //Initialize accumulator
      
      for (int index = 0; index < numbers.length; index++)
      
      if (numbers[index] > highest)      
         highest = numbers[index];
         
         
      int lowest = numbers[0]; //Initialize accumulator
      
      for (int index = 0; index < numbers.length; index++)
      
      if (numbers[index] > lowest)      
         lowest = numbers[index];
   
         
   }
   
   /**
   The showValue method displays its argument.
   @param n The value to display.
   */
   
   public static void showValue(int n)
   {
      System.out.print(n + " ");
   }
   
}



/*

FindMax(inputArray) {
   max = inputArray[0]

   for (i = 1; i < inputArray.size; ++i) {
      if (inputArray[i] > max) {
         max = inputArray[i];
      }
   }

   return max
}

*/