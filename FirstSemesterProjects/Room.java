
public class Room
{
   private int number;
   private String bedType;
   private Guest  guest;
   
   public Room(int number, String bedType)
   {
      this.number=number;
      this.bedType=bedType;
   }
   
   public int getNumber()
   {
      return number;
   }
   public int getFloor()
   {
      int floor=number/100;
      return floor;
      
   }
   public double getPrice()
   {
      double p=0.00;
      if (bedType=="Single")
          p= 59.50;
      if (bedType=="Double")
          p=72.40;
      if (bedType=="King size")
          p=89.00;
      return p ;
   }
   
   public boolean isOccupied()
   {
      if(guest==null)
         return false;
      else return true;
   }
   
   public void registerGuest(Guest input)
   {
     guest=input; 
   }
   
   public void vacate()
   {
      guest=null;
   }
   
   public String getBedType()
   {
      return bedType;
   }
   public Guest getGuest()
   {
      return guest;
   }
   
}
