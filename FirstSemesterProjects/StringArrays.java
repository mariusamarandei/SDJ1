public class StringArrays
{

   public static void main(String[] args)
   {
      String[] names = new String[4];
      
      names[0] = "Einstein";
      names[1] = "Newton";
      names[2] = "Copernicus";
      names[3] = "Kepler";
      
      for (int i =0; i < names.length; i++)
      {
      
       System.out.println("Numele cu indicele " +i +" este " +  names[i] + " si are " + names[i].length() + " caractere");

      }
       
       
   }

}
