//tests Job
public class JobTest
{
   public static void main(String[] args)
   {
      Job coding = new Job("Tester", 20.50, "Jimmy");
      System.out.println("Name: " + coding.getEmployee());
      System.out.println("Job title: " + coding.getTitle());
      System.out.println("The pay is: " + coding.getSalary());
      
  //    Job coding2 = new Job("admin", 50.50);
  //    System.out.println(coding2.getEmployee());
  //   System.out.println(coding2.getTitle());
  //    System.out.println(coding2.getSalary());
      
      coding.fire();
      System.out.println(coding.getEmployee());
      coding.hire("Timmy");
      System.out.println(coding.getEmployee() + " just got hired");
      coding.setSalary(33.33);
      System.out.println("Salary: " +  coding.getSalary());
      System.out.println(coding.toString());
   }
}
