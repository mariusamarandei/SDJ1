
public class TestName
{
   public static void main(String[] args)
   {

      Name n = new Name("Jim", "Carrey");
      System.out.println("The First Name is: " + n.getFirstName());
      System.out.println("The Last Name is : " + n.getLastName());
      System.out.println("The Full Name is: " + n.getFullName());
      System.out.println("The Formal Name is: " + n.getFormalName());
      
      Name n1 = new Name("Jim Carrey");
      System.out.println(n1);

   }

}
