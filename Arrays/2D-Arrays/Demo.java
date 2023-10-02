import java.util.Arrays;

public class Demo {
   public static void main(String[] args)
   {
      int row = 5; 
      int col = 5;
      int value = 2; 
      
      insert2DArray isa = new insert2DArray(row, col);
      isa.insertValueInTheArray(0, 0, 1);
      isa.insertValueInTheArray(0, 1, 2);
      isa.insertValueInTheArray(0, 2, 3);
      isa.insertValueInTheArray(0, 3, 4);
      isa.insertValueInTheArray(0, 4, 5);
      isa.insertValueInTheArray(1, 0, 6);
      isa.insertValueInTheArray(1, 1, 7);
      isa.insertValueInTheArray(1, 2, 8);
      isa.insertValueInTheArray(1, 3, 9);
      isa.insertValueInTheArray(1, 4, 10);
      isa.insertValueInTheArray(2, 0, 11);
      isa.insertValueInTheArray(2, 1, 12);
      isa.insertValueInTheArray(2, 2, 13);
      isa.insertValueInTheArray(2, 3, 14);
      isa.insertValueInTheArray(2, 4, 15);
      isa.insertValueInTheArray(3, 0, 16);
      isa.insertValueInTheArray(3, 1, 17);
      isa.insertValueInTheArray(3, 2, 18);
      isa.insertValueInTheArray(3, 3, 19);
      isa.insertValueInTheArray(3, 4, 20);
      isa.insertValueInTheArray(4, 0, 21);
      isa.insertValueInTheArray(4, 1, 22);
      isa.insertValueInTheArray(4, 2, 23);
      isa.insertValueInTheArray(4, 3, 24);
      isa.insertValueInTheArray(4, 4, 25);
      ;
      
      
      System.out.println(Arrays.deepToString(isa.arr));
      
   }
}