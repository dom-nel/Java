import java.util.Scanner;
public class Rectangle
{//public class template
	   
      private double length;
      private double width;
       
      
         
      
      /**
         contrustor
      */   
      
      public Rectangle()
      {
         length = 0;
         width = 0;
      }
      
      
        
      /**
         contrustor that accepts arguments
         width = w
         length = l 
      */   
      public Rectangle(double w, double l)
      {
         length = l;
         width = w;
      }

      /**
         The setLength method stores a value in the length field
         @param len The value to store in length
      */
      
      public void setLength(double len)
      {
         length = len;
      }
      
       /**
         The setWidth method stores a value in the width field
         @param w The value to store in width
      */
      
      public void setWidth(double w)
      {
         width = w;
      }
      
      
       public double getLength()
      {
         return length;
      }

      
        public double getWidth()
      {
         return width;
      }

       public double getArea()
      {
         return length * width;
      }

}