import java.util.*;

public class calcAvgTemp
{
      public static void main(String[] args)
      {
      //gathers users input 
      Scanner scn = new Scanner(System.in);
      double sum = 0; 
      int count = 0;
      double average = 0;
      
      
      System.out.println("How many day's temperature");
      int days = scn.nextInt();
      
      double[] array = new double[days];
      
      for (int i = 0; i < days; i++)
      {
         int d = i + 1; 
         System.out.println("Day " + d + "'s high temp: ");
         
         array[i] = scn.nextDouble();
         
         sum += array[i];
         
         average = sum / array.length;
         
         if (array[i] > average)
         {
            count += count;
         }
         
         
      }
      
     
      System.out.println("Average = " + average);
      System.out.println(count + " day(s) above average");
      }// main end
}//class end