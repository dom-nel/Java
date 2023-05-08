/**
   This program passes an object as an argument 
   The object is modified by the recieving method
*/

public class PassObject2
{
   public static void main(String[] args)
   {
      //Create a Rectangle object
      Rectangle box = new Rectangle(12.0, 5.0);
      
      //Display the objects contents
      System.out.println("Contents of the box object: ");
      System.out.println("Length : " + box.getLength() + 
                        "Width : " + box.getWidth());
                        
      //Pass a reference to the object to the
      //changeRectangle method. 
      changeRectangle(box);
      
      //Display the objects contents again 
      System.out.println("\nNow the Contents of the box object are: ");
      System.out.println("Length : " + box.getLength() + 
                        "Width : " + box.getWidth());

      
   }
   
   /**
      The changeRectangle method sets a Rectangle
      objects length and width to 0
      @param r The Rectangle object to change
   */
   //If you create a method that sets the length and width and not simply read it you will change the entire class as well
   public static void changeRectangle(Rectangle r)
   {
      r.setLength(0.0);
      r.setWidth(0.0);
   }
}//public class PassObject2