/**
   The Stock class holds data about a stock.
*/

public class Stock
{
   private String symbol;     // Trading symbol of stock
   private double sharePrice; // Current price per share

   /**
      Constructor
      @param sym The stock's trading symbol.
      @param price The stock's share price.
   */

   public Stock(String symbol, double sharePrice)
   {
      this.symbol = symbol;
      this.sharePrice = sharePrice;
   }
   
   /**
      getSymbol method
      @return The stock's trading sysmbol.
   */
   
   public String getSymbol()
   {
      return symbol;
   }
   
   /**
      setSymbol method
      @param symbol Sets the symbol value
   */
   
   public void setSymbol(String symbol)
   {
      this.symbol = symbol;
   }

   
   /**
      getSharePrice method
      @return The stock's share price
   */
   
   public double getSharePrice()
   {
      return sharePrice;
   }
   
   /**
      setSharePrice  method
      @param sharePrice Sets the SharePrice value
   */
   
   public void setSharePrice(double sharePrice)
   {
      this.sharePrice  = sharePrice;
   }


   /**
      toString method
      @return A string indicating the object's
              trading symbol and share price.
   */
   
   public String toString()
   {
      // Create a string describing the stock.
      String str = "Trading symbol: " + symbol +
                   "\nShare price: " + sharePrice;
      
      // Return the string.
      return str;
   }
   
   
   /**
      This program uses the Stock class's copy method
      to create a copy of a Stock object
   */

   public Stock copy()
   {
      //Create a new Stock object and initialize it
      //with the same data held by the calling object
      Stock copyObject = new Stock(symbol, sharePrice);
      
      //Return a reference to the new object 
      return copyObject;
   }
   
   /**
   Notice that the constructor accepts a Stock object as an argument. The parameter variable
   obj will reference the object that was passed as an argument. The constructor copies
   the values that are in obj's symbol and sharePrice fields to the symbol and shareprice 
   fields of the object that is being created
   */
   public Stock(Stock obj)
   {
      symbol = obj.symbol;
      sharePrice = obj.sharePrice;
   }
}
