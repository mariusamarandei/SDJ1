// For every 3rd element, print false
// For every true element, print the index

public class BooleanArray
{

   public static void main(String[] args)
   {
      boolean[] array = new boolean[15];
      
      for (int i = 0; i < array.length; i++ ) {
         
         array[i] = true;   
      }
      
      for (int i = 2; i < array.length; i = (i+3)) {
         array[i] = false;
      }
    for (int i = 0; i < array.length; i++ ) {
         
         System.out.println(array[i]);   
      }
    for (int i = 0; i < array.length; i++ ) {
       if ( array[i] == true) {
          System.out.print(i + " ");
       }
          
    }
   }

}
