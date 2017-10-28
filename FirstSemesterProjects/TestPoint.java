      
public class TestPoint
{
   public static void main(String[] args)
   {
      Point p1= new Point(3,5);
      System.out.println(p1.getX());
      System.out.println(p1.getY());
      System.out.println(p1);
      Point p2= new Point(3,5);
      System.out.println(p2.equals(p1));
      System.out.println(p1.equals(p2.copy()));
   }
}
