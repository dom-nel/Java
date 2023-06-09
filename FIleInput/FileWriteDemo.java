import java.util.Scanner;
import java.io.*;

/**
   This program writes data to a file
*/

public class FileWriteDemo
{
   public static void main(String[] args) throws IOException
   {
      String filename; //file name
      String friendName; //Friend's name
      int numFriends;
      
      //Create a Scanner object for keyboard input
      Scanner keyboard = new Scanner(System.in);
      
      //Get the number of friends
      System.out.print("How many friends do you have? ");
      numFriends = keyboard.nextInt();
      
      //Consume the remaining newline character
      keyboard.nextLine();
      
      //Get the filename
      System.out.print("Enter the filename: ");
      filename = keyboard.nextLine();
      
      //Open the file
      PrintWriter outputFile = new PrintWriter(filename);
      
      //Get data and write it to the file
      for (int index = 1; index <= numFriends; index++)
      {
         //Get the name of a friend
         System.out.print("Enter the name of friend "
                         + "number" + index + ": ");
         friendName = keyboard.nextLine();
         
         //Write the name to the file
         outputFile.println(friendName);
         
      }
      
      // Close the file 
      outputFile.close();
      System.out.println("Data written to the file.");
   }
}