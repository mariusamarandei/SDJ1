
public class Time
{
   private int hour;
   private int minute;
   private int second;
  
   public Time(int hour, int minute, int second)
   {
      if (hour>=24)
       this.hour=hour%24;
      if (hour<0)
       this.hour=hour*(-1);
      if (hour<23 && hour>=0)
       this.hour=hour;  
      ///////////////////////////////
      if (minute>60)
         this.minute=minute%60;
      if (minute<0)
         this.minute=minute*(-1);
      if (minute<60 && minute>=0)
         this.minute=minute;
      ////////////////////////////////
      if (second>=60)
         this.second=second%60;
      if (second<0)
         this.second=second*(-1);
      if (second<60 && second>=0)
         this.second=second;
   }
   
   public Time( int second)
   {
      this.hour=second/3600;
      this.minute=(second-(3600*this.hour)) /60;
      this.second=(second-3600*this.hour) - (60*this.minute);
   }
   
   public int getTimeInSeconds()
   {
      int timeInSeconds=hour*3600 + minute*60+second;
      return timeInSeconds;
   }
   public int getMinute()
   {
      return minute;
   }
   public int getSecond()
   {
      return second;
      
   }
   public int getHour()
   {
      return hour;
   }
   
   public String toString()
   {
      return String.format("%02d", getHour()) + ":" + String.format("%02d", getMinute()) + ":" + String.format("%02d", getSecond());
      
   }
}
