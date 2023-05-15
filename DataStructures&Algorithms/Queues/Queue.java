//FIFO First in first out


public class Queue{
   private Node first;
   private Node last;
   private int length = 0;
   
/*
   Constructor-- Adds one node to the queue
*/
public Queue(int value) {
   Node newNode = new Node(value);
   first = newNode;
   last = newNode;
   length = 1;
}

/*
   Returns empty if the queue is empty, removes one node if theres only one node, 
   and returns the node that was removed if the queue has more than one node
   @param value- Unique node being added to the queue
*/
public void enqueue(int value)
{
   Node newNode = new Node(value);
   
   if(length == 0)
   {
      first = newNode;
      last = newNode;
      length = 1;
   }else
   {
      last.next = newNode;
      last = newNode;
   }
   length++;
}


/*
   Remove a node to from the begginging of the queue
*/
public Node dequeue(){
   if(length == 0) return null;
   Node temp = first;
   if(length == 1)
   {
      first = null;
      last = null;
   }else {
      first = first.next;
      temp.next = null;
   }
      length--;
      return temp;
}


/*
   Print method-- Prints the content of the queue
*/
public void printQueue() {
   Node temp = first;
   while (temp != null) {
      System.out.println(temp.value);
      temp = temp.next;
   }
}

/*
   Print method-- Prints the first node in the queue
*/
public void getFirst() {
   System.out.println("First: " + first.value);
}

/*
   Print method-- Prints the last node in the queue
*/
public void getLast() {
   System.out.println("Last: " + last.value);
}

/*
   Print method-- Prints the length of the queue
*/
public void getLength() {
   System.out.println("Length: " + length);
}


}//queue end