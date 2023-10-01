public class BIGOExample {
   public static void printNumbers(int a, int b)
   {
      for (int i = 0; i < a; i++)
      {
         System.out.println(i);
      }
      
      for (int j = 0; j < b; j++)
      {
          System.out.println(j);    
      }
   }
   
   /* 
      Add the Runtimes: O(A + B)
      
      if your algorithm is in the form "do this, then when
      you are all done, do that" then you add the runtimes
   */
   
   
   
      public static void printNumber(int a, int b)
   {
      for (int i = 0; i < a; i++)
      {
          for (int j = 0; j < b; j++)
          {
          System.out.println(i + " " + j);    
          }
      }
      
     
   }
   
   /* 
      Add the Runtimes: O(A * B)
      
      if your algorithm is in the form "do this for each
      time you do that" then you mutiply the runtimes. 
   */
   
   public static void main(String[] args)
   {
      printNumber(2, 9);
   }
}