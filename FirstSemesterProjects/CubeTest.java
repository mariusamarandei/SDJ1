import java.util.Scanner;

// This method demonstrates passing arguments to a superclass constructor.
public class CubeTest
{

   public static void main(String[] args)
   {
      double length, // To hold a length
            width, // To hold a width
            height; // To hold a height;
      // Create a scanner object for keyboard input.
      Scanner keyboard = new Scanner(System.in);

      // Get the dimensions of the cube from the user.
      System.out.println("Enter the following dimensions " + "of a cube: ");
      System.out.println("Length: ");
      length = keyboard.nextDouble();
      System.out.println("Width: ");
      width = keyboard.nextDouble();
      System.out.println("Height: ");
      height = keyboard.nextDouble();

      // Create a cube object and pass the dimensions to the constructor.
      Cube myCube = new Cube(length, width, height);

      // Display the properties of the cube.
      System.out.println();
      System.out.println("Here are the properties of " + "the cube. ");
      System.out.println("Length: " + myCube.getLength());
      System.out.println("Width: " + myCube.getWidth());
      System.out.println("Height: " + myCube.getHeight());
      System.out.println("Base area: " + myCube.getArea());
      System.out.println("Surface area: " + myCube.getSurfaceArea());
      System.out.println("Volume: " + myCube.getVolume());
   }

}
