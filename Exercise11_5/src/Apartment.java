public class Apartment
{
  private int number;
  private Tenant tenant;

  public Apartment(int number)
  {
    this.number = number;
  }

  public int getNumber()
  {
    return number;
  }

  public boolean isAvailable()
  {
    return tenant != null;
  }

  public void rentTo(Tenant tenant, MyDate rentedFrom)
  {
    this.tenant = tenant;
    this.tenant.setRentedFrom(rentedFrom);
  }

  public Tenant getTenant()
  {
    if (isAvailable())
      return tenant;
    return null;
  }

  public String toString()
  {
    return tenant == null ? String.format("| Number: %d - No tenant |", number) : String.format("| Number: %d - %s |", number, tenant);
  }
}
