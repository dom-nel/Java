public class RotateArray{
/*
   This program demonstrates how to rotate an array left and right
*/
   public static void main(String[] args)
   {
      int[] a = {1,2,3,4,5};
      
      for(int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
      }
      
      rotateArray(a, -9);
      
      System.out.println();
      
      for(int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
      }
   }// main class end
   
   
   /*
      This methods rotates an array to the left one time
      @param arr[] Accepts an array as an argument
   */
   static void rotateOne(int[] a)
   {
      int temp = a[0];
      
      for(int i = 1; i < a.length; i++)
      {
         a[i-1] = a[i];
      }
      a[a.length - 1] = temp;
   }
   
   static void rotateArray(int[] a, int k)
   {
     /* Makes it so the method doesnt go through unnessecary loops
        If k = 10 array length is equal to 5 it will shift 0 times
        If k = 9 array length is equal to 5 it will shift 4 times
        If k = 8 array length is equal to 5 it will shift 3 times
        If k = 7 array length is equal to 5 it will shift 2 times
        If k = 6 array length is equal to 5 it will shift 1 times
        If k = 5 array length is equal to 5 it will shift 0 times
        If k = 4 array length is equal to 5 it will shift 4 times
        If k = 3 array length is equal to 5 it will shift 3 times
        If k = 2 array length is equal to 5 it will shift 2 times
        If k = 1 array length is equal to 5 it will shift 1 times
        If k = 0 array length is equal to 5 it will shift 0 times


        
     */
     k = k % a.length;
     if(k < 0)
     {
         k = k + a.length;
     }
     
     for(int i = 1; i <= k; i++)
     {
         rotateOne(a);
     }
   }

}// rotate array end