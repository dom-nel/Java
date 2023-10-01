/*Sometimes it's better to use dynamic size arrays. Java's Arraylist can provide you this feature. Try to solve this problem using Arraylist.

You are given  lines. In each line there are zero or more integers. You need to answer a few queries where you need to tell the number located in  position of  line.

Take your input from System.in.

Input Format
The first line has an integer . In each of the next  lines there will be an integer  denoting number of integers on that line and then there will be  space-separated integers. In the next line there will be an integer  denoting number of queries. Each query will consist of two integers  and .

Constraints

Each number will fit in signed integer.
Total number of integers in  lines will not cross .

Output Format
In each line, output the number located in  position of  line. If there is no such position, just print "ERROR!"

Sample Input

5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
Sample Output

74
52
37
ERROR!
ERROR!

*/

import java.util.*;
import java.util.Scanner;



public class ArrayListExample
{
   public static void main(String[] args) 
   {
     List<List<Integer>> listOfList = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     
     System.out.println("How many list will be inside of the list?");
     int n = sc.nextInt(); // tells you how many list will be inside of the arraylist
     
     
     // Loops over n (which is the orginal arraylist that tells you how many list to loop over)
     for (int i = 0; i < n; i++)
     {
         // this is grabbing the number that starts the line and tell you how many items are inside of that list
         int d = sc.nextInt();
         
         List<Integer> list = new ArrayList<>(); // this is the list that will be added to the list of list
         
         for (int j = 0; j < d; j++)
         {
            list.add(sc.nextInt());
         }
         listOfList.add(list);
     }
     
     int q = sc.nextInt(); // number of queries that will display the the lists inside of listoflist
     for (int i = 0; i < q; i++)
     {
       int x = sc.nextInt(); 
       int y = sc.nextInt();
       
       
       // any exceptions have to be handled if the list does not contain a list of integers 
       try{
       System.out.println(listOfList.get(x - 1).get(y-1)); // the list size may start at 5 ex. but your starting at 0 index so the get has to be -1
       } catch (Exception e) {
         System.out.println("ERROR!");
       }
     }
   
   }//main method end














}// class end