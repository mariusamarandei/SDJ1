package InterfaceAndPolymorphism;

public class ShapeTest
{
   public static void main(String args[])
   {
      Circle shape2 = new Circle(2, 6, 8);
      // TwoDimensionalShape shape3 = new Triangle(...);
      System.out.println(shape2.getArea());
      // System.out.println(shape3.getArea());
   }
}