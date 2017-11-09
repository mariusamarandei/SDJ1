package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception
{
public static void main(String[] args)
{
   int[] numbers=new int[5];
   Scanner input=new Scanner(System.in);
      try
      {
         for(int i=0;i<numbers.length;i++)
         {
            System.out.println("Type an integer in the range 10-99:");
            int temp;
            while(!(9<(temp=input.nextInt()) && temp<100)) {
              System.out.println("It has to be in the range 10-99:");
            }
         numbers[i] = temp;
      }
      }
      catch(InputMismatchException e)
      {
         e.printStackTrace();
         e.getMessage();
      }
      

   
   for(int i=0;i<numbers.length;i++)
   {
      System.out.println("number "+(i+1)+" is "+numbers[i]);
   }
  
 }
}

