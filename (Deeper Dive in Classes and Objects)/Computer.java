public class Computer
{
  
   private String manufacturer;
   private CPU processor; //aggregation
   private RAM memory; //aggregation
   
   /**
      @param manf The manufacturer
      @param proc The processor
      @param mem The RAM
   */
   public Computer(String manufacturer, CPU processor, RAM memory)
   {
      this.manufacturer = manufacturer; 
      this.processor = new CPU(processor);//use the copy constructor to make a deep copy of the object
      this.memory = new RAM(memory);//use the copy constructor to make a deep copy of the object
   }
   
   //--getters--
   /**
      @ return the manufacturer
   */
   public String getManufacturer()
   {
      return manufacturer;
   }
   
   /**
      @ return the processor
   */
   public CPU getProcessor()
   {
      return new CPU(processor);//return a copy of my object
   }
   
   /**
      @ return the memory
   */
   public RAM getMemory()
   {
      return new RAM(memory);//return a copy of my object
   }
   
   /**
      @param manf The manufacturer
   */
   public void setManufacturer(String manf)
   {
      manufacturer = manf;
   }
   
   /**
      @param cpu The processor
   */
   public void setProcessor(CPU proc)
   {
      processor = new CPU(proc);//make a deep copy of the proc argument
   }
   
    /**
      @param mem The RAM
   */
   public void setMemory(RAM mem)
   {
      memory = new RAM(mem);//make a deep copy of the proc argument
   }





}