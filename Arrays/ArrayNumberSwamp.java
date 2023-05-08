import java.util.Scanner;
public class ArrayNumberSwamp
{
   public static void main(String[] args)
   {
      int[] numbers = {4, 1, 8, 3, 5};
      int src = 0;
      int dest = 4;
      int temp = numbers[src]; //numbers[0] 
      numbers[src] = numbers[dest]; //numbers[0] is now 1
      numbers[dest] = temp;
      
      for(int i = 0; i < numbers.length; i++)
      {
         System.out.print(numbers[i] + " ");
         System.out.println();
      }
   }
}