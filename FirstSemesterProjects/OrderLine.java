
public class OrderLine
{
   private int amount;
   private Product product;
   
   public OrderLine( int amount, Product product)
   {
      this.amount=amount;
      this.product=product;
   }
   
   public int getAmount()
   {
      return amount;
   }
   public Product getProduct()
   {
      return product;
   }
   
   public double getPrice()
   {
      return product.getPrice();
   }
   
   public boolean equals(OrderLine other)
   {
      
      if (amount==other.getAmount() && product==other.getProduct())
         return true;
      else return false;
   }
   
   public OrderLine copy()
   {
      OrderLine copied= new OrderLine(amount, product);
      return copied;
   }
   public String toString()
   {
      return product.getName() + " " + amount;
   }
}
