//Tests Student class
public class StudentTest
{
   public static void main(String[] args)
   {
      Student st1= new Student(2555, "Billy", 'M');
      Student st2= new Student(2666, "Suzy", 'F');
      Student st3= new Student(2777, "Temp", 'M');
      st3.setName("Bobby");
      st3.setStudyNumber(2888);
      
      System.out.println(st1.getName()); 
      System.out.println(st2.getGender());
      System.out.println( st3.getStudyNumber());
      
      System.out.println(st1);
      
      
   }
}
