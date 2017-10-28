import java.util.Scanner;
public class Count
{

   public static void main(String[] args) {
      
      final int numbers = 5;
      int[] a = new int[numbers];
      int min;
      min = getValues(a);
      System.out.println("Smallest positive number is : " + min);

   }

   private static int getValues(int[] a)
   {
      Scanner keyboard = new Scanner(System.in);
      int min;
      
     
      for (int i = 0; i < a.length; i++)
      {

         System.out.println(" Type integer #" + (i + 1));
         a[i] = keyboard.nextInt();

      }
      min = a[0];

      System.out.println("Your integers are :");

      for (int i = 0; i < a.length; i++)
      {
         System.out.println(a[i]);
         if (min > a[i])
            min = a[i];

      }
      return min;
      
      
   }
}
