public class sumOfArrays {
   public static void main(String[] args)
   {
      int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
      int sum = 0; 
      
      for (int i = 0; i < my_array.length; i++)
      {
         sum += my_array[i]; 
      }
      
      System.out.println("The sum of my_array is " + sum);
   }// main end
   
}// class end 