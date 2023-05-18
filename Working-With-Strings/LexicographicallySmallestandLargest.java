import java.util.Scanner;


public class LexicographicallySmallestandLargest {
      public static String getSmallestAndLargest(String s, int k) {
        String str = s.substring(0, k);
        String smallest = str;
        String largest = str;
        
       
        
        
            for (int i = 1; i <= s.length() - k; i++ )
            {
                str = s.substring(i, i+k);
                
                if(str.compareTo(smallest) < 0)
                {
                    smallest = str;
                }
                
                if(str.compareTo(largest) > 0)
                {
                    largest = str;
                }
            }
        
        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        
        return smallest + "\n" + largest;
        
        }
        
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string ex. welcometojava");
        String s = scan.next();
        
        System.out.println("Enter substring length");
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}