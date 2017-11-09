/*This program demonstrates the GradedActivity class.*/
import java.util.Scanner;
public class GradeTest
{

   public static void main(String[] args)
   {
      double testScore; // To hold a test score
      
      // Create a scanner object to get input from keyboard.
      Scanner keyboard = new Scanner(System.in);
      
      // Create a GradedActivity object.
      GradedActivity grade = new GradedActivity();
      
      // Get a test score from the user.
      System.out.println("Enter a numeric test score: ");
      testScore = keyboard.nextDouble();
      
      // Set the GradedActivity object's score.
      grade.setScore(testScore);
      
      // Display the letter grade for that score.
      System.out.println("The grade for that test is " +grade.getGrade());
   }

}
