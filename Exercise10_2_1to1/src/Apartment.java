public class Apartment
{
  private String address;
  private double rent;
  private Tenant tenant;

  public Apartment(String address, double rent)
  {
    this.address = address;
    this.rent = rent;
    tenant = null;
  }

  public void setRent(double rent)
  {
    this.rent = rent;
  }

  public String getAddress()
  {
    return address;
  }

  public double getRent()
  {
    return rent;
  }

  public void rentTo(String name, String phone)
  {
    if (!isOccupied())
      tenant = new Tenant(name, phone);
  }

  public boolean isOccupied()
  {
    return tenant != null;
  }

  public void evict()
  {
    tenant = null;
  }

  public Tenant getTenant()
  {
    if (isOccupied())
      return tenant.copy();
    return null;
  }

  public double getRentDue()
  {
    if (isOccupied())
      return tenant.getRentDue();
    return 0;
  }

  public void chargeRent()
  {
    tenant.setRentDue(getRentDue() + rent);
  }

  public void collectRent(double collect)
  {
    tenant.setRentDue(getRentDue() - collect);
  }

  public String toString()
  {
    return tenant == null ? String.format("Adress: %s | No tenant", address) : String.format("Adress: %s | Monthly Rent: %.2f$ | %s", address, rent, tenant);
  }
}
