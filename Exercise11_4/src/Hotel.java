import java.util.ArrayList;

public class Hotel
{
  private String name;
  private Room[] rooms;

  public Hotel(String name, Room[] rooms)
  {
    this.name = name;
    this.rooms = rooms;
  }

  public String getName()
  {
    return name;
  }

  public int getNumberOfRooms()
  {
    return rooms.length;
  }

  public int getNumberOfAvailableRooms()
  {
    int counter = 0;
    for (Room room : rooms)
    {
      if (!room.isOccupied())
        counter++;
    }
    return counter;
  }

  public Room getFirstAvailableRoom()
  {
    int i = 0;
    while (rooms[i].isOccupied())
      i++;
    return rooms[i];
  }

  public Room getFirstAvailableRoom(double maxPrice)
  {
    int i = 0;
    while (rooms[i].isOccupied() || rooms[i].getPrice() > maxPrice)
      i++;
    return rooms[i];
  }

  public Room[] getAllAvailableRooms(String bedType)
  {
    ArrayList<Room> emptyRooms = new ArrayList<Room>();
    for (Room room : rooms)
    {
      if (!room.isOccupied() && bedType.equals(room.getBedType()))
        emptyRooms.add(room);
    }
    return emptyRooms.toArray(new Room[emptyRooms.size()]);
  }

  public boolean hasGuest(Guest guest)
  {
    for (Room room : rooms)
      if (room.getGuest().equals(guest))
        return true;
    return false;
  }

  public Room getRoom(Guest guest)
  {
    if (hasGuest(guest))
    {
      for (Room room : rooms)
        if (room.getGuest().equals(guest))
          return room;
    }
    return null;
  }
}
