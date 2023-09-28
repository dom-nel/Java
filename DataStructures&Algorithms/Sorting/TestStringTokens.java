import java.util.*;

public class TestStringTokens 
{
   public static void main(String[] args) 
   {
      StringTokenizer str = new StringTokenizer("Hello welcome back to Techies");
      int count = 0;
      while(str.hasMoreTokens())
      {
         System.out.println("" + str.nextToken());
         count++;
      }
      System.out.println(count);
   }// main method end




}// class method end