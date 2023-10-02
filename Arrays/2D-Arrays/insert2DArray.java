public class insert2DArray {
   int arr[][] = null;
   
   // Constructor
   public insert2DArray(int numberOfRows, int numberOfColumns)
   {
      this.arr = new int[numberOfRows][numberOfColumns];
      for(int row = 0; row < arr.length; row++)
      {
         for (int col = 0; col < arr[0].length; col++)
         {
            arr[row][col] = Integer.MIN_VALUE;
         }
      }
   }
   
   
   // Inserting value in the Array 
   public void insertValueInTheArray(int row, int col, int value)
   {
      try{
         if (arr[row][col] == Integer.MIN_VALUE)
         {
            arr[row][col] = value;
            System.out.println("The value is successfully inserted");
         }else
         {
            System.out.println("The cell is already occupied");
         }
         
      }catch(ArrayIndexOutOfBoundsException e) {
      
         System.out.println("Invalid index for 2D array");
      }
   }
   
  public void accessCell(int row, int col)
  {
   System.out.println("");
  }  
   
}