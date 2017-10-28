
public class TestRoom
{

   public static void main(String[] args)
   {
      Bed bed = new Bed("SiNgLe");
      Room room = new Room(834, "double");
      Guest guest = new Guest("Flavius");
      
      
      System.out.println("Is single bed? : \n" +bed.isSingle());
      System.out.println("What is the price of the room? :\n"  +room.getPrice());
      System.out.println("At what floor is the room? :\n" +room.getFloor());
      System.out.println("What is the room number? :\n" +room.getNumber());
      System.out.println("Is the bed double in my room? :\n" +room.getBedType());
      System.out.println("Is the room occupied? : \n" +room.isOccupied());
      
      room.registerGuest(guest);
      
      System.out.println("---------------------------------------------------");
      System.out.println("After a while....Is the room still occupied? :\n" +room.isOccupied());
      System.out.println("Whos is it ? :\n" +room.getGuest().getName());
   }

}
