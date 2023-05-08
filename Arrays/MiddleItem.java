import java.util.Scanner;

public class MiddleItem 
{
   public static void main(String[] args)
   {
      Scanner scnr = new Scanner(System.in);
      int userValues[] = new int[10]; 
      int arrayLength = 0;
      
      for (int i = 0; i < 10; i++)
      {
         userValues[i] = scnr.nextInt();
      
      
         if (userValues[i] == -1)
         {
            arrayLength = i + 1;
            scnr.close();
            break;
         }
         
         if (i == 9 && userValues[i] != -1)
         {
            System.out.println("Too many inputs");
            return;
         }
      }// for loop end 
      
      int middleInteger = (arrayLength - 1) / 2;
      
      System.out.println(userValues[middleInteger]);
   }//public static void main(String[] args) end
}//public class MiddleItem end