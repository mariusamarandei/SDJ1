
public class Guest
{
   private String name;
   
   public Guest(String name)
   {
      this.name=name;
   }
   public String getName()
   {
      return name;
   }
   
   public boolean equals(Guest input)
   {
      boolean status;
      if (name==input.getName())
         status=true;
      else
         status=false;
      return status;
   }
}
