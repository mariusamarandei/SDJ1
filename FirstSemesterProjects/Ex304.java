import java.util.Scanner;

public class Ex304
{
   public static void main(String[] args)
   {
   int a;
   int b;
   
   
   
   
   Scanner keyboard = new Scanner (System.in);
   
   System.out.print("a= ");
   a = keyboard.nextInt();
   
   
   System.out.print("b= ");
   b = keyboard.nextInt();
  
   
   if (a<b) 
   { 
   System.out.println("Numbers in order: " +a +" " +b );
   
   }
   
   else if (a>b)
      
   {
      System.out.println("Numbers in order: " +b +" " +a);
   }
   
   keyboard.nextLine();
   {
      System.out.println("a+b= " +(a+b));
   }
   
  
   
   {
      {
  if  (b == 0)
     
      
      {
         System.out.println("cannot divide by 0");
      
      }
      
      else if  ( b != 0)
         
      {
         System.out.println("a/b= " +(a/b));
      }
        
        
        
        {
                   
           int c = a % b;
           System.out.println("remainder after division: " +c );          
           
        }
        
        
      {
         
         }
      }
   }
}
}
