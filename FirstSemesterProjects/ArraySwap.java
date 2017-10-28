public class ArraySwap
{

   public static void main(String[] args)
   {

      int[] array1 = { 1, 2, 3, 4 };

      int swap = 0;

      for (int i = 0; i < array1.length; i++)
      {

         System.out.println("array " + i + " = " + (i + 1));

      }
      
      for (int j = 0; j < array1.length; j--) {
         
         if (j < array1.length) {
            
            array1[0] = array1[j];
            
            System.out.println(array1[j]);
            
            
          
         
         }
      }

   }

}
