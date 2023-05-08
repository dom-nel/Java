public class RAM
{
   private String manufacturer;
   private int capacity; //How many gb
   
   /**
      Constructor that accepts arguments
      @param manf The manufacturer
      @param cap The amount of storage that is available in whole Gigabytes
   */
   public RAM(String manufacturer, int capacity)
   {
      /**field*/this.manufacturer = manufacturer/**parameter*/;
      /**field*/this.capacity = capacity/**parameter*/;
   }
   
    /**
      Copy Constructor
      @param obj a RAM object to make a copy of
     
   */
    public RAM(RAM obj)
   {
      manufacturer = obj.manufacturer;
      capacity = obj.capacity;
      
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
      @return The capacity
   */
   public int getCapacity()
   {
      return capacity;
   }
   
   //--setters--
   /**
      @param sets The manufacturer
   */
   public void setManufacturer(String manf)
   {
      manufacturer = manf;
   }
   
    /**
      @param cap sets The capacity
   */
   public void setCapacity(int cap)
   {
      capacity = cap;
   }
   
   
   public String toString()
   {
      
      //Creates a string representing the object
      String str = "The manufacturer: " + manufacturer +
                   "\nThe Capacity: " + capacity;
       
      return str;
   }



}