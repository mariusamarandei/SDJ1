import java.util.Scanner;

public class Age
{

   public static void main(String[] args)
   
   {
      Scanner input = new Scanner (System.in);
      System.out.print("Type your age: ");
      
      int age = input.nextInt();
      
      if (age < 0)
         System.out.println("Error in age value");
      
      if (age >= 0 && age <= 12)
      System.out.println("You are a child");
     
      if (age > 13 && age <= 19)     
         System.out.println("You are a teenager");
         
      if (age >19 && age <=65)
         System.out.println("You are an adult");
      
      if (age > 65)
         System.out.println("You are a senior citizen");
     }
   }