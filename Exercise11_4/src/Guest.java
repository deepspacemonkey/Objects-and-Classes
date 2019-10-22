public class Guest
{
  private String name;

  public Guest(String name)
  {
    this.name = name;
  }

  public String getName()
  {
    return name;
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Guest))
      return false;
    Guest otherGuest = (Guest) obj;
    return otherGuest.getName().equals(name);
  }
}
