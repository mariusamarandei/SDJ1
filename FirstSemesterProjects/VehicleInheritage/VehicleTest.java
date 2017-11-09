package VehicleInheritage;

public class VehicleTest
{

   public static void main(String[] args)
   {
      Van van = new Van("Marius",120000,"AN 96377",3000); 
      Van van1 = new Van("Marius",120000,"AN 96367",3000); 
      
      System.out.println("Info about the van: " +van.toString());
      System.out.println("Is it the same van? " +van.equals(van1));

   }

}
