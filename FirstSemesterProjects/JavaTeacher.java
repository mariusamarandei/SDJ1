
public class JavaTeacher extends Teacher
{
   String majorCourse = "Java";

   public JavaTeacher()
   {
      super("The teacher is the teacher");
      System.out.println("I am the SubClass :-(");
   }

   public void teach()
   {
      System.out.println("Not teaching...");
   }

   public static void main(String[] args)
   {
      JavaTeacher teacher = new JavaTeacher();
      System.out.println("Title: " + teacher.title);
      System.out.println("Department: " + teacher.dept);
      System.out.println("Course: " + teacher.majorCourse);
      teacher.teach();
   }

}
