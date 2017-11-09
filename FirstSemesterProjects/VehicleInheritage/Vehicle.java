package VehicleInheritage;

public class Vehicle
{
   private String owner;
   private double price;
   
   public Vehicle(String owner, double price)
   {
      this.owner = owner;
      this.price = price;
            
   }
   public double getPrice()
   {
      return price;
   }
   public String getOwner()
   {
      return owner;
   }
   
   public void setOwner(String theOwner)
   {
     owner = theOwner;
   }
   public void setPrice(double price)
   {
      this.price = price;
   }
   public String toString()
   {
      return " \n The owner is: " +owner +" \n The price is: " +price;
   }
   public boolean equals(Object arg)
   {
      if (!(arg instanceof Vehicle))
         return false;
      Vehicle other = (Vehicle) arg;
   
   return owner.equals(other.owner) && (price == other.price);
   }
}
