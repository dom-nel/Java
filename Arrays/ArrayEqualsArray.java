import java.util.Scanner;

/**
   This program  demonstrates passing individual array elements as arguments to a method
*/

public class ArrayEqualsArray
{
   public static void main(String[] args)
   {
      int[] firstArray = {2, 4, 6, 8, 10};
      int[] secondArray = {2, 4, 6, 8, 10};
      boolean arraysEqual = true; //Flag variable
      int index = 0;             //Loop variable  
      
      //First determine whether the arrays are the same size
      if (firstArray.length != secondArray.length)
         arraysEqual = false; 
         
      // Next determine whether the elements contain the same data.
      while (arraysEqual && index < firstArray.length) 
      {
         if (firstArray[index] != secondArray[index])
            arraysEqual = false;
            index++;
      }
      
      if (arraysEqual)
         System.out.println("The arrays are equal");
      else
         System.out.println("The arrays are not equal");
   }
   
}
