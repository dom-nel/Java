import java.io.*;

public class Chapter4Files
{
   //Tells the program that your acknowledging that it could be an error
   public static void main(String[] args) throws IOException
   {
      //write to a file
      //step 1 - Open the file
      PrintWriter outputFile = new PrintWriter("myFile.txt");
      
      //step 2 - Interact with the file - write data
      outputFile.println("Hello");
      outputFile.println("World");
      
      //step 3 - Close the file
      outputFile.close();
   }
}//public class Chapter4Files end
//The printwriter only overwrites whats 
//already in a file it doesnt append any data to a file
//everything gets erased when you working with printwriter