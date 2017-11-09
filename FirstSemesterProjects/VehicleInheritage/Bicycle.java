package VehicleInheritage;

public class Bicycle extends Vehicle
{
   private int gears;

   public Bicycle(String theOwner, double price, int numberOfGears)
   {
      super(theOwner, price);

      numberOfGears = gears;
   }

   public void setGears(int numberOfGears)
   {
      numberOfGears = gears;
   }

   public int getGears()
   {
      return gears;
   }

   public String toString()
   {
      return super.toString() + "\n The number of gears: " + gears;
   }

   public boolean equals(Object arg)
   {
      if (!(arg instanceof Bicycle))
         return false;
      Bicycle other = (Bicycle) arg;
      return super.equals(arg) && (gears == other.gears);
   }
}
