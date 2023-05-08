import java.util.ArrayList;

public class ArrayListDemo
{
   public static void main(String[] args)
   {
      Integer score1 = 72;
int score2 = 85;
Character grade = 'C';

System.out.println(score1 + " " + score2 + " " + grade);
      
      
      String[] names = new String[4];
      ArrayList<String> nameList = new ArrayList<String>();
      names[0] = "Domo";
      names[1] = "Breezy";
      names[2] = "Turners";
      names[3] = "Gwag";
      
      nameList.add("Bob");
      nameList.add("Tom");
      nameList.add("Joe");
      nameList.add("Domo");
      nameList.set(0,"Breezy");
      
      for(int i = 0; i< nameList.size(); i++)
      {
         System.out.println(nameList.get(i));
      }
      
   }
}

/**
   Useful methods for the arraylist
   1. add() 
   2.get()
   3.size()
   4.remove()
   5.set()
*/