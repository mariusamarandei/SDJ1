public class Car
{
   private String color;
   private String registrationNumber;
   private String owner;

   public Car(String color)
   {
      this.color = color;
      this.registrationNumber = "AN96377";
      this.owner = "Marius";

   }

   public void setColor()
   {

      this.color = color;

   }

   public void setRegistrationNumber()
   {

      this.registrationNumber = registrationNumber;

   }

   public void setOwner()
   {

      this.owner = owner;

   }

   public String getColor()
   {

      return color;

   }

   public String getRegistrationNumber()
   {
      return registrationNumber;
   }

   public String getOwner()
   {
      return owner;
   }

}
