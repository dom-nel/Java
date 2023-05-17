import java.util.ArrayList;
public class HashTable {

      private int size = 7;
      private Node[] dataMap; //an array of pointers to a node
      
      public HashTable() {
         dataMap = new Node[size];
      }
      
      /*
         This method is private because its only used by other methods in the hashtable class
      */
      
      private int hash(String key) {
            int hash = 0;
            
            // each char from the String key will be added to this array
            char[] keyChars = key.toCharArray();
            
            // this for loop, loops through the characters
            for (int i = 0; i < keyChars.length; i++) {
                  
                  // gives each character a value A=65 B=66 a=97 b=98 etc...
                  int asciiValue = keyChars[i];
                  
                  hash = (hash + asciiValue * 23) % dataMap.length;
            }
            return hash;
      }
      
      public void printTable() {
         for(int i = 0; i < dataMap.length; i++) {
            System.out.println(i + ":");
            Node temp = dataMap[i];
            while (temp != null) {
               System.out.println(" {" + temp.key + "= " + temp.value + "}");
               temp = temp.next;
            }
         }
      }
      
      public void set(String key, int value) {
         //Determine the index 
         int index = hash(key);
         Node newNode = new Node(key, value);
         
         //insert Node into empty linked list
         if (dataMap[index] == null) {
            dataMap[index] = newNode;
            
         }else
         {
            Node temp = dataMap[index];
            while (temp.next != null) {
               temp = temp.next;
            }
            temp.next = newNode;
         }
      }
      
      public int get(String key) {
            int index = hash(key);
            Node temp = dataMap[index];
            while (temp != null) {
               if (temp.key == key)
               {
                  return temp.value;
               }
               temp = temp.next;
            }
            return 0;
      }
      
      public ArrayList keys() {
         ArrayList<String> allKeys = new ArrayList<>();
         for (int i = 0; i < dataMap.length; i++) {
            Node temp = dataMap[i];
            while (temp != null) {
               allKeys.add(temp.key);
               temp = temp.next;
            }
         }
         return allKeys;
      }

}//hashtables end