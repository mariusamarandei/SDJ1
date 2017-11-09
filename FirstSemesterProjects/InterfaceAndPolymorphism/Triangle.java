package InterfaceAndPolymorphism;

public class Triangle extends TwoDimensionalShape
{
   private double sideA, sideB, sideC;
   public Triangle(double x, double y, double sideA, double sideB, double sideC)
   {
      super(x, y);
      this.sideA = sideA;
      this.sideB = sideB;
      this.sideC = sideC;
      
   }

   @Override
   public double getArea()
   {
      double area;
      double angleC = Math.acos((sideA * sideA + sideB * sideB - sideC * sideC)/(2*sideA*sideB));
      area = (0.5 * sideA*sideB*Math.sin(angleC));
      return area ;
   }

   public double getSideB()
   {
      return sideB;
   }

   public void setSideB(double sideB)
   {
      this.sideB = sideB;
   }

   public double getSideA()
   {
      return sideA;
   }

   public void setSideA(double sideA)
   {
      this.sideA = sideA;
   }

   public double getSideC()
   {
      return sideC;
   }

   public void setSideC(double sideC)
   {
      this.sideC = sideC;
   }

}
