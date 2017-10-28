import java.util.Scanner;
public class LuckyArray
{

   public static void main(String[] args)
   {
      int size;
      int unlucky;
      int lucky = 0;
      
      Scanner keyboard = new Scanner(System.in);
      
      System.out.println("Insert the length of the array: " );
      
      size = keyboard.nextInt();
      
      int[] array = new int[size];
      
      for (int i = 0; i < array.length; i++) {
        
         System.out.println("Insert the " + (i+1) + " element");
         
         array[i] = keyboard.nextInt();
         
      }
      
      for (int i = 0; i < array.length; i++) {
         
         if (array[i] == 7 || array[i] == 9 || array[i] == 13) {
            lucky = 1;
         }
            else {
               lucky = 0;
               
            }  
         }
      if (lucky == 1) {
         System.out.println("Lucky");
      }
      
      else {
         System.out.println("Contains no 7-9-13");
      }
      }  
   }

