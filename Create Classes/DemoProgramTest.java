import java.util.*;

public class DemoProgramTest
{
    public static void main(String[] args)
    {
      Scanner keyboard = new Scanner(System.in);
      
      
      System.out.println("Enter your four digit symbol: ");
      String symbol = keyboard.nextLine();
      
      System.out.println("Enter your name: ");
      String name = keyboard.nextLine();
      
      System.out.println("Enter the prior closing price: ");
      double priorClosingPrice = keyboard.nextDouble();
      
      System.out.println("Enter the current price: ");
      double currentPrice = keyboard.nextDouble();
      
      DemoProgram dp = new DemoProgram(symbol, name, priorClosingPrice, currentPrice); 
      dp.setSymbol(symbol);
      dp.setName(name);
      dp.setPriorClosingPrice(priorClosingPrice);
      dp.setCurrentPrice(currentPrice);
      
      
      printDemoProgramInfo(dp);
      
    }
    
    
     /**
   Prints out information about Demo Program object
   @param dp The Demo Program
   */
   public static void printDemoProgramInfo(DemoProgram dp)
   {
      
      System.out.println("Symbol: " + dp.getSymbol());
      System.out.println("Name: " + dp.getName());
      System.out.println("Prior Closing Price: " + dp.getPriorClosingPrice());
      System.out.println("Current Price: " + dp.getCurrentPrice());
      System.out.printf("Percentage: %,.2f",dp.setPercentage());
     
      
   }

}