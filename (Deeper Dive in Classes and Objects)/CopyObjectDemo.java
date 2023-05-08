public class CopyObjectDemo
{
   public static void main(String[] args)
   {
      Temperature temp = new Temperature(32,1);
      Temperature temp2 = copyTemp(temp);
      System.out.println(temp2.getFahrenheit());
      System.out.println(temp2.getFahrenheit1());
   }
   
   //copy a Temperature object
   public static Temperature copyTemp(Temperature t)
   {
     //look at the value of the t object fields, and use them to create a NEW Temperature object
     return new Temperature(t.getFahrenheit(), t.getFahrenheit1());
   }

}