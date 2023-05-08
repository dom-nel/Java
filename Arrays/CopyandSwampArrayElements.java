import java.util.Scanner;
public class CopyandSwampArrayElements {
   public static void main (String [] args) {
      Scanner scnr = new Scanner(System.in);
      final int SCORES_SIZE = 4;
      int[] oldScores = new int[SCORES_SIZE];
      int[] newScores = new int[SCORES_SIZE];
      int i;

      for (i = 0; i < oldScores.length; ++i) {
         oldScores[i] = scnr.nextInt();
      }

      for (i = 0; i < oldScores.length; ++i) {
         newScores[i] = oldScores[i];
      }
      
        
         
         int temp0 = newScores[0];
         newScores[0] = newScores[1];
         int temp2 = newScores[2];
         newScores[1] = temp2;
         int temp3 = newScores[3];
         newScores[2] = temp3;
         newScores[3] = temp0;


      for (i = 0; i < newScores.length; ++i) {
         System.out.print(newScores[i] + " ");
      }
      System.out.println();
   }
}