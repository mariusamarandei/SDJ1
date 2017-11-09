package Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTxtFile
{
   // the file
   String filename = "example811.txt";
   public static void main(String[] args)
   {
      
      ReadTxtFile rtf = new ReadTxtFile();
      rtf.readTxtFile(rtf.filename);
   }
   
   public void readTxtFile(String filename)
   {
      File file = new File(filename);
      
      try {
      Scanner inFile = new Scanner(file); // Open the file
      
      while(inFile.hasNext())
      {
         String line = inFile.nextLine(); // read a line
         String[] content = line.split(";"); // Split the line
         String txt = content[0].trim();
         int x = Integer.parseInt(content[1].trim());
         double y = Double.parseDouble(content[2].trim());
         System.out.println(txt + " - " +x +" - " + y);
      }
      inFile.close();
      
      }
      catch(FileNotFoundException fne)
      {
         fne.printStackTrace();
      }
      System.out.println("The End - reading txt to file: " +file.getAbsolutePath());
   }

}
