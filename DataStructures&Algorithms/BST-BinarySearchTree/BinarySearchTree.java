// Binary Search tree each node points to two nodes
// A search tree is full if it point to two nodes or zero nodes
// A perfect tree is when every node in the tree are full(two nodes attached)
// A complete tree is when nodes are being added from left to right(doesnt have to be full or perfect)
// The top node is the parent
//The nodes that connect to the top are the children 
// Any child node that does not have children are the leaf nodes
public class BinarySearchTree{
   
   public Node root;
   
   public BinarySearchTree(){
      // you dont need this constructor or variable its created by default
      // this is just a reminder
      // in order for the tree to be made it has to create the root
      // variable but it doesnt have to have a value at the time of creation
      root = null;
   }
   
   
   /*
      Steps to insert the new Node into BST
       Create new Node
       if root == null then root = newNode
       temp = root
       create while loop
          if newNode == temp return false
          if < left else > right
          if null insert newNode else move to next
          
   */
   
   public boolean insert(int value){
      Node newNode = new Node(value);
      if(root == null)
      {
         root = newNode;
         return true;
      }  
      Node temp = root;
      while(true){
         if (newNode.value == temp.value) return false;
         if (newNode.value < temp.value)
         {
            if(temp.left == null)
            {
               temp.left = newNode;
               return true;
            }
            temp = temp.left;
         }else
         {
            if (temp.right == null)
            {
               temp.right = newNode;
               return true;
            }
            temp = temp.right;
            
         }
      }
   }
   
   public boolean contains(int value){
      if(root == null)
      {
         return false;
      }
      Node temp = root;
      while(temp != null)
      {
         if(value < temp.value)
         {
            temp = temp.left;
         }
         else if (value > temp.value)
         {
            temp = temp.right;
         }
         else{
            return true;
         }
      }
      return false;
   }
   
}//BST end