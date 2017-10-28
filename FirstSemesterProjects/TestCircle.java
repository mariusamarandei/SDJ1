
public class TestCircle
{
   public static void main(String[] args)
   {
      Point p1= new Point (3,5);
      Circle c1= new Circle(2.5, p1);
      System.out.println(c1.getArea());
      Circle c2= new Circle(235,p1);
      System.out.println(c1.equals(c2));
      System.out.println(c1);
      
   }
}
