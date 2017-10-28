      /*for (int i = 0; i < array1.length - 1; i += 1)
      {
         int m = i;
         for (int j = i + 1; j < array1.length; j += 1)
         {
            if (array1[m] > array1[j])
               m = j;
         }
         int temp = array1[m];
         array1[m] = array1[i];
         array1[i] = temp;
      } SORTING THE ELEMENTS IN AN ARRAY 

      for (int i = 0; i < array1.length; i += 1)
         System.out.print(array1[i] + "\t");*/



public class NumberArrays
{

   public static void main(String[] args)
   {
      int[] numberArray1 = new int[100];
      int[] numberArray2 = new int[numberArray1.length];

      for (int i = 0; i < numberArray1.length; i++)
         
      {

         numberArray2[i] = numberArray1[i];
         System.out.print(i + " ");

      }

   }

}
