import java.io.*;
//classes in java.io PrintWriter, File, IOException

import java.util.Scanner;

public class Chapter4ReadFromFiles
{
   //Tells the program that your acknowledging that it could be an error
   public static void main(String[] args) throws IOException
   {
      //read from a file
      //step 1 - Open the file
      File file = new File("myFile.txt");
      
      if(!file.exist())//make sure the file exists
      {
         System.out.println("Unable to locate the file.");
         System.exit(0);//exit the program early
      }
      
      //creates a scanner object with the file object as the argument
      Scanner inputFile = new Scanner(file);
      String s; 
      int i;
      double d;
      //use while loop - process the file as long as I havent hit the end yet
      //hasNext() boolean return type that checks to see if any data is left
      while(inputFile.hasNext())
      {
         s = inputFile.nextLine();
         i = inputFile.nextInt();
         d = inputFile.nextDouble();
         
         System.out.println(s);
         System.out.println(i);
         System.out.println(d);
         
         
      }
      
      inputFile.close();
      /*  
      
      Dont hard code data from a file like this use the while loop 
      System.out.println("First line of the file: " + inputFile.nextLine());
      System.out.println("Second line of the file: " + inputFile.nextLine());
      
      */
     
      
      
   }
}//public class Chapter4ReadFromFiles end
