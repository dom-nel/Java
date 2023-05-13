public class DoublyLinkedList {
   Node head;
   Node tail;
   int length = 0;
   
    /*
      Creates and add one node to the linked list
      param value Accepts a value to identify the node
   */
   public DoublyLinkedList(int value) {
      Node newNode = new Node(value);
      head = newNode;
      tail = newNode;
      length = 1;
   }
   
   /*
      Prints out the content of the linked list
     
   */
   public void printList() {
      Node temp = head;
      while(temp != null) {
         System.out.println(temp.value);
         temp = temp.next;
      }
   }
   
    /*
      Appendd method adds a new node to the end of the linked list
      param value Accepts a value to identify the node
   */
   public void append(int value) {
      Node newNode = new Node(value);
      if (head == null)
      {
         head = newNode;
         tail = newNode;
      }else
      {
         tail.next = newNode;
         newNode.prev = tail;
         tail = newNode;
      }
      length++;
   }
   
   /*
      Prepend method adds a new node to the begginning of the linked list
      param value Accepts a value to identify the node
   */
   public void prepend(int value){
      Node newNode = new Node(value);
       if (length == 0)
      {
         head = newNode;
         tail = newNode;
      }else
      {
         newNode.next = head;
         head.prev = newNode;
         head = newNode;
         
      }
      
      length++;

   }
   
    /*
      Removes the last node in the linked list
      
   */
   public Node removeLast() {
      // if we have zero items in the linkedlist 
      if(length == 0)
      {
         return null;
      }
      
      // stores the tail node before its erased
      Node temp = tail;
      
      //if theres one item in the linked list 
      if(length == 1) 
      {
        head = null;
        tail = null;  
      }
      // two or more items in the linked list
      else
      {
          
         tail = tail.prev;
         tail.next = null;
         temp.prev = null;
         
      }
      length--;
      return temp;
   }
   
   /*
      Removes the first node in the linked list
      
   */
   public Node removeFirst() {
      // if we have zero items in the linkedlist 
      if(length == 0)
      {
         return null;
      }
      
      // stores the head node before its erased
      Node temp = head;
      
      //if theres one item in the linked list 
      if(length == 1) 
      {
        head = null;
        tail = null;  
      }
      // two or more items in the linked list
      else
      {
          
         head = head.next;
         head.prev = null;
         temp.next = null;
         
      }
      length--;
      return temp;
   }
   
   
   
   
   /*
      Displays the head value in the linked list
   */
   public void getHead() {
      System.out.println("Head: " + head.value);
   }
   
    /*
      Displays the tail value in the linked list
   */
   public void getTail() {
      System.out.println("Tail: " + tail.value);
   }

   /*
      Displays the length of the linked list
   */
   public void getLength() {
      System.out.println("Length: " + length);
   }

}// doublylinkedlist class end