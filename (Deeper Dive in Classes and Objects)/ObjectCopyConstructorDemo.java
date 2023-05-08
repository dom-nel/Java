/**
   This program demonstrates the Stock class's
   toString method.
*/

public class ObjectCopyConstructorDemo
{
   public static void main(String[] args)
   {
      // Create a Stock object for the XYZ Company.
      // The trading symbol is XYZ and the current
      // price per share is $9.62.
      Stock xyzCompany = new Stock ("XYZ", 9.62);
      
      //Create another Stock object that is a copy of the company1 object
      Stock xyzCompany2 = new Stock(xyzCompany);
      // Display the object's values.
      System.out.println(xyzCompany2);
      xyzCompany2.setSharePrice(11.99);
      System.out.println(xyzCompany2);
      
       //Confirm that we actually have two objects
      if (xyzCompany == xyzCompany2)
      {
         System.out.println("The company1 and company2 " +
                           "variable reference the same object. ");
      }
      else
      {
         System.out.println("The company1 and company2 " + 
                           "variables reference different objects. ");
      }

   }
}