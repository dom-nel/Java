/**
   This program passes an object as an argument
*/

public class PassObject
{
   public static void main(String[] args)
   {
      //Create a Rectangle object
      Rectangle box = new Rectangle(12.0, 5.0);
      
      //Pass a reference to the object to
      // the displayRectanlge method
      displayRectangle(box);
      //box and r references the same object
   }
   
   /**
      The displayRectangle method displays the 
      length and width of a rectangle
      @param r A references to a Rectangle
               object
   */
   
   public static void displayRectangle(Rectangle r)
   {
      //Display the length and width
      System.out.println("Length : " + r.getLength() +
      "Width : " + r.getWidth());
   }
}//public class PassObject