package Inheritage;

public class Teacher extends Employee
{
   private String phd;

   public Teacher(String phdName)
   {
      super("Professor", "ICT");
      phd = phdName;
   }

   public String toString()
   {
      return super.toString() + "\n He has a PhD in: " + phd;
   }

}
