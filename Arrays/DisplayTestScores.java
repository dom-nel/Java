import java.util.Scanner;

/**
   This program demonstrates how the user may specify an arrays size
*/

public class DisplayTestScores
{
   public static void main(String[] args)
   {
      int numTests; //The number of Test
      int[] tests; //Array of test Scores
      
      //Create a Scanner Object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Get the number of test scores
      System.out.print("How many test do you have? ");
      numTests = keyboard.nextInt();
      
      //Create an array to hold that number of scores
      tests = new int[numTests];
      
      //Get the individual test scores
      for(int index = 0; index < tests.length; index++)
      {
         System.out.print("Enter test score" +
                          (index + 1) + ":");
         tests[index] = keyboard.nextInt();
       }
       
       //Display the test scores
       System.out.println();
       System.out.println("Here are the scores you entered:");
       for(int index = 0; index < tests.length; index++)
       System.out.print(tests[index] + " ");
   }
}//public class DisplayTestScores end

/*You cannot copy an array by merely assigning one array reference variable to another. 
Instead, to copy an array you need to copy an array you need to copy the individual elements of one array to another. 
Usually, this is best done with a l
*/