
//This program will show us the last digit of an integer

import java.util.Scanner;

public class LastDigit
{

   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);

      int a = 2346;
      
      printMe();

      System.out.println("Show the last digit:" + (a % 10));
      a = keyboard.nextInt();

   }
 
   public static void printMe() {
      
      System.out.println("Marius");
      
      
      
   }
   
}
