import java.io.*;
import java.util.*;
import java.util.Set;
import java.util.HashSet;

public class HackerRankHashSet {
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int t = sc.nextInt();
      String[] pair_left = new String[t];
      String[] pair_right = new String[t];
      
      for (int i = 0; i < t; i++)
      {
         pair_left[i] = sc.next();
         pair_right[i] = sc.next();
      }
      
      Set<List<String>> set = new HashSet<>();
      
      for (int i = 0; i < t; i++)
      {
         List<String> list = new ArrayList<>();
         list.add(pair_left[i]);
         list.add(pair_right[i]);
         
         set.add(list);
         System.out.println(set.size());
      }
   }// main end
}//class end