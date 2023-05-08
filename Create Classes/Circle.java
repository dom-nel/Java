public class Circle
{
   //instance fields to hold the radius of the circle
   private double radius;
   private final double PI = 3.14159;
   /**
   Sets the radius of the circle
   @param r the radius
   */
   public void setRadius(double r)
   {
      radius = r;
   }
   
    /**
   Returns the radius of the circle
   @param r the radius
   */
   public double getRadius()
   {
      return radius;
   }
   
     /**
   Returns the area of the circle
   @param r the radius
   */
   public double getArea()
   {
      double area = Math.PI * radius * radius;
      return area;
   }
   
   /**
   Returns the diameter of the circle
   @param r the radius
   */
   public double getDiameter()
   {
      double diameter = radius * 2;
      return diameter;
   }
   
   /**
   Returns the circumference of the circle
   @param r the radius
   */
   public double getCircumference()
   {
      double circumference = 2 * Math.PI * radius;
      return circumference;
   }



  
}