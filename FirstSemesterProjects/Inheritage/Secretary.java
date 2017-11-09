package Inheritage;

public class Secretary extends Employee
{
   private int wordsPerMinute;

   public Secretary(int numOfWordsPerMinute)
   {
      super("Secretary", "ICT");
      super.setAge(32);
      super.setName("Adam");
      wordsPerMinute = numOfWordsPerMinute;

   }

   public String toString()
   {
      return super.toString() + "\n The amount of words typing per minute is: "
            + wordsPerMinute;

   }
}
