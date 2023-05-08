import java.util.Scanner;

/**
   Basic Demonstration of how to add numbers to an array
*/

public class SimpleArray
{
   public static void main(String[] args)
   {
     
     /*This is how you manually add things to an array
     //points scored over 3 games
     
     
     int [] scores; //declares an aray reference variable
     scores = new int[3];//creates an array that can only hold three integers
     
     //manually adding numbers to the array
     scores[0] = 21;
     scores[1] = 17;
     scores[2] = 31;
     System.out.println("Game1:" + scores[0]);
     System.out.println("Game2:" + scores[1]);
     System.out.println("Game3:" + scores[2]);
     
     //if you already know the values you want to enter into the array
     //int[] scores = {21, 17, 31} implicit sizing, it assumes we have three values in the array
     //this is the same as the array above
     */
      
      //Now we will print from an array with a for loop
      
      
      
     int [] scores; //declares an aray reference variable
     scores = new int[3];//creates an array that can only hold three integers
     
     //manually adding numbers to the array
     scores[0] = 21;
     scores[1] = 17;
     scores[2] = 31;

      for(int i=0; i < scores.length ; i++)
     {
      System.out.println("Game "+(i+1)+":" +scores[i]);
     }
     
     //You dont have to add the brackets you only have to pass its reference variable(scores)
     System.out.println( "The average score is " + findAverageScore(scores) );
   }
   
   /**
      Finds the average score of an array of games
      @param scores An array of scores
      @return the average score
   */
   /**if you were to add brackets[] to the double return it would return an array of doubles*/ 
   public static double findAverageScore(int[] scores)
   {
      double sum = 0;//acumulator
      for (int i = 0; i < scores.length; i++)
      {
         sum += scores[i];
         //this sum variable is used to add up the scores
         
      }
      
      return sum / scores.length;
      //you can also return a reference to an array
      
   }
}