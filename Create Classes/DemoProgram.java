import java.util.*;

public class DemoProgram
{
   //instance fields to hold the radius of the circle
   private String symbol;
   private String name;
   private double priorClosingPrice;
   private double currentPrice;
   
   
   public DemoProgram(String sym, String n, double pcp, double cp)
   {
      symbol = sym;
      name = n;
      priorClosingPrice = pcp;
      currentPrice = cp;

   }
   
   /**
   Sets the symbol
   @param s the symbol
   */
   public void setSymbol(String s)
   {
      symbol = s;
   }
   
    /**
   Sets the name
   @param s the name
   */
   public void setName(String n)
   {
      name = n;
   }
   
     /**
   Sets the prior closing price
   @param c closing price
   */
   public void setPriorClosingPrice(double p)
   {
      priorClosingPrice = p;
   }
   
   /**
   Sets the current price
   @param c current price
   */
   public void setCurrentPrice(double c)
   {
      currentPrice = c;
   }

  /**
   Gets the symbol
   @param s the symbol
   */
   public String getSymbol()
   {
      return symbol;
   }
   
    /**
   Gets the name
   @param s the name
   */
   public String getName()
   {
      return name;
   }
   
     /**
   Gets the prior closing price
   @param c closing price
   */
   public double getPriorClosingPrice()
   {
      return priorClosingPrice;
   }
   
   /**
   Gets the current price
   @param c current price
   */
   public double getCurrentPrice()
   {
      return currentPrice;
   }




   
    public double setPercentage()
   {
       
       
    
      
      return priorClosingPrice / currentPrice;
   }

   
     
   
}