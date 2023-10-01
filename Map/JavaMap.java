import java.util.*;

public class JavaMap {
   public static void main(String[] args)
   {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      sc.nextLine();
      
      Map<String, Integer> map = new HashMap<>();
      
      for(int i = 0; i < n; i++)
      {
         String name = sc.nextLine();
         int phone = sc.nextInt();
         map.put(name, phone);
         sc.nextLine();
      }
      
      while(sc.hasNext())
      {
         String s = sc.nextLine();
         if (map.get(s) != null)
         {
            System.out.println( s + "=" + map.get(s));
         } else {
            System.out.println("Not found");
         }
      }
   }
}