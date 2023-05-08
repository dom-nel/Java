/*
   write a rainfall class that stores the total rainfall for each of 12 months into an array of doubles. The program should have methods that 
   that caculates the total for the year 
   the average monthly rainfal 
   the month with them most rain 
   the month with the least rain 
   demostate the classs in a demo program
*/

public class Rainfall
//public class Rainfall begin 
{
   private double[] rainfallAmount;
   
   /*
      no arg constructor
   */
   public Rainfall()
   {
      rainfallAmount = new double[12];
   }
   
    
   /*
      accepts an array as argument
   */
   public Rainfall(double[] array)
   {
      //create a new array that holds the same
      //number of values as the argument we are passed
      rainfallAmount = new double[array.length];
     
      //copy each element of the array into rainfalAmount
      for(int i = 0; i < rainfallAmount.length; i++)
      {
         rainfallAmount[i] = array[i];
      }
   }
   
   
   /*
      caculates the total for the year
   */
   public double getTotalRainfall()
   {
      double total = 0;
      for(int rain = 0; rain < rainfallAmount.length; rain++)
      {
         total += rainfallAmount[rain];
      }
      return total;
   }
   
   //The average monthly rainfall
   public double getAverageRainfall()
   {
      //already made the method that calculates the total pass the  method to the return statement and divide by the length to get the average
      return getTotalRainfall() / rainfallAmount.length;   
   }

   
   //Gets the  month with the most rain
    public double getMostRainfallMonth()
   {
      double highest = 0.0;
      int monthIndex = 0;
      for(int i = 0; i < rainfallAmount.length; i++)
      {
         if(rainfallAmount[i] > highest)//found a new highest rainfall amount
         {
            //locates the number thats the highest
            highest = rainfallAmount[i];
            
            //this keeps track of the actual month thats the highest
            monthIndex = i; 
         }
       }
       return monthIndex;//returns the index of the array that has the highest value in it
   }
   
   
     //Gets the  month with the least rain
    public double getLeastRainfallMonth()
   {
      double lowest = 0.0;
      int monthIndex1 = 0;
      for(int i = 0; i < rainfallAmount.length; i++)
      {
         if(rainfallAmount[i] < lowest)//found a new lowest rainfall amount
         {
            //locates the number thats the lowest
            lowest = rainfallAmount[i];
            
            //this keeps track of the actual month thats the lowest
            monthIndex1 = i; 
         }
       }
       return monthIndex1;//returns the index of the array that has the lowest value in it
   }


}//public class Rainfall end
