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
   
   public Node append(int value){
      Node newNode = new Node(value);
      if(head == null)
      {
         
         this.head = newNode;
         return head;
      }
      
      Node temp = head;
      
      while (temp.next != null)
      {
         temp = temp.next;
      }      
      
      temp.next = newNode;
      return head;
      
   
   }// append end
   
   public Node get(int index){
   
      if(index < 0 || index >= length)
      {
         return null;
      }
      
      Node temp = head;
      for(int i = 0; i < index; i++)
      {
         temp = temp.next;
      }
      
      return temp;
      
   }//get end 
   
   
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
   
    public boolean set(int index, int value)
      {
         Node temp = get(index);
         if(temp != null)
         {
            temp.value = value;
            return true;
         }
         return false;
       
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
   
   public boolean insert(int index, int value)
   {
      //wont allow the insert to be a negative number
      // or greater than the actual size of the list
      if (index < 0 || index > length)
      {
         return false;      
      }
      
      // if the index is the head(0) the function will place the node at the beggining of the list and return true
      //meaning the node was successfully placed as the head
      if (index == 0)
      {
         prepend(value);
         return true;
      }
      
      // if the index is the tail(length) the function will place the node at the end of the list and return true
      //meaning the node was successfully placed as the tail
      if (index == length)
      {
         append(value);
         return true;
      }
      
      Node newNode = new Node(value);
      
      // the temp variable has to be set at the index before the chosen index
      // so the next pointer before the chosen index is updated connecting to the new node 
      Node temp = get(index - 1);
      
      // The new node next pointer is node pointer to the index in which it replace
      newNode.next = temp.next;
      
      // temp.next points to the new node which is the node before the index replaced
      temp.next = newNode;
      
      // increases the length because a new node was added 
      length++;
      
      return true;
   }
   
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