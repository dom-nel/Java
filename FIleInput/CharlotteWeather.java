import java.io.*;
//classes in java.io PrintWriter, File, IOException, FileWriter

import java.util.Scanner;

public class CharlotteWeather
{
   //Tells the program that your acknowledging that it could be an error
   public static void main(String[] args) throws IOException
   {
      //want to open and process a text file
      //containing info about Charlotte's
      //weather 
      File file = new File("CharlotteWeather.txt");
      
      Scanner inputFile = new Scanner(file);//open the file
      
      String month;
      int highTemp;
      int lowTemp;
      double rainFall;
      
      if(!file.exists())
      {
         System.out.println("Unable to open file");
         System.exit(0);
      }
      
      //use a loop to process all the contents of the file
      while(inputFile.hasNext())
      {
         month = inputFile.nextLine();
         lowTemp = inputFile.nextInt();
         highTemp = inputFile.nextInt();
         rainFall = inputFile.nextDouble();
         
         if(inputFile.hasNext())
            inputFile.nextLine(); //clear the newLine
         if(inputFile.hasNext())   
            inputFile.nextLine(); //skip the blankLine in the file
         
         System.out.println("Month: " + month);
         System.out.println("low temp: " + lowTemp);
         System.out.println("High Temp: " + highTemp);
         System.out.println("RainFall: " + rainFall);
         System.out.println();
         
      }
      
      //close the file
      inputFile.close();
   }
   
}