import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class MiddleNum
{
   public static void main(String[] args)
   {
       total = 0; //Initialize accumulator
      
      double average;
      
      double [] numbers = {5, 10, 15, 20, 25, 30, 35, 40};
      
      for (int index = 0; index < numbers.length; index++)
      
     {
      
         mid = 0
         low = 0
         high = numbersSize - 1
   
      while (high >= low) {
         mid = (high + low) / 2
         if (numbers[mid] < key) {
            low = mid + 1
         }
         else if (numbers[mid] > key) {
          high = mid - 1
       }
         else {
            return mid
         }
      }
   
    return -1 // not found
      } 
      
        }
   
     
}