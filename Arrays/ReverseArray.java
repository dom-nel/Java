import java.util.Scanner;

public class ReverseArray {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int NUM_VALS = 4;
      int [] courseGrades = new int[NUM_VALS];
      int i;

      for (i = 0; i < courseGrades.length; ++i) {
         courseGrades[i] = scnr.nextInt();
      }

      /* Your solution goes here  */
       
           for (i = 0; i < courseGrades.length; ++i) 
           {
         System.out.print(courseGrades[i] + " "  );
           }
      System.out.print("\n");
         
 
       for (i = courseGrades.length - 1; i >-1; i--) {
         System.out.print(courseGrades[i] + " "  );
      }
       System.out.print("\n");
     
         
      
   }
}