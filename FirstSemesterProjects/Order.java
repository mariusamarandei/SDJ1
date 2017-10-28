import java.util.ArrayList;
public class Order
{
   ArrayList<OrderLine> totalOrders = new ArrayList<OrderLine>();
   static int numOfLines;
   
   public Order()
   {
      
   }
   
   public void addProduct( int amount, Product product)
   {
      OrderLine added = new OrderLine(amount, product);
      totalOrders.add(added);
      numOfLines++;
   }
   
   public int NumberOfOrderLines()
   {
      int number=numOfLines;
      return number;
   }
   
   public OrderLine getOrderLine(int index)
   {
      OrderLine returnThis=totalOrders.get(index);
      return returnThis;
      
   }
   
   public double getTotalPrice()
   {
      double totalPrice=0.00;
      for (int i=0;i<numOfLines;i++)
      {
         double unitPrice=totalOrders.get(i).getPrice();
         int unitCount=totalOrders.get(i).getAmount();
          totalPrice=totalPrice+unitPrice*unitCount;
         
      }
      return totalPrice;
   }
   
}
