//Creates student class with three attributes : study number, name, gender
public class Student
{
   private String name;
   private int studyNumber;
   private char gender;
   
   public Student(int studyNumber, String name, char gender)
   {
      this.studyNumber=studyNumber;
      this.name=name;
      this.gender=gender;
   }
   
   //Setters
   
   public void setStudyNumber(int studyNumber)
   {
      this.studyNumber=studyNumber;
   }
   public void setName( String name)
   {
      this.name=name;
   }
   
   //Getters
   
   public String getName()
   {
      return name;
   }
   public char getGender()
   {
      return gender;
   }
   public int getStudyNumber()
   {
      return studyNumber;
   }
   //toString print method
   
   public String toString()
   {
      return this.getName() +", "+this.getGender()+", "+this.getStudyNumber();
   }
}
