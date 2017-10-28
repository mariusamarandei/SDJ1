import java.util.Arrays;
import java.util.Scanner;

public class Review
{

   public static void main(String[] args)
   {
      int numbers = 25;

      int[] myNums = new int[numbers];

      for (int i = 0; i < myNums.length; i++)
      {

         myNums[i] = 2 * i;

         System.out.println(myNums[i]);

      }

      printWithArraysClass(myNums);
      printEnhancedForLoop(myNums);

   }

   private static void printEnhancedForLoop(int[] myNums)
   {
      System.out.println("Enhanced for loop... ");
      for (int i : myNums)
      {

         System.out.print(i +" ");

      }

   }

   private static void printWithArraysClass(int[] myNums)
   {
      System.out
            .println(" Printing with Arrays Class " + Arrays.toString(myNums));

   }

}
