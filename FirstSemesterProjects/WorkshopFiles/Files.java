package WorkshopFiles;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class Files 
{
   
   
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.println("Enter the name of the file : ");
      String filename = input.nextLine();
      int x = 0;
      String friend = "";      
      
      try
      {
         FileOutputStream fileOut = new FileOutputStream(filename);
         PrintWriter  write = new PrintWriter(fileOut);
         
         
         while(x == 0) {
            System.out.println("Enter the friend's details: ");
            friend =  input.nextLine();
            
            if (friend.equalsIgnoreCase("QUIT"))
            {
               x = -1;
               write.close();
            }  
            else
            {
               write.println(friend);
            }     
            
         } 
      }
      catch (FileNotFoundException e)
      {
         
         e.printStackTrace();
      }
      
   }

}
