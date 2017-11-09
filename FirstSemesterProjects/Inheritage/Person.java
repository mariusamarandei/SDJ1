package Inheritage;

public class Person
{
   private String name;
   private int age;
   
   
   public Person(String name1, int age1)
   {
      name = name1;
      age = age1;
   }
   
   public void setAge(int age)
   {
      this.age = age;
      
   }
   public void setName(String name)
   {
      this.name = name;
   }
   public int getAge()
   {
      return this.age;
   }

   public String toString()
   {
      return "The person's name is: " +name +" and the age is: " + age;
   }
   
}
