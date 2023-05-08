import java.util.Scanner;

/**
   This program shows an array being processed with loops
*/

public class Test1
{
   public static void main(String[] args)
   {
      //creates a scanner object from the scanner class
      Scanner keyboard = new Scanner(System.in);
      
      //inintilizes the constructor arguments
      double scoreA, scoreB, scoreC;
      
      //gathers input for score A
      System.out.println("Please enter score A");
      scoreA = keyboard.nextDouble();
      
      //gathers input for score B
      System.out.println("Please enter score B");
      scoreB = keyboard.nextDouble();
      
      //gathers input for score C
      System.out.println("Please enter score C");
      scoreC = keyboard.nextDouble();
      
      //Creates testscore object and passes the score A, score B, and score C input 
      TestScores ts = new TestScores(scoreA, scoreB, scoreC);
      
      //Calls the setScore method that sets the score for score A
      ts.setScoreA(scoreA);
      
      
      //Calls the setScore method that sets the score for score B
      ts.setScoreB(scoreB);
      
      //Calls the setScore method that sets the score for score C
      ts.setScoreC(scoreC);
      
      printTestInfo(ts);
   }
   
   
     /**
   Prints out information about Circle object
   @param c The circle
   */
   public static void printTestInfo(TestScores ts)
   {
      
      System.out.println("The radius of the circle is:" + ts.getScoreA());
      System.out.println("The area of the circle is:" + ts.getScoreB());
      System.out.println("The area of the circle is:" + ts.getScoreC());
      
   }

}