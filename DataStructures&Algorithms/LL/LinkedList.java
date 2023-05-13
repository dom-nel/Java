public class LinkedList{

   private Node head;
   private Node tail;
   private int length = 0;

   public LinkedList(int value){
      Node newNode = new Node(value);
      this.head = newNode;
      this.tail = newNode;
      this.length = 1;
   }//constructor end 
   
   public void append(int value){
      Node newNode = new Node(value);
      if(head == null)
      {
         
         this.head = newNode;
         this.tail = newNode;
         this.length = 1;
      }
      else{
         tail.next = newNode;
         tail = newNode;
      }
      length++;
      
      
   
   }// append end
   
   public void prepend(int value){
      Node newNode = new Node(value);
      if(head == null)
      {
         
         this.head = newNode;
         this.tail = newNode;
         this.length = 1;
      }
      else 
      {
         newNode.next = head;
         head = newNode;
      }
      length++;

   
   }// prepend end
   
   public boolean insert(int index, int value){
      return true;
   }
   
   public Node removeFirst()
   {
      if(head == null)
         {
            return null;
         }
       else
         {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length--;
            if (length == 0)
            {
               tail = null;
            }
       return temp;
            
         }

   }
   
   public Node removeLast(){
      if(head == null)
         {
            return null;
         }
      else
         {
            Node temp = head;
            Node pre = head;
            while (temp.next != null)
            {
               pre = temp;
               temp = temp.next;
            }
            tail = pre;
            tail.next = null;
            length--;
            if(length == 0)
            {
               head = null;
               tail = null;
            }
            return temp;
         }
      
   }//remove end
   
   public void printList(){
      Node temp = head;
      while (temp != null){
         System.out.println(temp.value);
         temp = temp.next;
      }
   
   }
   
   public void getHead(){
      System.out.println("Head: " + head.value);
   }
   
    public void getTail(){
      System.out.println("Tail: " + tail.value);
   }


    public void getLength(){
      System.out.println("Length: " + length);
   }


}// public class linkedlist end