package InterfaceAndPolymorphism;

public class Rectangle extends TwoDimensionalShape
{
   private double width;
   private double height;

   public Rectangle(double x, double y, double width, double height)
   {
      super(x, y);
      this.width = width;
      this.height = height;

   }

   public void setSides(double width, double height)
   {
      this.width = width;
      this.height = height;
   }

   @Override
   public double getArea()
   {

      return width * height;

   }

   public double getWidth()
   {
      return width;
   }

   public void setWidth(double width)
   {
      this.width = width;
   }

   public double getHeight()
   {
      return height;
   }

   public void setHeight(double height)
   {
      this.height = height;
   }

}
