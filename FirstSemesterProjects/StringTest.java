import java.util.Scanner;
import java.util.Arrays;
public class StringTest
{

   public static void main(String[] args)
   {
     
      Scanner input = new Scanner(System.in);
      System.out.println("Enter the name of the city: ");
      String city = input.nextLine();
      
      System.out.println("Number of letters: " +city.length());
      System.out.println("Uppercase: " +city.toUpperCase());
      System.out.println("Lowercase: " +city.toLowerCase());
      System.out.println("First Character: " +city.charAt(0));
      System.out.println("Character Arrays: " +Arrays.toString(city.toCharArray()));
      input.close();
   }

}
