import java.util.Scanner;
/*import java.text.DecimalFormat;*/

public class DoubleArray
{
   public static void main(String[] args)
   {

      final int numbers = 7;
      double[] a = new double[numbers];
      double min;
      min = getValues(a);
      System.out.println("Double min: " + min);

   }

   private static double getValues(double[] a)
   {
      Scanner keyboard = new Scanner(System.in);
      double min;
      for (int i = 0; i < a.length; i++)
      {

         System.out.println("Double no. " + (i + 1));
         a[i] = keyboard.nextDouble();

      }
      min = a[0];

      System.out.println("Your doubles are :");

      for (int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
         if (min > a[i])
            min = a[i];

      }
      return min;
   }

}
