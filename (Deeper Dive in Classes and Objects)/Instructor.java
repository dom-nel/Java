/**
   This class stores data about an instructor 
*/

public class Instructor
{
   private String lastName; //Last Name
   private String firstName; //First Name
   private String officeNumber; //Office Number
   
   /**
      This constructor intializes the last name, 
      first name and office number
      @param lname The instructors last name
      @param fname The instructors first name
      @param office The office number
      
   */
   
   public Instructor(String lname, String fname,
                    String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   /**
   The copy constructor initilizes the object
   as a copy of another Instructor object
   @param object2 The object to copy
   */
   public Instructor(Instructor object2)
   {
   
   lastName = object2.lastName;
   firstName = object2.firstName;
   officeNumber = object2.officeNumber;
   
   }
   
   /**
   The set method sets a value for each field
   @param lname The instructors last name
   @param fname The instructors first name
   @param office The office number
   
   */
   public void set(String lname, String fname,
                  String office)
   {
      lastName = lname;
      firstName = fname;
      officeNumber = office;
   }
   
   /**
      toString method
      @return A string containing the instructor information
   */
   public String toString()
   {
      //Create a string representing the object
      String str = "Last Name: " + lastName +
                   "\nFirst Name: " + firstName +
                   "\nOffice Number: " + officeNumber;
                   
      return str;
   }
}