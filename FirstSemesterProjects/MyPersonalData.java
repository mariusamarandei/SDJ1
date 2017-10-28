import java.util.Scanner;

public class MyPersonalData
{
   
      public static void main(String[] args)
      
      {

   String name;
   String address;
   int age;
   
   Scanner keyboard = new Scanner (System.in);
   
  System.out.print("What is your name? ");
  name = keyboard.nextLine();
  
  System.out.print("What is your age? ");
  age = keyboard.nextInt();
  
  keyboard.nextLine();
  
  System.out.print("What is your address? ");
  address = keyboard.nextLine();
  
  System.out.println("Hello " + name);
  System.out.println("Your age is: " + age);
  System.out.println("Your address is: " + address);
  
   }  
}
