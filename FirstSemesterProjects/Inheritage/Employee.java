package Inheritage;

public class Employee extends Person
{
   private String title, dept;

   public Employee(String title, String dept)
   {
      super("George", 45);
      this.title = title;
      this.dept = dept;
   }

   public String toString()
   {
      return super.toString() + "\n He's title is: " + title
            + "\n He works for the department of: " + dept;
   }
}
