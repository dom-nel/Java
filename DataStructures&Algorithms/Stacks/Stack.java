public class Stack {
   private Node top;
   private int height = 0;
   
   /*
      Constructor that adds a new node to the top of the empty stack
      param value Unique value that identifies the node
   */
   public Stack(int value)
   {
      Node newNode = new Node(value);
      top = newNode;
      height = 1;
   }
   
   /*
      Prints out the contents of the stack
   */
   public void printStack() {
      Node temp = top;
      while (temp != null)
      {
         System.out.println(temp.value);
         temp = temp.next;
      }
   }
   
   /*
      Adds a new node to the top of the empty stack or if the stack already has nodes
      param value Unique value that identifies the node
   */
   public void push(int value) {
     Node newNode = new Node(value); 
     if(height == 0)
     {
         top = newNode;
         
     }
     else 
     {
         newNode.next = top;
         top = newNode;
         
     }
     height++;
   }
   
   /*
      Removes a node from the top of the stack
      param value Unique value that identifies the node
   */
   public Node pop(int value)
   {
      Node newNode = new Node(value);
      
      if(height == 0)
      {
         return null;
      }
         Node temp = top;
         top = top.next;
         temp.next = null;
      
         height--;
         return temp;
   }
   
   /*
      Display the top of the stack value
   */
   public void getTop() {
      System.out.println("Top: " + top.value);
   }
   
  /*
      Display the height of the stack
   */
   public void getHeight() {
      System.out.println("Height: " + height);
   }
}// stack end