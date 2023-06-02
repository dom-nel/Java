import java.util.Scanner;


/*
   This programs demonstrates how to add values to a two dimensional array
*/
public class ColumnsAndRows{
   public static void main(String[] args)
   {
            Scanner keyboard = new Scanner(System.in);
            final int ROWS = 3;
            final int COLS = 4;
            
            // creates a two dimensional array 
            double[][] scores = new double[ROWS][COLS];
            
            
              // for loop to add value to rows and cols
                 for (int row = 0; row < ROWS; row++)
            {
               
               // for loop to display the columns
                for (int col = 0; col < COLS; col++)
               {
                  System.out.println("Enter a Score");
                  scores[row][col] = keyboard.nextDouble();
               }
         
            }
         
            
            
            // for loop to display the rows
            for (int row = 0; row < ROWS; row++)
            {
               
               // for loop to display the columns
                for (int col = 0; col < COLS; col++)
               {
                  System.out.println(scores[row][col]);
               }
         
            }

   }// main end
   
   
}// class end