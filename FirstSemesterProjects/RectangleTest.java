public class RectangleTest
{
   public static void main(String[] args)
   {
      Rectangle r = new Rectangle();
      r.setWidth(10);
      r.setLength(10);
      System.out.println("Show me the width: " + r.getWidth());
      System.out.println("Show me the length: " + r.getLength());
      System.out.println("Calculate the area:  " + r.getArea());
   }
}
