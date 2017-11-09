package Files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteTables
{
   String filename = "timestable.dat";
   ObjectOutputStream out = null;

   public static void main(String[] args)
   {
      WriteTables write = new WriteTables();
      write.writeBinnary(write.filename);

   }

   public void writeBinnary(String filename)
   {

      try
      {
         File file = new File(filename);
         FileOutputStream fos = new FileOutputStream(file);
         out = new ObjectOutputStream(fos);
         int count = 11;
         out.writeInt(count);
         for (int i = 0; i < count; i++)
         {
            out.writeInt(i);
            out.writeInt(i * 7);
         }

      }
      catch (IOException e)
      {
         System.out.println("Exception: " + filename);
      }
      finally
      {
         try
         {
            out.close();
         }
         catch (IOException e)
         {
            e.printStackTrace();
         }
      }
   }
}
