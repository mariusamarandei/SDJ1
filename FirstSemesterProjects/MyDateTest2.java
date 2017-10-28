public class MyDateTest2
{

   public static void main(String[] args)
   {
      MyDate2 date = new MyDate2(25, 2, 2019);
      MyDate2 date1 = new MyDate2();

      date.setDate(12, 6, 1989);
      date.stepForwardOneDay(31, 12, 1989);
      System.out.println("Show me the date: " + date.toString());
      System.out.println("Is this a leap year? " + date.isLeapYear());
      System.out.println(
            "Number of days in month are: " + date.numberOfDaysInMonth());

      System.out.println("Date of today: " + date1.toString());


      Time time = new Time(375);
      Time time1 = new Time (205);
      

      System.out.println("Show me the time: \n" + time.toString());
      System.out.println("Show me the time: \n" + time1.toString());
   }

}
