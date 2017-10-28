import java.util.Calendar;
import java.util.GregorianCalendar;
public class MyDate
{
   private int month, day, year;
   public boolean isLeap;
   static int monthNumber;

   public MyDate(int day, int month, int year)
   {
      this.setDate(day, month, year);

   }
   public MyDate()
   {
      Calendar now= GregorianCalendar.getInstance();
      
      this.day=now.get(Calendar.DAY_OF_MONTH);
      this.month=(now.get(Calendar.MONTH)+1);
      this.year=now.get(Calendar.YEAR);
      
   }

   // GETTERS

   public int getDay()
   {
      return this.day;
   }

   public int getMonth()
   {
      return this.month;
   }

   public int getYear()
   {
      return this.year;
   }

   // SETTER

   public void setDate(int day, int month, int year)
   {
      /////////////////
      if (year < 0)
         this.year = year * (-1);
      else
         this.year = year;
      /////////////////
      if (month < 1)
         this.month = 1;
      else if (month > 12)
         this.month = 12;
      else
         this.month = month;
      /////////////////
      if (day < 1)
         this.day = 1;
      else if (day > numberOfDaysInMonth())
         this.day = numberOfDaysInMonth();
      else
         this.day = day;
      //
   }
   
      public void setDate(int day, String monthName, int year)
      {
         this.day=day;
         this.month=convertToMonthNumber(monthName);
         this.year=year;
      }

   public String toString()
   {
      // String.format("%02d", this.getDay()); These format number into two
      // digits
      // String.format("%02d", this.getMonth());
      return String.format("%02d", this.getDay()) + "/"
            + String.format("%02d", this.getMonth()) + "/" + this.getYear();
   }

   // Excercise 1101A. Method to check if the year is the leap year

   public boolean isLeapYear()
   {

      if (getYear() % 4 == 0 && getYear() % 100 != 0 || getYear() % 400 == 0)
         isLeap = true;
      else
         isLeap = false;
      return isLeap;
   }

   // Excercise 1101B Method to return the number of days in the month

   public int numberOfDaysInMonth()
   {
      int days;
      if (getMonth() == 1 || getMonth() == 3 || getMonth() == 5
            || getMonth() == 7 || getMonth() == 8 || getMonth() == 10
            || getMonth() == 12)
         days = 31;
      else if (getMonth() == 4 || getMonth() == 6 || getMonth() == 9
            || getMonth() == 11)
         days = 30;
      else if (isLeap)
         days = 29;
      else
         days = 28;
      return days;
   }

   // Excercise 1101D . get the months name.
   public String getMonthName()
   {
      String month = null;

      switch (getMonth())
      {
         case 1:
            month = "January";
            break;
         case 2:
            month = "February";
            break;
         case 3:
            month = "March";
            break;
         case 4:
            month = "April";
            break;
         case 5:
            month = "May";
            break;
         case 6:
            month = "June";
            break;
         case 7:
            month = "July";
            break;
         case 8:
            month = "August";
            break;
         case 9:
            month = "September";
            break;
         case 10:
            month = "October";
            break;
         case 11:
            month = "November";
            break;
         case 12:
            month = "December";
            break;
      }
      return month;
   }

   // Exercise 1101E stepForwardOneDay() increments the date by one. If the day
   // is the last, the day should go to other months day 1.

   public void stepForwardOneDay()
   {
      if (getDay() == numberOfDaysInMonth() && getMonth() == 12)
      {
         day = 1;
         month = 1;
         year++;
      }
      else if (getDay() == numberOfDaysInMonth())
      {
         day = 1;
         month++;
      }
      else
         day++;

   }
   
   //Exercise 1101F stepForward(int days).
   
   public void stepForward(int days)
   {
      for( int i=0; i<days; i++)
      {
       stepForwardOneDay();
      }
      
   }
   
   //Exercise 1102A   public static int convertToMonthNumber(String monthName). returns 1-12
   
   public static int convertToMonthNumber(String monthName)
   {
      int monthNumber=0;
      
      switch (monthName)
      {
         case "January":
            monthNumber=1;
            break;
         case "February":
            monthNumber=2;
            break;
         case "March":
            monthNumber=3;
            break;
         case "April":
            monthNumber=4;
            break;
         case "May":
            monthNumber=5;
            break;
         case "June":
            monthNumber=6;
            break;
         case "July":
            monthNumber=7;
            break;
         case "August":
            monthNumber=8;
            break;
         case "September":
            monthNumber=9;
            break;
         case "October":
            monthNumber=10;
            break;
         case "November":
            monthNumber=11;
            break;
         case "December":
            monthNumber=12;
            break;
      }
      return monthNumber;
   }
   
   //Equals method.
   
   public boolean equals(MyDate input)
   {
      boolean status;
      if (day==input.getDay() && month==input.getMonth() && year==input.getYear() )
         status=true;
      else status=false;
      return status;
   }
   
   public MyDate copy()
   {
      return new MyDate(day,month,year);
      
   }
   
   
   
}