import java.util.Scanner;
public class SumAndProduct
{
 public static void main(String[] args)
 {
    int a;
    int b;
    int c;
    
    Scanner keyboard = new Scanner (System.in);
    
    System.out.print("Insert the first number: ");
    a = keyboard.nextInt();
    
    System.out.print("Insert the second number: ");
    b = keyboard.nextInt();
    
    System.out.print("Insert the third number: ");
    c = keyboard.nextInt();
    
    System.out.println("a + b + c = " +(a+b+c));
 }
}
