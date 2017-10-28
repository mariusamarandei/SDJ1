
/*This program will check if 2 arrays are identical*/
import java.util.Scanner;

public class IdenticalArrays
{

   public static void main(String[] args)
   {

      int[] array1 = new int[4];
      int[] array2 = new int[4];

      int small = array1[0];

      Scanner sc = new Scanner(System.in);

      System.out.println("Insert the values of the arrays ");

      int x = 0;

      for (int index = 0; index < array1.length; index++)

      {

         System.out.println("The value of array1 index " + index + " is ");

         array1[index] = sc.nextInt();
         sc.nextLine();
      }

      for (int index = 0; index < array2.length; index++)
      {

         System.out.println("array2 index " + index + " is ");

         array2[index] = sc.nextInt();
         sc.nextLine();
      }

      for (int index = 0; index < array1.length; index++)
      {

         if (array1[index] == array2[index])
         {

            x = 1;

         }
         else
         {
            x = 0;
         }
      }
      if (x == 1)
      {

         System.out.println("Arrays are identical ");

      }

      else
      {
         System.out.println("Arrays are not identical ");

      }
      for (int index = 0; index < array1.length; index++)
      {

         if (small > array1[index])
         {

            small = array1[index];

            System.out.println("smallest is : " + small);

            for (int index1 = 0; index1 < array1.length; index1++)
            {

               array1[0] = array1[index1];

               array1[index1] = small;

            }
         }

         sc.nextLine();
         System.out.println(array1[0]);
      }

   }
}
