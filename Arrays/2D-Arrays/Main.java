import java.util.Arrays;

public class Main {
   public static void main(String[] args)
   {
      //Step 1 -Declare
      int[][] int2DArray;
      
      //Step 2 - Instantiate
      int2DArray = new int[2][2];
      
      //Step 3 - Initialize
      int2DArray[0][0] = 1;
      int2DArray[0][1] = 2;
      int2DArray[1][0] = 3;
      int2DArray[1][1] = 4;
      
      // Using the 2D to string method on the 2D method
      System.out.println(Arrays.deepToString(int2DArray));
      
      
   }
}// class end