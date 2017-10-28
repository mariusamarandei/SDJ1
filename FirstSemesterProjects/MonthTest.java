//Tests Month  
public class MonthTest
{
   public static void main(String[] args)
   {
      Month m1 = new Month();
      Month m2 = new Month(4);
      
      //Print out static var that tracks number of objects
      
      System.out.println("number of months is " + Month.getNumberOfMonths());
      
      // Two more months
      
      Month m3 = new Month(m2);
      Month m4 = new Month("September");
                
      System.out.println("Now there are " + Month.getNumberOfMonths() + " months"); 
      System.out.println("The months are " + m1 +","+m2+ "," +m3 +","+ m4);
      
      //Test comparison methods:
      System.out.println(m1+" is less than " + m2+":" + m1.lessThan(m2));
      System.out.println(m3+" is greater than " + m1+":" + m3.greaterThan(m1));
      
      System.out.println(m2+" is equal to "+m3+ ": " +m2.equals(m3));
      System.out.println(m1);
      System.out.println(m4);
      System.out.println("is m4 equal m1: "+ m1.equals(m4));
   }
}
