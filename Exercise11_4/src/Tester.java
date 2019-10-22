public class Tester
{
  public static void printRooms(Room[] roomArray)
  {
    for(Room room : roomArray)
    {
      System.out.printf("Room %d, %s\n", room.getNumber(), room.getBedType());
    }
  }

  public static void main(String[] args)
  {
    Room[] rooms = new Room[5];
    rooms[0] = new Room(101, "Single");
    rooms[1] = new Room(102, "Single");
    rooms[2] = new Room(103, "Double");
    rooms[3] = new Room(104, "Double");
    rooms[4] = new Room(105, "King size");
    Hotel hilton = new Hotel("Hilton", rooms);

    Tester.printRooms(hilton.getAllAvailableRooms("Single"));
    Tester.printRooms(hilton.getAllAvailableRooms("King size"));
  }
}
