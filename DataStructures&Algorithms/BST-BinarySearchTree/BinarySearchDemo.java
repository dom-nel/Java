public class BinarySearchDemo{
   public static void main(String[] args)
   {
     
      BinarySearch binarySearch = new BinarySearch();
      
      int targetValue = 7;
      
      int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
		41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
      
      
      int index = binarySearch.doSearch(primes, targetValue);

   
        System.out.println("Element found at index " + index);
   );
   

   }

}// binarysearchdemo end



    
    
   
    