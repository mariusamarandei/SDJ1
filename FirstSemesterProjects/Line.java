
public class Line
{
   private String color;
   private Point pointA, pointB;

   public Line(Point pointA, Point pointB, String color)
   {
      this.pointA = pointA.copy();
      this.pointB = pointB.copy();
      this.color = color;
   }

   public Line(Point pointA, Point pointB)
   {
      this.pointA = pointA.copy();
      this.pointB = pointB.copy();
      this.color = "Black";
   }

   // Getters

   public Point getPointA()
   {
      return pointA;
   }

   public Point getPointB()
   {
      return pointB;

   }

   public String getColor()
   {
      return color;
   }

   // Setters

   public void setPointA(Point input)
   {
      pointA = input;
   }

   public void setPointB(Point input)
   {
      pointB = input;
   }

   public void setColor(String input)
   {
      color = input;
   }

   public double length()
   {
      double len = Math.sqrt(Math.pow(pointB.getX() - pointA.getX(), 2)
            + Math.pow(pointB.getY() - pointA.getY(), 2));
      return len;

   }

   public String toString()

   {
      return "A " + color + " line from " + pointA + " to " + pointB
            + " with length equal to " + length();

   }

   public boolean equals(Line input)
   {
      boolean status;
      if (pointA == input.getPointA() && pointB == input.getPointB()
            && color == input.getColor())
         status = true;
      else
         status = false;
      return status;
   }

   public double getSlope()
   {
      double slope = (pointB.getY() - pointA.getY())
            / (pointB.getX() - pointA.getX());
      return slope;
   }

   public double getYIntercept()
   {
      double intercept = pointA.getY() + getSlope() * pointA.getX();
      return intercept;
   }

   public String getSlopeIntercept()
   {
      return "y=" + getSlope() + "x +" + getYIntercept();
   }

   public boolean equalSlopeIntercept(Line input)

   {
      boolean status;
      if (getSlope()==input.getSlope() && getYIntercept()==input.getYIntercept())
         status=true;
      else status=false;
      return status;
   }

}
