public class Temperature
{
   //instance field for holidng a temp in Fahrenheit
   private int id;
   private double ftemp;
   private double ftemp1;
   
   //static field, shared amoung all instances of the class 
   public static final int FREEZING_FAHRENHEIT = 32;
   public static final int BOILING_FAHRENHEIT = 212;
   public static final int FREEZING_CELSIUS = 0;
   public static final int BOILING_CELSIUS = 100;
   
   //no-arg constructor
   public Temperature()
   {
      ftemp = 68;//room temperature is default value
      ftemp1= 13;
      id = 12345;
   }
   
   /**
      Constructor that accepts an argument for the temperature
      @param f the Temperature in Fahrenheit
   */
   public Temperature(double ftemp, double ftemp1, int id)
   {
      this.ftemp = ftemp;
      this.ftemp1 = ftemp1;
      this.id = id;
   }
      /**
      Mutator (setter) method
      @param id The temperature in Fahrenheit
   */
   public void setId(int id)
   {
      this.id = id;
   }
   
    /**
      Accessor (getter) method
      @return The temperature in Fahrenheit
   */
   public int getId()
   {
     return id;
   }

      
      
      /**
      Mutator (setter) method
      @param ftemp The temperature in Fahrenheit
   */
   public void setFahrenheit(double ftemp)
   {
      this.ftemp = ftemp;
   }
   
    /**
      Accessor (getter) method
      @return The temperature in Fahrenheit
   */
   public double getFahrenheit()
   {
     return ftemp;
   }
   
    /**
      Accessor (getter) method
      @return The temperature in Fahrenheit
   */
   public double getFahrenheit1()
   {
     return ftemp1;
   }

   
   /** 
      Method for getting the temperature in Celsius 
      @return The temperature in Celsius
   */
   public double getCelsius()
   {
      return 5.0 / 9.0 * (ftemp - 32);
   }
   
   /** 
      Method for getting the temperature in Kelvin
      @return The temperature in Kelvin
   */
   public double getKelvin()
   {
      return (5.0 / 9.0 * (ftemp - 32)) + 273;
   }

   /**
      @areturn a String representation of a Student
   */ 
   public String toString()
   {
      return 
             "Id: " + id +
             "\nFahrenheit:" + ftemp +
             "\nFahrenheit1:" + ftemp1;
   }
   
   /**
      Compare two Temperature objects
      @param obj The Temperature objects to compare to this one
      @return True if the objects are the same, false otherwise
   */
   public boolean equals(Temperature obj)
   {
      //define how we consider two Students to be equal
      if(id == obj.id)
      return true;
      else
      return false;
   }
}