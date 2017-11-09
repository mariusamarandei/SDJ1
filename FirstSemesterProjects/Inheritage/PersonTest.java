package Inheritage;

public class PersonTest
{

   public static void main(String[] args)
   {

      Teacher teacher = new Teacher("Computer Science");

      Secretary secretary = new Secretary(200);

      Student student = new Student("Very very high");

      System.out.println("Show me what we've got !! \n" + teacher.toString());
      System.out
            .println("Take me to the next level !! \n" + secretary.toString());
      System.out
            .println("Let's see the last one now ..\n" + student.toString());

   }

}
