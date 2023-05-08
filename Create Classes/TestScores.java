import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class TestScores
{
   private double scoreA;
   private double scoreB;
   private double scoreC;
   
   //no-arg constructor
   public TestScores()
   {
      scoreA = 9;
      scoreB = 6;
      scoreC = 3;
   }
   
   
   /**contrustor that accepts arguments
   @params a adds the score input for scoreA
   @params b add the score input for scoreB
   @params c add the score input for scoreB
   */
   public TestScores(double a, double b, double c)
   {
      scoreA = a;
      scoreB = b;
      scoreC = c;
   }
   
   
   
   /**method that sets score a argument
   @params a adds the score input for scoreA
  */

   public void setScoreA(double a)
   {
      scoreA = a;
   }
   
    
    
   /**method that sets score a argument
   @params b adds the score input for scoreB
  */

   public void setScoreB(double b)
   {
      scoreB = b;
   }
   
    
     
   /**method that sets score c argument
   @params c adds the score input for scoreC
  */
   public void setScoreC(double c)
   {
      scoreC = c;
   }

   
   /**method that returns the score a argument
   @returns a returns the score input for scoreA
  */

   public double getScoreA()
   {
      return scoreA;
   }
   
    
    
   /**method that returns the score b argument
   @returns b returns the score input for scoreB
  */

   public double getScoreB()
   {
      return scoreB;
   }
   
    
     
    /**method that returns the score c argument
   @returns c returns the score input for scoreC
  */
   public double getScoreC()
   {
      return scoreC;
   }

    

}