package Files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadTables
{
   String filename = "timestable.dat";
   ObjectInputStream in = null;

   public static void main(String[] args)
   {
      ReadTables rtf = new ReadTables();
      rtf.readBinarry(rtf.filename);
   }

   public void readBinarry(String filename)
   {

      try

      {
         File file = new File(filename);
         FileInputStream fis = new FileInputStream(file);
         in = new ObjectInputStream(fis);
         int count = in.readInt();
         for (int i = 0; i < count; i++)
         {
            int intValue = in.readInt();
            int value = in.readInt();
            System.out.println(intValue + ", " + value);
         }
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
      finally
      {
         try
         {
            in.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }
}
