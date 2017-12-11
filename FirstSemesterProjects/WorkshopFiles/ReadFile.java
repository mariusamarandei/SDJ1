package WorkshopFiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;

public class ReadFile
{
   public static void main(String[] args) throws Exception
   {

      File file = new File("marius");
      /*
       * try { Scanner inputFile = new Scanner(file);
       * while(inputFile.hasNextLine()) { String line = inputFile.nextLine();
       * System.out.println(line); } } catch (FileNotFoundException e) {
       * e.printStackTrace(); }
       */
      FileInputStream fis = new FileInputStream(file);
      FileReader reader = new FileReader(file);
      BufferedReader fileReader = new BufferedReader(reader);
      String line = null;
      do
      {
         line = fileReader.readLine();
         if (line == null)
         {
            break;
         }
         System.out.println(line);
      }
      while (true);
   }

}
