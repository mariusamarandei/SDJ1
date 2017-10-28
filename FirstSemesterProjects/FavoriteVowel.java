import java.util.Scanner;
public class FavoriteVowel
{

   public static void main(String[] args)
   {
      Scanner input = new Scanner (System.in);
      
      System.out.println("Please enter a vowel character: ");
      
      String line = input.nextLine();
      char vowel = line.charAt(0);
      
      
     
      switch(vowel) 
      {
         
         case 'a' : System.out.println("your favorite vowel: a"); break;
         case 'e' : System.out.println("your favorite vowel: e"); break;
         case 'i' : System.out.println("your favorite vowel: i"); break;
         case 'o' : System.out.println("your favorite vowel: o"); break;
         case 'u' : System.out.println("your favorite vowel: u"); break;
         default  : System.out.println("invalid character");
       }
      
      
   }

}
