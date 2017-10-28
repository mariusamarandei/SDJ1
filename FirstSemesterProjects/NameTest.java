//tests Name class
public class NameTest
{
   public static void main(String[] args)
   {
      Name person = new Name("Chuck Norris");
      System.out.println(person.getFirstName());
      System.out.println(person.getLastName());
      Name person2 = new Name("Bill","Gates");
      System.out.println(person2);
   }
}
