package VehicleInheritage;

public class Van extends Car
{
   private int maxLoad;
   public Van(String theOwner, double thePrice, String regNo, int maxLoad)
   {
      super(theOwner,thePrice,regNo);
      this.maxLoad = maxLoad;
   }
   public int getMaxLoad()
   {
      return maxLoad;
   }
   public void setMaxLoad(int maxLoad)
   {
      this.maxLoad = maxLoad;
   }
   
   public String toString()
   {
     return super.toString() +" \n The maximum load of the van can be: " + maxLoad;
   }
   
   public boolean equals(Object arg)
   {
      if(!(arg instanceof Van))
         return false;
      Van other = (Van)arg;
      return super.equals(arg) && (maxLoad == other.maxLoad);
   }

}
