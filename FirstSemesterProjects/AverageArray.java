// insert 10 integers from keyboard
// average of all the positive numbers
// average of all negative numbers

import java.util.Scanner;

public class AverageArray
{

   public static void main(String[] args)
   {
      int[] array = new int[10];
      double sumOfPositiveNumbers = 0;
      double sumOfNegativeNumbers = 0;
      int positiveNumbers = 0;
      int negativeNumbers = 0;

      Scanner keyboard = new Scanner(System.in);

      for (int i = 0; i < array.length; i++)
      {

         System.out.println("Write the " + (i + 1) + " number: ");
         array[i] = keyboard.nextInt();

      }

      for (int i = 0; i < array.length; i++)
      {

         if (array[i] > 0)
         {
            sumOfPositiveNumbers += array[i];
           positiveNumbers++;
         }
         
         if (array[i] < 0) {
            sumOfNegativeNumbers += array[i];
            negativeNumbers++;
         }
      }
      
      if (positiveNumbers == 0)
      {
         System.out.println(" No positive numbers");
      }
      else {
         System.out.println("The average of the positive numbers is :" +(sumOfPositiveNumbers / positiveNumbers));
      }
      
      if (negativeNumbers == 0) {
         System.out.println("No negative numbers");
      }
      else {
         System.out.println("The average of the positive numbers is :" +(sumOfNegativeNumbers / negativeNumbers));
      }
   }
}
