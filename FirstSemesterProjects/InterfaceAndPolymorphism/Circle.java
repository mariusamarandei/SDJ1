package InterfaceAndPolymorphism;

public class Circle extends TwoDimensionalShape
{
   private double radius;

   public Circle(double x, double y, double radius)
   {
      super(x, y);
      this.radius = radius;
   }

   // Concrete methods not shown
   public double getArea()
   {
      return Math.PI * radius * radius;
   }
}