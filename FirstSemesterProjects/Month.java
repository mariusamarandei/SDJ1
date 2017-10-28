
public class Month
{
   private int monthNumber;
   static int numberOfMonths = 0; // Keeps the track of the objects created.
   // No-arg constructor

   public Month()
   {
      monthNumber = 1;
      numberOfMonths++;
   }

   // Constructor that accepts number as an argument. sets it to 1 if argument
   // is less than 1 or greater than 12
   public Month(int monthNumber)
   {
      if (monthNumber < 1 || monthNumber > 12)

         this.monthNumber = 1;
      else
         this.monthNumber = monthNumber;
      numberOfMonths++;
   }

   // Create a constructor that accepts month name as an argument

   public Month(String monthName)
   {
      switch (monthName)
      {
         case "January":
            monthNumber = 1;
            break;
         case "February":
            monthNumber = 2;
            break;
         case "March":
            monthNumber = 3;
            break;
         case "April":
            monthNumber = 4;
            break;
         case "May":
            monthNumber = 5;
            break;
         case "June":
            monthNumber = 6;
            break;
         case "July":
            monthNumber = 7;
            break;
         case "August":
            monthNumber = 8;
            break;
         case "September":
            monthNumber = 9;
            break;
         case "October":
            monthNumber = 10;
            break;
         case "November":
            monthNumber = 11;
            break;
         case "December":
            monthNumber = 12;
            break;
      }
      numberOfMonths++;
   }

   // Method to set the month that accepts number as an argument. 1 if number is
   // less than 1 or greater than 12

   public void setMonth(int monthNumber)
   {
      if (monthNumber < 1 || monthNumber > 12)
         this.monthNumber = 1;
      else
         this.monthNumber = monthNumber;
   }

   // Get the number of the month
   public int getMonthNumber()
   {
      return this.monthNumber;
   }
   // Get the name of the month

   public String getMonthName()
   {
      String monthName = "temp";
      switch (this.monthNumber)
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
      }
      return monthName;
   }

   // toString method that returns the same value as the getMonthName method

   public String toString()
   {
      return this.getMonthName();
   }

   // Equals method that accepts a Month object as an argument. If the argument
   // object
   // hold the same data as the calling object, this method should return true.
   // Otherwise, false

   public boolean equals(Month month2)
   {
      boolean status;
      if (monthNumber == month2.monthNumber)
         status = true;
      else
         status = false;
      return status;

   }

   // greaterThan method that accepts a Month object as an argument. If the
   // argument object holds greater value
   // than the calling object, this method should return true. Otherwise, false

   public boolean greaterThan(Month month2)
   {
      boolean status;
      if (monthNumber > month2.monthNumber)

         status = true;
      else
         status = false;

      return status;

   }

   // lessThan method

   public boolean lessThan(Month month2)
   {
      boolean status;
      if (monthNumber < month2.monthNumber)
         status = true;
      else
         status = false;
      return status;
   }

   // A copy constructor that takes Object as a parameter and uses its month
   // value to set the value of the Month being constructed

   public Month(Month month2)
   {
      this.monthNumber = month2.monthNumber;
      numberOfMonths++;
   }

   // Setter for numberOfMonths

   public static void setNumberOfMonths(int i)
   {
      numberOfMonths = i;
   }

   // Getter for numberOfMonths

   public static int getNumberOfMonths()
   {
      return numberOfMonths;
   }

}
