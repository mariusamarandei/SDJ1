package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

// A simple class to write to a text file
public class WriteTextFile
{
   // the filename and maybe plus path
   String filename = "example811.txt";
   public static void main(String[] args)
   {
      WriteTextFile wtf = new WriteTextFile();
      wtf.writeTxtfile(wtf.filename);

   }
   
   public void writeTxtfile(String filename)
   {
      File txtFile = new File(filename);
     
      
      try {
      PrintWriter outFile = new PrintWriter(txtFile);
      String[] txtStrs = { "Line 1; 1; 2.9",
                           "Line 2; 4; 3.4",
                           "Line 3; 4; 3.3",
                           "Line 4; 9; 1.1",
                           "Line 5; 3; 3.2"};
      
      for (int i = 0; i < txtStrs.length; i++)
      {
         outFile.println(txtStrs[i]);
         outFile.flush(); // force it to write the text  
      }
      outFile.close(); // close the file
      }
      catch(FileNotFoundException fne)
      {
         fne.printStackTrace();
      }
      System.out.println("The End - writing txt to file: " +txtFile.getAbsolutePath());
      
   }

}
