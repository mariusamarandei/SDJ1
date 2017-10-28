import java.util.Scanner;

public class Reverse
{
   public static void main(String[] args)
   {
      final int numbers = 10;
      int[] num = new int[numbers];

      Scanner keyboard = new Scanner(System.in);

      System.out.println("Enter the integers " + numbers);

      for (int i = 0; i < numbers; i++)
      {

         System.out.println("Integer " + (i + 1) + ": ");
         num[i] = keyboard.nextInt();

      }

      System.out.println("The integers you entered are: ");

      for (int i = 0; i < numbers; i++)
      {
         System.out.println(num[i]);
      }
      for (int i = num.length - 1; i >= 0; i--)
      {
         System.out.println("And now let's show them in reverse order: " + num[i]);
      }

   }
}