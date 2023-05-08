public class CPU
{
   private String manufacturer;
   private int numCores;
   private double clockSpeed;
   
   
   
   
   /**
      No arg Constructor that accepts arguments
     
   */
   
   public CPU()
   {
      manufacturer = "HP";
      numCores = 8;
      clockSpeed = 6.2;
   }

   
   /**
      Constructor that accepts arguments
      @param manf The manufacturer
      @param cores The number of cores
      @param speed The clock Speed
   */
   
   public CPU(String manf, int cores, double speed)
   {
      manufacturer = manf;
      numCores = cores;
      clockSpeed = speed;
      
   }
   
    
   /**
      Copy Constructor
      @param obj a CPU object to make a copy of
     
   */
    public CPU(CPU obj)
   {
      manufacturer = obj.manufacturer;
      numCores = obj.numCores;
      clockSpeed = obj.clockSpeed;
   }

   
   
   //--getters--
   /**
      @return The manufacturer
   */
   public String getManufacturer()
   {
      return manufacturer;
   }
   
    
   /**
      @return The numCores 
   */
   public int getNumCores()
   {
      return numCores;
   }
   
   /**
      @return The clockSpeed 
   */
   public double getClockSpeed()
   {
      return clockSpeed;
   }
   
    
   //--setters--
   /**
      @param manf The manufacturer
   */
   public void setManufacturer(String manf)
   {
       manufacturer = manf;
   }
   
    
   /**
      @param cores Sets the number of cores 
   */
   public void setNumCores(int cores)
   {
      numCores = cores;
   }
   
   /**
      @param speed Sets Sets the clock speed 
   */
   public void setClockSpeed(double speed)
   {
      clockSpeed = speed;
   }


   public String toString()
   {
      
      //Creates a string representing the object
      String str = "The manufacturer: " + manufacturer +
                   "\nThe number of Cores: " + numCores +
                   "\nThe clock speed of the cpu: " + clockSpeed;
       
      return str;
   }
}
