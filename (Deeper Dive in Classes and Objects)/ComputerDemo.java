import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class ComputerDemo 
{   
   public static void main(String[] args) throws IOException
   {
      //create our processor
      CPU processor = new CPU("Intel", 16, 5.2);
      
      //create out Ram
      RAM memory = new RAM("Kingston", 100);
      
      //construct a Computer object - by using the processor and RAM we have
      Computer comp = new Computer("HP", processor, memory);
      
      
      
      System.out.println("Computer Manufacturer: " + comp.getManufacturer());
      System.out.println(comp.getProcessor());
      System.out.println(comp.getMemory());
      
      
   }
}