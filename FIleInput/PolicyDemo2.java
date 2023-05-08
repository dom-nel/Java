import java.util.Scanner;
import java.io.*;

public class PolicyDemo2 
{   
   public static void main(String[] args) throws IOException
   {
      //declare variables
      String policyNumber;
      String providerName;
      String firstName;
      String lastName;
      int age;
      String smokingStatus;
      double height;
      double weight;
      
      //read from a file
      File file = new File("PolicyInformation.txt");
      
      //creates a scanner object with the file object as the argument
      Scanner inputFile = new Scanner(file);
      
      //use while loop - process the file as long as I havent hit the end yet
      //hasNext() boolean return type that checks to see if any data is left
      while(inputFile.hasNext())
      {
         //prompt the user to enter information about the Policy 
         System.out.print("Please enter the Policy Number: ");
         policyNumber = inputFile.nextLine();

         
      }
      
      //create a Policy object
      Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

   }//public static void main(String[] args) throws IOException end
   
}//public class PolicyDemo2 end