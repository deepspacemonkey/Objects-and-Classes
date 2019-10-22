public class Room
{
  private int number;
  private Bed bed;
  private Guest guest;

  public Room(int number, String bedType)
  {
    this.number = number;
    this.bed = new Bed(bedType);
    guest = null;
  }

  public int getNumber()
  {
    return number;
  }

  public int getFloor()
  {
    return number / 100;
  }

  public double getPrice()
  {
    if (bed.isSingle())
      return 59.5;
    else if (bed.isDouble())
      return 72.4;
    else if (bed.isKingSize())
      return 89;
    return 0;
  }

  public boolean isOccupied()
  {
    return guest != null;
  }

  public void registerGuest(Guest guest)
  {
    if(!isOccupied())
      this.guest = guest;
  }

  public void vacate()
  {
    guest = null;
  }

  public String getBedType()
  {
    if(bed.isSingle())
      return "Single";
    else if (bed.isDouble())
      return "Double";
    else if(bed.isKingSize())
      return "King size";
    return "";
  }

  public Guest getGuest()
  {
    return guest;
  }
}
