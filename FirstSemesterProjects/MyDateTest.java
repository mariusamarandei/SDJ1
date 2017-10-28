//Tests MyDate class
public class MyDateTest
{
   public static void main(String[] args)
   {
      MyDate today = new MyDate(5,2,2020);
      System.out.println(today);
      System.out.println(today.isLeapYear());
      System.out.println(today.numberOfDaysInMonth());
      
      today.setDate(29, 2, 2020);
      System.out.println(today);
      System.out.println(today.getMonthName());
      today.stepForwardOneDay();
      System.out.println(today);
      today.stepForwardOneDay();
      System.out.println(today);
      
      today.stepForward(3);
      System.out.println(today);
      
      today.setDate(1, "March" , 1999);
      System.out.println(today);
      
      MyDate today2 = new MyDate(1,3,1999);
      System.out.println(today.equals(today2));
      
     System.out.println(today.copy());
     
    // Person person1 = new Person("John", today2);
   //  System.out.println(person1);
     MyDate thisday= new MyDate();
     System.out.println(thisday);
     
     Time time1= new Time(25,15, 61);
     System.out.println("hour is " + time1.getHour());
     System.out.println("minute is " +time1.getMinute());
     System.out.println("second is " +time1.getSecond());
     System.out.println(time1.getTimeInSeconds());
     System.out.println(time1);
     
     
     
     
     
   }
   
}
