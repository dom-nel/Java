/**
   This class stores data about a textbook
*/

public class TextBook
{
   private String title; //Title of the book
   private String author; //Authors Last Name
   private String publisher; //Name of publisher
   
   /**
      This constructor intializes the title, 
      author, and publisher fields
      @param textTitle the books Title
      @param auth The author name
      @param pub The name of the publisher
      
   */
   
   public TextBook(String textTitle, String auth,
                    String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }
   
   /**
   The copy constructor initilizes the object
   as a copy of another TextBook object
   @param object2 The object to copy
   */
   public TextBook(TextBook object2)
   {
   
   title = object2.title;
   author = object2.author;
   publisher = object2.publisher;
   
   }
   
   /**
   The set method sets a value for each field
   @param textTitle The books title
   @param auth The authors name
   @param pub the name of the publisher
   
   */
   public void set(String textTitle, String auth,
                  String pub)
   {
      title = textTitle;
      author = auth;
      publisher = pub;
   }
   
   /**
      toString method
      @return A string containing the Textbook information
   */
   public String toString()
   {
      //Create a string representing the object
      String str = "Title: " + title +
                   "\nAuthor: " + author +
                   "\nPublisher: " + publisher;
                   
      return str;
   }
}