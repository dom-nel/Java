import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Main {
   public static void main(String[] args)
   {
      ArrayList<Integer> numbers = new ArrayList<Integer>();
      numbers.add(1);
      numbers.add(2);
      numbers.add(3);
      
      
      ArrayList<String> stringList = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
      
      for (String letter: stringList)
      {
      if (letter.equals("C"))
      {
         System.out.println("The element is found");
         break;
      }
      }
      
      // index of
      int index = stringList.indexOf("C");
      System.out.println("The element is found at index: " + index);
      
      
      
      
      
      
      
      
      
      
      
         }
}//class end