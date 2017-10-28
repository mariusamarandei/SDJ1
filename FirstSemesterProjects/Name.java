//Excercise 901
public class Name
{
   private String firstName;
   private String lastName;

   public Name(String firstName, String lastName)
   {
      this.firstName = firstName;
      this.lastName = lastName;
   }

   // Getters
   public String getFirstName()
   {
      return this.firstName;
   }

   public String getLastName()
   {
      return this.lastName;
   }

   // Get full name method

   public String getFullName()
   {
      return this.getFirstName() + " " + this.getLastName();
   }

   public String getFormalName()
   {
      return this.getLastName() + "," + this.getFirstName();
   }

   public Name(String nameInput)
   {
      String input = nameInput;
      String[] nameParts = input.split(" ");
      
      this.firstName=nameParts[0];
      
      this.lastName=nameParts[1];
   }
   public String toString()
   {
      return this.getFirstName()+ " " + this.getLastName();
   }

}
