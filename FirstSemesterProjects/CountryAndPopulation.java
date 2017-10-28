public class CountryAndPopulation
{

   public static void main(String[] args)
   {

      String[] country = { "United States", "Brazil", "China", "Italy",
            "United Kingdom", "Spain", "Japan", "Germany", "France", "Turkey",
            "South Africa", "Argentina" };
      int[] population = { 319111000, 203462000, 1367960000, 60783711, 64105654,
            46507760, 127090000, 80767000, 66050000, 76667864, 54002000,
            42669500 };

      for (int i = 0; i < country.length; i++)

      {
         System.out.print(country[i] + "'s population: " + " ");
         System.out.print(population[i]);
         System.out.println();

      }
   }

}
