
public class RoomTest
{

   public static void main(String[] args)
   {
      Bed bed1= new Bed("Single");
      Guest guest1 = new Guest("Kyle");
      System.out.println(guest1.getName());
      System.out.println(bed1.isSingle());
      
      Room room1= new Room(301, "Single");
      System.out.println(room1.isOccupied());
      System.out.println(room1.getBedType());
      System.out.println(room1.getPrice());
      room1.registerGuest(guest1);
      System.out.println(room1.isOccupied());
      System.out.println(room1.getGuest().getName());
      System.out.println(room1.getFloor());
      room1.vacate();
      System.out.println(room1.isOccupied());
   }
   
}
