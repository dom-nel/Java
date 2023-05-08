//How to find if two objects have the same contents

public boolean equals(Stock object2)
{
   boolean status;
   
   //Determine whether this object's symbol and 
   //shareprice fields are equal to objects
   //symbol and shareprice fields
   if(symbol.equals(object2.symbol) &&
     sharePrice == object2.sharePrice)
     status = true; //Yes, the objects are equal
   else
     status = false; //No, the object are not equal 
     
   //Return the value in status
   return status;
}