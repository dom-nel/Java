public class DemoRainfall

{
   public static void main(String[] args)
   {
      double[] rain = {9.1, 2.1, 0.3, 3.2, 5.4, 2.1,
                     2.2, 1.6, 3.9, 3.4, 8.1, 1.7};
      
      Rainfall rf = new Rainfall(rain);
      
      System.out.println("The total rainfall for the year" + rf.getTotalRainfall());    
      System.out.println("The average monthly rainfall"+ rf.getAverageRainfall()); 
      System.out.println("The month with the most rain"+ rf.getMostRainfallMonth()); 
      System.out.println("The month with the least rain"+ rf.getLeastRainfallMonth());         
   }
}//main method end