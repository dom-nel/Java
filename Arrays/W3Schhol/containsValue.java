public class containsValue {

public static int findIndex(int[] array, int value)
{
   for (int i = 0; i < array.length; i++)
   {
      if (array[i] == value)
      return i;
      
   }
   return value; 
}

public static int contains(int[] array, int value) {
   for (int i = 0; i < array.length; i++)
   {
      if (array[i] == value)
      {
         return i;
      }
     
      
        
      
      
   }
   
   
    System.out.println("Value not found");
   return value;
}

   public static void main(String[] args){   
    
    int[] my_array1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
  
    
    int index = findIndex(my_array1, 1472);
    System.out.println(index); 
         
   }
}//class end