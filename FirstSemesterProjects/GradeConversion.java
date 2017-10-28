import java.util.Scanner;

public class GradeConversion
{

   public static void main(String[] args)
   {
     Scanner input = new Scanner (System.in);
     System.out.println("Enter the grade: ");
     int a; 
     
     a = input.nextInt();
     
     switch(a){
        
        case 12 : System.out.println("The equivalent is: A "); break;
        case 10 : System.out.println("The equivalent is: B "); break;
        case 7 : System.out.println("The equivalent is: C "); break;
        case 4 : System.out.println("The equivalent is: D "); break;
        case 2 : System.out.println("The equivalent is: E "); break;
        case 0 : System.out.println("The equivalent is: Fx "); break;
        case -3 : System.out.println("The equivalent is: F "); break;
        default : System.out.println("Invalid grade");
        
     }
    
         

   }

}
