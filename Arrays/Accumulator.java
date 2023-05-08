import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class Accumulator
{
   public static void main(String[] args)
   {
      int total = 0; //Initialize accumulator
      
      int [] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
      
      for (int index = 0; index < numbers.length; index++)
      
      total += numbers[index];// each index is added to the accumulator variable
      
      showValue(total);
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