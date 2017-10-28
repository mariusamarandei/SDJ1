import java.util.Scanner;

public class DayMonthYear
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      int day;
      int month;
      int year;

      System.out.println("Enter the day: ");
      day = input.nextInt();

      System.out.println("Enter the month: ");
      month = input.nextInt();

      System.out.println("Enter the year: ");
      year = input.nextInt();

      if (day <= 0 || day >= 32 || month <= 0 || month >= 13 || year <= 2016
            || year >= 2018)
      {

         System.out.println("Illegal date");
      }

      else
      {

         System.out.println("The date is:  " + day + "/" + month + "/" + year);
      }
   }

}
