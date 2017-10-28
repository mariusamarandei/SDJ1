
public class TestLine
{
   public static void main(String[] args)
   {

      Point p1 = new Point(1, 2);
      Point p2 = new Point(3, 5);

      Line line1 = new Line(p1, p2, "red");
      System.out.println(line1);
      System.out.println(p1);
      System.out.println(line1.getSlope());
      System.out.println(line1.getSlopeIntercept());
      System.out.println(p1.getX());
      System.out.println(p1.equals(p1));
   }
}
