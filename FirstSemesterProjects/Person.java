public class Person
{
   private String name;
   private String dateOfBirth;
   
   //Constructor
   
   public Person(String thename, String theDateOfBirth)
   {
      this.name = thename;
      this.dateOfBirth = theDateOfBirth;
   }     
   
   public Person(String thename)
   {
      name= thename;
   }
   
   // Setters
   
   public void setName(String thename)
   {
      name=thename;
   }
   public void setDOB(String theDate)
   {
      dateOfBirth = theDate;
   }
   
   // Getters
   
   public String getName()
   {
      return name;
   }
   public String getDateOfBirth()
   {
      return dateOfBirth;
   }
   
   
}