public class returnInt
{  


   public static int rI(String[] s, String st)
   {
      for (int i = 0; i < s.length; i++)
      {
         if (s[i].equals(st))
         {
            return i;
         }
      }
      return 1;
   }
   
   public static void main(String[] args)
   {
      String[] a = {"Domonique", "Bri", "Gabby"};
      
      int value = rI(a, "Gabby");
      
      System.out.println(value);
   }
}// class end