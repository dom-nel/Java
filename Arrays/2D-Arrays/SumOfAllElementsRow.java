public class SumOfAllElementsRow{

       public static void main(String[] arg)
  {
      // Declare a 2D array with 3 rows 
      // and 4 columns 
      
      int[][] numbers = {{1, 2, 3, 4},
                         {5, 6, 7, 8},
                         {9, 10, 11, 12}};
      //Accumalator                   
      int total;
      
      for (int row = 0; row < numbers.length; row++)
      {
         //Set the accumalator to 0
         total = 0;
         
         // Sum a row
         for (int col = 0; col < numbers[row].length; col++)
         
            total += numbers[row][col];
            
            //Display the row's total
            System.out.println("Total of row " + row + " is " + total);
        
      }

                         
  }// main method end

}// Sum Of All Elements end