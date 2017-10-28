
public class Clock
{
   private int hour,minute,second;
   boolean before,is24TimeFormat;
   public String amPm;
   public Clock(int hour, int minute, int second)
   {
      is24TimeFormat=true;
      this.hour=hour;
      this.minute=minute;
      this.second=second;
   }
   
   public Clock(int totalSeconds)
   {
      is24TimeFormat=true;
      this.hour=totalSeconds/3600;
      this.minute= (totalSeconds-this.hour*3600) / 60;
      this.second= totalSeconds-this.hour*3600-this.minute*60;
      
   }
   
   public Clock copy()
   {
      Clock copyTime= new Clock(hour,minute,second);
      return copyTime;
   }
   
   public int getHour()
   {
      return hour;
   }
   
   public int getMinute()
   {
      return minute;
   }
   public int getSecond()
   {
      return second;
   }
   
   public void tic()
   { 
      second ++;
      
      if (second>59)
         {  
            minute++;
            second=0;
         }
      if (minute>59)
         {
            minute=0;
            hour++;
         }
      if (hour>23 && is24TimeFormat)
      {
         hour=0;
                
      }
      
      if (hour>11 && !is24TimeFormat)
      {
         hour=0;
         if (amPm=="AM")
            amPm="PM";
         else 
            amPm="AM";
      }
      
         
         
         
         
         
   }
   
   public int convertToSeconds()
   {
      int secNum=hour*3600+minute*60+second;
      return secNum;
   }
   
   public boolean isBefore(Clock input)
   {
      before=false;
      if (convertToSeconds()<input.convertToSeconds() )
      {
         before=true;
      }
      return before;
   }
   
   public boolean equals(Clock input)
   {  boolean isEqual;
      if (convertToSeconds()==input.convertToSeconds())
         isEqual=true;
      else
         isEqual=false;
         
      return isEqual;
   }
   
   public String toString()
   {
      if (is24TimeFormat==true)
        return String.format("%02d", getHour()) + ":" + String.format("%02d", getMinute()) +":"+String.format("%02d",getSecond());
      else
         return getHour()+":"+String.format("%02d", getMinute()) + ":" + String.format("%02d", getSecond()) + " " +amPm;
   }
   
   public void set24TimeFormat()
   {
      is24TimeFormat=true;
      if (amPm=="PM")
         hour=getHour()+12;
   }
   public void set12HourFormat()
   {
      is24TimeFormat=false;
      if (hour>12)
         amPm="PM";
      else
         amPm="AM";
      
      hour=getHour()%12;
      
   }
   
   public boolean is24HourFormat()
   {
      return is24TimeFormat;
   }
}
