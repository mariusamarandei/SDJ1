public class GradeList
{
   private Grade[] grades;
   private int indexOfNextAvailableElement;
   private static int INITIAL_CAPACITY = 4;

   public GradeList()
   {
      grades = new Grade[INITIAL_CAPACITY]; // initial capacity is 4
      indexOfNextAvailableElement = 0;
   }

   public int getSize()
   {
      return indexOfNextAvailableElement;
   }

   public Grade getGrade(int index)
   {
      if (index < 0 || index >= getSize())
         return null;
      return grades[index];
   }

   public Grade[] getAllGrades()
   {
      return grades;
   }

   public void addGrade(Grade grade)
   {
      if (indexOfNextAvailableElement >= grades.length)
      {
         Grade[] temporaryArray = new Grade[2 * grades.length];
         for (int i = 0; i < grades.length; i++)
         {
            temporaryArray[i] = grades[i];
         }
         grades = temporaryArray;
      }
      grades[indexOfNextAvailableElement] = grade;
      indexOfNextAvailableElement++;
   }

   public double getAverage()
   {
      int sum = 0;
      for (int i = 0; i < getSize(); i++)
      {
         sum += grades[i].getGrade();
      }
      double avg = (double) sum / getSize();
      return avg;
   }

   public String toString()
   {
      String s="";
      for (int i = 0; i <getSize(); i++) {
         s+= (i + 1) + ": " + grades[i];
         
         if (i< getSize() -1) {
            s+= "\n";
         }
      }
      return s;
   }
}