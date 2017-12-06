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

public class TestFile
{

   public static void main(String[] args) throws FileNotFoundException, ParseException 
   {
      StudentFile stud = new StudentFile("Student.txt");
      stud.readTextFile();
   }
}
