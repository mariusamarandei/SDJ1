
public class TestCar
{

   public static void main(String[] args)
   {
      
      Car c = new Car("Red");
      
      System.out.println("Tell me the color: " +c.getColor());
      System.out.println("Tell me the registration number: " +c.getRegistrationNumber());
      System.out.println("Tell me the owner of the car: " +c.getOwner());
      

   }

}
