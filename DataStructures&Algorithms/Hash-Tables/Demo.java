public class Demo {
      public static void main(String[] args) {
         HashTable myHashTable = new HashTable();
         
         myHashTable.set("paint", 100);
         myHashTable.set("bolts", 50);
         myHashTable.set("nails", 80);
         myHashTable.set("tile", 50);
         myHashTable.set("lumber", 80);
        
         System.out.println(myHashTable.keys());
         //System.out.println(myHashTable.get("bolts"));
        
         //myHashTable.printTable();
         
         
      }// main end
}// demo end