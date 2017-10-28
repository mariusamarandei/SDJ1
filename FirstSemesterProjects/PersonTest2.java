
public class PersonTest2
{
   public static void main(String[] args)
   {
      Person friend = new Person("Homeboy", "02.05.1990");
      System.out.println(friend.getName());
      System.out.println(friend.getDateOfBirth());
      
      friend.setDOB("6.6.666");
      friend.setName("Devil");
      System.out.println(friend.getDateOfBirth());
      System.out.println(friend.getName());
   }
}
