import java.util.*;
import java.util.Arrays;

public class Hackerrank2DayArray {
    public static void main(String[] args)
    {
      Scanner scanner = new Scanner(System.in);
      
      int n = 6; //Number of rows
      int m = 6; //Number of columns
      
      int[][] arr = new int[n][m]; //Creates a 2d array
      
      //read input values into the 2D array
      for(int i = 0; i < n; i++) // creates the rows 
      {
         for(int j = 0; j < m; j++) //create the columns
         {
            arr[i][j] = scanner.nextInt();
         }
      }// for loop end
      
      
      //Initialize maxSum to a very low value
      int maxSum = Integer.MIN_VALUE;
      
      //Iterate through the array to find the largest sum among all hourglasses
      for (int i = 0; i < n - 2; i++){
         for(int j = 0; j < m -2; j++) {
            int hourglassSum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                               + arr[i+1][j+1]
                               + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                               
            if (hourglassSum > maxSum) {
             maxSum = hourglassSum;
            }
         }
      }
      
      System.out.println(maxSum);
      
    }// main end

}