/**
   A class that holds a grade for a graded activity.
*/

public class GradeActivity
{
   private double score;//Numeric Score
   
   /**
      The setScore method sets the score field
      @param score The value to store in score
   */
   public void setScore(double score)
   {
      this.score = score;
   }
   
   
   /**
      The getScore method returns the score
      @return The value stored in the score field
   */
   public double getScore()
   {
      return score;
   }
   
   /**
      The getGrade method returns a letter grade
      determined from the score field
      @return the letter grade
   */
   public char getGrade()
   {
      char letterGrade;
      if (score >= 90)
         letterGrade = 'A';
      else if (score >= 80) 
         letterGrade = 'B'; 
      else if (score >= 70) 
         letterGrade = 'C';
      else if (score >= 60) 
         letterGrade = 'D';
      else  
         letterGrade = 'F';
         
      return letterGrade;
   }

}//public class GradeActivity end