import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class AverageArray
{
   public static void main(String[] args)
   {
      double total = 0; //Initialize accumulator
      
      double average;
      
      double [] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
      
      for (int index = 0; index < numbers.length; index++)
      
     {
      total += numbers[index];// each index is added to the accumulator variable
     } 
      
      average = total / numbers.length;//calculates the average-> should not be inside the loop should only be called once
      
      showValue(average);
   }
   
   /**
   The showValue method displays its argument.
   @param n The value to display.
   */
   
   public static void showValue(double n)
   {
      System.out.print(n + " ");
   }
   
}