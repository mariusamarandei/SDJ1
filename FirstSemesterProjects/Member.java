
public class Member
{
   private String name;
   private String password;
   
   public Member(String name, String password)
   {
      this.name=name;
      this.password=password;
   }
   public String getName()
   {
      return name;
   }
   public boolean checkPassword(String password)
   {
      if (this.password==password)
         return true;
      else
         return false;
               
   }
   public void setPassword(String password)
   {
      this.password=password;
   }
   public boolean equals(Member input )
   {
      if (name==input.getName())
         return true;
      else return false;
      
   }
   public String toString()
   {
      return name +" "+ password;
   }
   
}
