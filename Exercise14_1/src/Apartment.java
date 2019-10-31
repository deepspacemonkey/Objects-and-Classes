public class Apartment extends Home
{
  private double rent;

  public Apartment(String address, double rent)
  {
    super(address);
    this.rent = rent;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Apartment))
      return false;
    Apartment other = (Apartment) obj;
    return super.equals(other) && rent == other.rent;
  }

  public String getInfo()
  {
    return String.format("Address: %s | Rent : %.2f$", getAddress(), rent);
  }

  public String toString()
  {
    return getInfo();
  }
}
