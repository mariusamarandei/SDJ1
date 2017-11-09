package Exceptions;

public class XVArray
{

   public static void main(String[] args)
   {
      String[] xvArray = {"Mihai", "Jan", "Jana"};
      XVArray xvaObject = new XVArray();
      
      try
      {
         xvaObject.printOne(xvArray);
      }
      catch(ArrayIndexOutOfBoundsException aoe)
      {
         aoe.printStackTrace();
      }
      
      System.out.println("The End!");

   }
   
   public void printOne(String[] array)
   {
      
      System.out.println(array[3]);
      
   }

}
