package VehicleInheritage;

public class Car extends Vehicle
{
   private String regNo;
   public Car(String theOwner, double thePrice, String regNo)
   {
      super(theOwner,thePrice);
      this.regNo = regNo;
   }
   public String getRegistrationNumber()
   {
      return regNo;
   }
   public void setRegistrationNumber(String regNo)
   {
      this.regNo = regNo;
   }
   public String toString()
   {
      return super.toString() +"\n The registration number is: " +regNo;
   }
   public boolean equals(Object arg) {
   if(!(arg instanceof Car))
      return false;
   Car other = (Car)arg;
   return super.equals(arg) && regNo.equals(other.regNo);
   }
}
