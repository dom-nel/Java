import java.io.*;
//classes in java.io PrintWriter, File, IOException, FileWriter

import java.util.Scanner;

public class Chapter4AppendToFiles
{
   //Tells the program that your acknowledging that it could be an error
   public static void main(String[] args) throws IOException
   {
      //appending data to a file
      //the second argument is if you want to open in append mode.
      FileWriter fw = new FileWriter("myFile.txt", true);
      PrintWriter outputFile = new PrintWriter(fw);
      
      outputFile.println("Appending");
      outputFile.println("Data");
      
      outputFile.close();
   }
   
}