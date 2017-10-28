import java.util.Scanner;

public class MonthEquivalent
{

   public static void main(String[] args)
   
   {
   
   Scanner input = new Scanner (System.in);
   System.out.println("Enter the month: ");
   
      String month;
      month = input.nextLine().toLowerCase();
      
   
   
   
   switch(month) {
      
      case "january" : System.out.println("Month number is: 1"); break;
      case "february" : System.out.println("Month number is: 2"); break;
      case "march" : System.out.println("Month number is: 3"); break;
      case "april" : System.out.println("Month number is: 4"); break;
      case "may" : System.out.println("Month number is: 5"); break;
      case "june" : System.out.println("Month number is: 6"); break;
      case "july" : System.out.println("Month number is: 7"); break;
      case "august" : System.out.println("Month number is: 8"); break;
      case "september": System.out.println("Month number is: 9"); break;
      case "october" : System.out.println("Month number is: 10"); break;
      case "november" : System.out.println("Month number is: 11"); break;
      case "december" : System.out.println("Month number is: 12"); break;
      default : System.out.println("-1");
      
   }
   
   
   {
      

   }

   }
}
