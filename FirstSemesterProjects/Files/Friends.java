package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Friends
{
   Scanner keyboard = new Scanner(System.in);
   String filename = keyboard.nextLine();
   
   public static void main(String[] args)
   {

   }

   public void writeTextFile(String filename)
   {
      File txtFile = new File(filename);
      
      try 
      {
         PrintWriter outFile = new PrintWriter(txtFile);
         ArrayList<Friends> txtStrs = new ArrayList<>();
        
         
         for (int i = 0; i < txtStrs.size(); i++)
         {
            outFile.println(txtStrs);
            outFile.flush(); // force it to write the text  
         }
         outFile.close(); // close the file
         }
         catch(FileNotFoundException fne)
         {
            fne.printStackTrace();
         }
   }

}
