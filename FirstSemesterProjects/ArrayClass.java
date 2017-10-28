
public class ArrayClass
{

   public static void main(String[] args)
   {
      String[] names;
      
      names = new String[20];
      
      names[0] = "whateva";
      names[1] = "jack";
      names[2] = "jones";
      names[3] = "john";
      names[4] = "dennis";
      names[5] = "kevin";
      names[6] = "duky";
      names[7] = "simona";
      names[8] = "brian";
      names[9] = "olson";
      names[10] = "james";
      names[11] = "bond";
      names[12] = "melvin";
      names[13] = "bernard";
      names[14] = "vasyl";
      names[15] = "tyson";
      names[16] = "ali";
      names[17] = "muhammad";
      names[18] = "creative";
      names[19] = "boy";
      
      System.out.println("How many names: " + names.length);
      
      for (int i = 0; i < names.length; i++)
      
      {
         System.out.println(names[i] + " ");
      }

   }

}
