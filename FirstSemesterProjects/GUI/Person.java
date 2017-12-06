package GUI;

public class Person
{
   private String name;
   private int age;
   private int age1;
   public Person(String name, int age)
   {
      this.name = name;
      this.age = age;
   }

   public String getName()
   {
      return name;
   }

   public int getAge()
   {
      return age;
   }

   public void setAge(int age)
   {
      this.age = age;
   }


   public String getStatus()
   {
      if (age < 0)
         return "Illegal age";
      if (age < 18)
         return "Child";
      if (age < 65)
         return "Adult";
      return "Senior Citizen";
   }

   public String toString()
   {
      return name + ", " + age;
   }
}
