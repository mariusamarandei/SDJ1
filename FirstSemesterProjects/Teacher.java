
public class Teacher
{
    String title = "Professor";
    String dept = "CIA";

   public Teacher()
   {
      System.out.println("I am the SuperClass!!!");
   }

   public Teacher(String arg)
   {
      System.out.println("This is the argument: " +arg);
   }

   public void teach()
   {
      System.out.println("Teaching...");
   }
}
