import java.util.Scanner;
public class PrintSum
{
 public static void main(String[] args)
 {
 Scanner input = new Scanner(System.in);
 int sum = 0;
 for (int i=0; i<2; i++)
 {
 System.out.print("Type an integer: ");
 int value = input.nextInt();
 sum += value;
 }
 System.out.println("The sum is " + sum);
 }
}
