public class DisplayElements
{
   public static void main(String[] arg)
  {
      // Declare a 2D array with 3 rows 
      // and 4 columns 
      
      int[][] numbers = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12}};
    
    
    /*
      Although this code will display all of the elements, it is limited in the following way:
      The loops are specifically written to display an array with three rows and four columns. 
      A better approach is to use the arrays length field for the upper limit of the subscripts in the loop
      test expressions
    */                     
//      for (int row = 0; row < 3; row++)
//      {
//          for (int col = 0; col < 4; col++)
//          {
//             System.out.println(numbers[row][col]);
//          }
//      }

      /*
         Numbers.length holds the number of rows in the array 
         Each rows length field holds the number of columns in the row
         
         By using the length field in algorithms that process two dimensional arrays, you can write code that works
         with arrays of any number of rows and columns
      */
      
      for (int row = 0; row < numbers.length; row++)
      {
         for (int col = 0; col < numbers[row].length; col++)
         
            System.out.println(numbers[row][col]);
         
      }

   }// main end
   

}// display elements end