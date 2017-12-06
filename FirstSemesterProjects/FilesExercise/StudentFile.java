package FilesExercise;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.Scanner;

public class StudentFile
{
   private File file;

   public StudentFile(String filename)
   {
      setFile(filename);
   }

   public void setFile(String filename)
   {
      file = new File(filename);
   }

   public File getFile()
   {
      return file;
   }

   public StudentList readTextFile()
         throws FileNotFoundException, ParseException
   {
      try
      {
         File file = new File("Students.txt");
         Scanner inFile = new Scanner(file);
         StudentList list = new StudentList();

         while (inFile.hasNext())
         {
            String line = inFile.nextLine();
            String[] content = line.split(", ");
            int groupNumber = Integer.parseInt(content[0].trim());
            int studyNumber = Integer.parseInt(content[1].trim());
            String name = content[2].trim();
            String nationality = content[3].trim();
            int domBirthday = Integer.parseInt(content[4].trim());
            int monthBirthday = Integer.parseInt(content[5].trim());
            int yearBirthday = Integer.parseInt(content[6].trim());
            System.out.println(groupNumber + " - " + studyNumber + " - " + name
                  + " - " + nationality + " - " + domBirthday + " - "
                  + monthBirthday + " - " + yearBirthday);
            MyDate myBirthday = new MyDate(domBirthday, monthBirthday,
                  yearBirthday);
            Student stud = new Student(name, studyNumber, nationality,
                  groupNumber, myBirthday);
            list.add(stud);
         }
         inFile.close();
         System.out.println(list);
         return list;
      }
      catch (FileNotFoundException fne)
      {
         fne.printStackTrace();
      }
      System.out.println(
            "The End - reading txt to file: " + file.getAbsolutePath());

      return null;
   }

   public StudentList readTextFile(String filename)
         throws FileNotFoundException, ParseException
   {
      setFile(filename);
      return readTextFile();
   }

   public void writeTextFile(StudentList students) throws FileNotFoundException
   {
      StudentList txtFile = new StudentList();
   }

   public void writeTextFile(StudentList students, String filename)
         throws FileNotFoundException
   {
      setFile(filename);
      writeTextFile(students);
   }

   public void writeBinaryFile(StudentList list) throws IOException
   {
      // TODO: Implement this method
   }

   public void writeBinaryFile(StudentList list, String filename)
         throws IOException
   {
      setFile(filename);
      writeBinaryFile(list);
   }

   public StudentList readBinaryFile()
         throws IOException, ClassNotFoundException
   {
      // TODO: Implement this method
      return null;
   }

   public StudentList readBinaryFile(String filename)
         throws IOException, ClassNotFoundException
   {
      setFile(filename);
      return readBinaryFile();
   }
}