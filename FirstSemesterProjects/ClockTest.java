
public class ClockTest
{
   public static void main(String[] args)
   {
      Clock time = new Clock (23,59,59);
      System.out.println("Hour is: " +time.getHour());
      System.out.println("Minute is: "+time.getMinute());
      System.out.println("Seconds are: "+time.getSecond());
      time.tic();
      System.out.println("Hour is: " +time.getHour());
      System.out.println("Minute is: "+time.getMinute());
      System.out.println("Seconds are: "+time.getSecond());
      
      Clock time2 = new Clock(4000);
      System.out.println(time2.getHour());
      System.out.println(time2.getMinute());
      System.out.println(time2.getSecond());
   
      System.out.println(time2.convertToSeconds());
      
      System.out.println(time2.isBefore(time));
      Clock time3 = new Clock(4000);
      System.out.println(time2.equals(time3));
      System.out.println(time2);
      
      Clock time4 = new Clock(15,25,25);
      System.out.println(time4);
      time4.set12HourFormat();
      System.out.println(time4.getHour());
      System.out.println(time4.is24TimeFormat);
      System.out.println(time4);
      time4.set24TimeFormat();
      System.out.println(time4);
      Clock time5 = new Clock (23,59,59);
      time5.set12HourFormat();
      System.out.println(time5);
      time5.tic();
      System.out.println(time5);
      time5.tic();
      time5.tic();
      time5.set24TimeFormat();
      System.out.println(time5);
      System.out.println(time5.is24TimeFormat);
      
      Clock test = new Clock(0,0,0);
      
      for (int i=0;i<86400;i++)
      {
         System.out.println(test);
         test.tic();
         if (i==86399)
            System.out.println(test);
      }
      
      System.out.println(time4);
      time4.set12HourFormat();
      System.out.println(time4);
         
      
  
      
   }
   
}
