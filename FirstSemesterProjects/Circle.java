
public class Circle
{
   private double radius;
   private Point centerPoint;

   public Circle(double radius, Point centerPoint)
   {
      this.radius = radius;
      this.centerPoint = centerPoint;
   }

   public double getRadius()
   {
      return radius;
   }

   public Point getCenterPoint()
   {
      return centerPoint;
   }
   
   public double getArea()
   {
      double area=Math.PI*Math.pow(getRadius(), 2);
      return area;
   }
   public void moveTo(Point centerPoint)
   {
      centerPoint.moveTo(centerPoint.getX(), centerPoint.getY());
   }
   public String toString()
   {
      return "The center point is: "+centerPoint+" and the radius is "+radius;
   }
   public boolean equals(Circle input)
   {
      boolean status;
      if (radius==input.getRadius() && centerPoint==input.getCenterPoint())
         status=true;
      else status= false;
      return status;
   }
}
