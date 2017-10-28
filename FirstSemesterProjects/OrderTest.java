
public class OrderTest
{
      public static void main(String[] args)
      {
         Product p1= new Product("Coffee", 25.00);
         Product p2= new Product("Tea", 15.00);
         OrderLine o1 = new OrderLine(2, p1);
         OrderLine o2= new OrderLine(3,p2);
         Order or1 = new Order();
         or1.addProduct(1, p1);
         or1.addProduct(2, p2);
         System.out.println(or1.getTotalPrice());
         System.out.println(or1.getOrderLine(1));
         System.out.println(or1.NumberOfOrderLines());
      }
}
