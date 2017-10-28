import java.util.Scanner; 

public class Payroll
{
   public static void main(String[] args)
   {
      String name;
      int hours;
      double payRate;
      double grossPay;
      double tax;
      
      Scanner keyboard = new Scanner (System.in);
      
      System.out.print("What is your name? ");
      name = keyboard.nextLine();
      
      System.out.print("How many hours did you work this month? ");
      hours = keyboard.nextInt();
      
      System.out.print("How much in tax do you pay? ");
      tax = keyboard.nextDouble();
      
      System.out.print("What is your hourly pay rate? ");
      payRate = keyboard.nextDouble();
      
      grossPay = hours * payRate * tax;
      
      
      System.out.println("Hello " + name);
      System.out.println("Your gross pay is kr " + grossPay);
      
   }
}