//Create job class excercise805

public class Job
{
   private String title;
   private double salary;
   private String employee;

   // 3 argument constructor
   public Job(String title, double salary, String employee)
   {
      this.title = title;
      this.salary = salary;
      this.employee = employee;
   }

   // 2 argument constructor with job title and salary as argument

   public Job(String title, double salary)
   {
      this.title = title;
      this.salary = salary;
      this.employee = null;
   }

   public String getTitle()
   {
      return title;
   }

   public double getSalary()
   {
      return salary;
   }

   public String getEmployee()
   {
      return employee;
   }

   public void setSalary(double salary)
   {
      this.salary = salary;
   }

   public boolean isAvailable()
   {
      if (this.getEmployee() == null)
         return true;
      else
         return false;
   }

   public void hire(String employee)
   {
      if (this.isAvailable() == true)
      {
         this.employee = employee;
         
      }
   }

   public void fire()
   {
      this.employee = null;
   }
   public String toString()
   {
      return this.getTitle() + " " + this.getEmployee() + " " + this.getSalary();
   }
      
}
