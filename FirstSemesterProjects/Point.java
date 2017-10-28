
public class Point
{
   private double x,y;
   
   public Point(double x, double y)
   {
      this.x=x;
      this.y=y;
   }
   
   public double getX()
   {
      return x;
   }
   public double getY()
   {
      return y;
   }
   
   public void moveTo(double newX, double newY)
   {
      x=newX;
      y=newY;
   }
   
   public void move(double xDistance, double yDistance)
   {
      x=x+xDistance;
      y=y+yDistance;
   }
   
   public Point copy()
   {
      return new Point(x,y);
   }
   
   public String toString()
   {
      return "("+x+","+y+")";
   }
   
   public boolean equals(Point input)
   {
      boolean status;
      if (x==input.getX() && y==input.getY())
         status=true;
      else
         status=false;
      return status;
   }
   
}
