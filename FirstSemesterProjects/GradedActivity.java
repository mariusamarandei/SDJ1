/*A class that holds a grade for a graded activiry.*/
public class GradedActivity
{
   private double score; // Numeric score
   
   public void setScore(double s) {
      score = s;
   }
   public double getScore() {
      return score;
   }
   
   /*The getGrade method returns a letter grade determined
   from the score field.*/
   public char getGrade() {
      char letterGrade = '\u0000'; // to hold the grade
      if (score >= 90)
         letterGrade = 'A';
      else if ( score >=80)
         letterGrade = 'B';
      else if ( score >=70)
         letterGrade = 'C';
      else if ( score >=60)
         letterGrade = 'D';
      else if ( score >=50)
         letterGrade = 'F';
      return letterGrade;
      
   }
   
}
