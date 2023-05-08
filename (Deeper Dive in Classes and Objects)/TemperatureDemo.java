public class TemperatureDemo
{
   public static void main(String[] args)
   {
      Temperature temp2;
      boolean areEqual;
      //instantiate a Temperature object
      Temperature temp = new Temperature(12,15,12345);
      temp2 = copyTemp(temp);
      temp2.setId(12345);
      System.out.println(temp2);
      
      if(temp.equals(temp2))
         areEqual = true;
      else
         areEqual = false;      
      System.out.println(areEqual);
      
      //If the setFahrenheit method is called inside of the displayTempInfo method
      //It will change the field of the temperature
      //System.out.println(temp.getFahrenheit());
      //displayTempInfo(temp);
      //System.out.println(temp.getFahrenheit());//changed to zero because the set method was called inside the 
      //displayTempInfo method
      
      
   }
   
   //Created a method to display the temperature object
   public static void displayTempInfo(Temperature t)
   {
      System.out.println("Fahrenheit: " + t.getFahrenheit());
      System.out.println("Celsius: " + t.getCelsius());
      System.out.println("Kelvin: " + t.getKelvin());
      t.setFahrenheit(0);//causes the argument to be changed!!!!
    }
    
    
    //copy a Temperature object
    public static Temperature copyTemp(Temperature t)
    {
      //look at the value of the t object fields, and use them to create a NEW Temperature object
      return new Temperature(t.getFahrenheit(), t.getFahrenheit1(), t.getId());
    }
}//Temperature Demo end