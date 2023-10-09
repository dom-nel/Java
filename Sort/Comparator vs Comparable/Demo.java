import java.util.ArrayList;
import java.util.List;

public class Demo {
   public static void main(String[] args)
   {
      List<Integer> nums = new ArrayList<>();
      nums.add(1);
      nums.add(2);
      nums.add(3);
      nums.add(4);
      
      String numsString = nums.toString();
      System.out.println(numsString);
   }
   
}// class end