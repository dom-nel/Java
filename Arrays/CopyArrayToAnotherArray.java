
/*You cannot copy an array by merely assigning one array reference variable to another. 
Instead, to copy an array you need to copy an array you need to copy the individual elements of one array to another. 
Usually, this is best done with a l
*/

public class CopyArrayToAnotherArray
{
   public static void main(String[] args)
   {
      int[] firstArray = {5, 10, 15, 20, 25};
      int[] secondArray = new int[5];
      
      for (int index = 0; index < firstArray.length; index++)
      {
         secondArray[index] = firstArray[index];
      }
      
     //loops through second array after it was copied
      for (int index = 0; index < firstArray.length; index++)
      {
         System.out.println(secondArray[index]);
      }
   }
}//public class CopyArrayToAnotherArray end