import java.util.Scanner;

    /*This program calculates the sum, the average and the
     *  lowest value of 5 integers*/
public class AverageSmallLarge
{

   public static void main(String[] args)
   {
     int numValues;
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Insert the values: ");
 
     numValues = keyboard.nextInt();
     
     int[] values = new int[5];
     
     for (int i = 0; i < values.length; i++) {
        System.out.println("Enter the first value: " + (i+1) + " ");
                values[i] = keyboard.nextInt();
     }


   }

}
