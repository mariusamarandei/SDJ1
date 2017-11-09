package Inheritage;

public class Student extends Person
{
   private String education;
   
   public Student(String education)
   {
      super("Simon",28);
      this.education = education;
      
   }
   
   public String toString()
   {
      return super.toString() + "\n The education level of the student is: " +education;
   }

}
