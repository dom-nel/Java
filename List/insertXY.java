import java.io.*;
import java.util.*;

public class insertXY{
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Gathers the user's input to tell how many elements will be placed inside the list
        int n = sc.nextInt();

        // Create the list for the numbers to be added to
        List<Integer> list = new ArrayList<>();

        // Loops that control how many elements will be placed inside the list based on what n is
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }

        // Process queries
        while (sc.hasNext()) {
            String query = sc.next();
            if (query.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            } else if (query.equals("Delete")) {
                int indexToRemove = sc.nextInt();
                list.remove(indexToRemove);
            }
        }

        // Print the updated list
        for (int j = 0; j < list.size(); j++) {
            System.out.print(list.get(j) + " ");
        }
    }    
    }// class end