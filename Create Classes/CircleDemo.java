import java.util.*;

public class CircleDemo
{
   public static void main(String[] args)
   {
      Circle c = new Circle(); //instantiate our Circle object
      c.setRadius(150);
     // System.out.println("The radius of my first circle is " + c.getRadius());
      //System.out.println("The area of my first circle is " + c.getArea());
      //System.out.println("The radius of my first circle is " + c.getCircumference());
      
      
      Circle c2 = new Circle(); //instantiate a second Circle object for testing
      c2.setRadius(1000);
      //System.out.println("The radius of my second circle is " + c2.getRadius());
      //System.out.println("The area of my second circle is " + c2.getArea());
      //System.out.println("The radius of my second circle is " + c2.getCircumference());
      printCircleInfo(c);
      
      

   }
   
   
     /**
   Prints out information about Circle object
   @param c The circle
   */
   public static void printCircleInfo(Circle c)
   {
      
      System.out.println("The radius of the circle is:" + c.getRadius());
      System.out.println("The area of the circle is:" + c.getArea());
      System.out.println("The area of the circle is:" + c.getDiameter());
      
   }

}