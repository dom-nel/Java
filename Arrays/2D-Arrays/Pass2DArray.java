public class Pass2DArray{

   /*
      This program demonstrates methods that accept
      a two dimensional array as an argument
   */

       public static void main(String[] arg)
  {
      // Declare a 2D array with 3 rows 
      // and 4 columns 
      
      int[][] numbers = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12}};
      
      // Display the contents of the array 
      System.out.println("Here are the values " +
                         "in the array. ");
      showArray(numbers);
      
      //Display the sum of the array's value.
      System.out.println("The sum of the values" + 
                         " is " + arraySum(numbers));

                         
  }// main method end
  
  
  /**
    The ShowArray method displays the contents
    of a two-dimensional int array
    @param array The array to display 
  */
  private static void showArray(int[][] array){
      
     for (int row = 0; row < array.length; row++)
        {
           for (int col = 0; col < array[row].length; col++)
               
             System.out.print(array[row][col] + " ");
             System.out.println();
        }
  }
  
  /**
   The arraySum method returns the sum of the 
   values in a two-dimensiocal int array
   @param array the array to sum
   @return The sum of the array elements
  */
  private static int arraySum(int[][] array){
      
      //Accumalator                   
      int total = 0;
      
      for (int row = 0; row < array.length; row++)
      {
         
         for (int col = 0; col < array[row].length; col++)
         
            total += array[row][col];
         
      }
      return total;
  }

}// Sum Of All Elements end