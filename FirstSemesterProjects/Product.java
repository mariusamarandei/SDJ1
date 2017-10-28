
public class Product
{
   private String name;
   private double price;
   
   public Product(String name, double price)
   {
      this.name=name;
      this.price=price;
   }
   
   public String getName()
   {
      return name;
   }
   public double getPrice()
   {
      return price;
   }
   public void setPrice(double price)
   {
      this.price=price;
   }
   public Product copy()
   {
      Product copyProduct = new Product(name, price);
      return copyProduct;
   }
   
   public String toString()
   {
      return "Product is " + name + " and the price is " + price;
   }
}
