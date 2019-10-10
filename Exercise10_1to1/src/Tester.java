public class Tester
{
  public static void main(String[] args)
  {
    Bed myBed = new Bed("Double");
    System.out.println(myBed.isSingle());
    System.out.println(myBed.isDouble());

    Guest myGuest = new Guest("Bob");
    Room booking = new Room(214, "Double");
    booking.registerGuest(myGuest);

    System.out.println(booking.getFloor());
    System.out.println(booking.isOccupied());
    booking.vacate();
    System.out.println(booking.isOccupied());
    booking.registerGuest(new Guest("John"));
    System.out.println(booking.isOccupied());

    Room booking2 = new Room(101, "Single");
    booking2.registerGuest(booking.getGuest());
  }
}
