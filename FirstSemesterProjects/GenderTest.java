import java.util.Scanner;
public class GenderTest
{
 public static void main(String[] args)
 {
    int age;
 Scanner input = new Scanner(System.in);
 System.out.print("Type gender (M or F): ");
 String line = input.nextLine();
 
 System.out.println("Type your age: ");
 
 
 char gender = line.charAt(0);
 
 if (gender != 'M' && gender != 'F')
    
    System.out.println("Wrong input");

 else
 {
 
  age = input.nextInt();
 
 if (gender == 'M' && age > 18)
 System.out.println("Man");
 
 else 
    
 if (gender == 'M' && age < 18)
 
  System.out.println("Boy");
 
 if (gender == 'F' && age > 18)
    System.out.println("Woman");
    
else 
       
     if (gender == 'F' && age < 18)
    
     System.out.print("Girl");
    
 
// else
 //System.out.println("Not a Male");
 }
}
}