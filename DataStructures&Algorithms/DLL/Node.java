public class Node{
   public int value;
   public Node next;
   public Node prev;
   
   public Node(int value){
      this.value = value;
   }
   
   public void setValue(int value){
      this.value = value;
   }
   
   public int getValue(){
      return value;
   }
   
   public void setNextNode(Node next){
      this.next = next;
   }
   
   public Node getNextNode(){
      return next;
   }
   
    public void setPrevNode(Node prev){
      this.prev = prev;
   }
   
   public Node getPrevNode(){
      return prev;
   }


}//public class node end