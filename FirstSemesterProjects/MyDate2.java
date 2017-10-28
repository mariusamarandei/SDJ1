import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate2
{

   private int month;
   private int day;
   private int year;

   public MyDate2(int day, int month, int year)
   {

      this.day = day;
      this.month = month;
      this.year = year;

   }

   public MyDate2()
   {
      Calendar now = GregorianCalendar.getInstance();
      this.day = now.get(Calendar.DAY_OF_MONTH);
      this.month = (now.get(Calendar.MONTH) + 1);
      this.year = now.get(Calendar.YEAR);

   }

   public MyDate2 copy()
   {
      MyDate2 other = new MyDate2(day, month, year);

      return other;
   }

   public String toString()
   {

      String monthName;
      switch (month)
      {

         case 1:
            monthName = "January";
            break;
         case 2:
            monthName = "February";
            break;
         case 3:
            monthName = "March";
            break;
         case 4:
            monthName = "April";
            break;
         case 5:
            monthName = "May";
            break;
         case 6:
            monthName = "June";
            break;
         case 7:
            monthName = "July";
            break;
         case 8:
            monthName = "August";
            break;
         case 9:
            monthName = "September";
            break;
         case 10:
            monthName = "October";
            break;
         case 11:
            monthName = "November";
            break;
         case 12:
            monthName = "December";
            break;

         default:
            monthName = "Invalid Month";
            break;
      }

      return day + "/" + monthName + "/" + year;

   }

   public int getDay()
   {

      return day;

   }

   public int getMonth()
   {

      return month;
   }

   public int getYear()
   {

      return year;
   }

   public void setDay(int day)
   {

      this.day = day;
   }

   public void setMonth(int month)
   {

      this.month = month;
   }

   public void setYear(int year)
   {

      this.year = year;
   }

   public boolean isLeapYear()
   {
      if ((this.year % 4 == 0) && (this.year % 100 != 0)
            || (this.year % 400 == 0))
      {
         return true;
      }
      else
      {
         return false;
      }

   }

   public int numberOfDaysInMonth()
   {

      int numberOfDays;

      if (isLeapYear())
      {
         switch (month)
         {

            case 1:
               numberOfDays = 31;
               break;
            case 2:
               numberOfDays = 29;
               break;
            case 3:
               numberOfDays = 31;
               break;
            case 4:
               numberOfDays = 30;
               break;
            case 5:
               numberOfDays = 31;
               break;
            case 6:
               numberOfDays = 30;
               break;
            case 7:
               numberOfDays = 31;
               break;
            case 8:
               numberOfDays = 30;
               break;
            case 9:
               numberOfDays = 31;
               break;
            case 10:
               numberOfDays = 30;
               break;
            case 11:
               numberOfDays = 31;
               break;
            case 12:
               numberOfDays = 30;
               break;
            default:
               numberOfDays = 0;
               break;
         }

         return numberOfDays;
      }

      else
      {
         switch (month)
         {
            case 1:
               numberOfDays = 31;
               break;
            case 2:
               numberOfDays = 28;
               break;
            case 3:
               numberOfDays = 31;
               break;
            case 4:
               numberOfDays = 30;
               break;
            case 5:
               numberOfDays = 31;
               break;
            case 6:
               numberOfDays = 30;
               break;
            case 7:
               numberOfDays = 31;
               break;
            case 8:
               numberOfDays = 30;
               break;
            case 9:
               numberOfDays = 31;
               break;
            case 10:
               numberOfDays = 30;
               break;
            case 11:
               numberOfDays = 31;
               break;
            case 12:
               numberOfDays = 30;
               break;
            default:
               numberOfDays = 0;
               break;
         }
         return numberOfDays;
      }
   }

   public void setDate(int day, int month, int year)
   {

      if (year < 0)
      {

         this.year = year * (-1);
      }
      else
      {
         this.year = year;
      }

      if (day > 31)
      {
         this.day = 31;
      }

      else
      {
         this.day = day;
      }

      if (month > 12)
      {
         this.month = 12;
      }

      else
      {
         this.month = month;
      }
   }

   public void stepForwardOneDay(int day, int month, int year)
   {

      if (day > 30 && month == 2 || day > 30 && month == 4
            || day > 30 && month == 6 || day > 30 && month == 9
            || day > 30 && month == 11)
      {
         this.day = 1;
         this.month = month + 1;
         this.year = year;
      }
      else
      {
         this.day = day + 1;
         this.month = month;
         this.year = year;
      }
      if (month == 12)
      {
         this.month = 1;
         this.year = year + 1;
      }

      if (day == 31 && month == 1 || day == 31 && month == 3
            || day == 31 && month == 5 || day == 31 && month == 7
            || day == 31 && month == 8 || day == 31 && month == 10)
      {
         this.day = 1;
         this.month = month + 1;
      }

      if (day == 31 && month == 12)
      {
         this.month = 1;
         this.day = 1;
      }

   }

   public void stepForward(int days)
   { // ----------------------------------------------

   }

}
