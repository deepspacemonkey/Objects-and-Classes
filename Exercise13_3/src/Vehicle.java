public class Vehicle
{
  private String owner;
  private double price;

  public Vehicle(String owner, double price)
  {
    this.owner = owner;
    this.price = price;
  }

  public String getOwner()
  {
    return owner;
  }

  public double getPrice()
  {
    return price;
  }

  public void setOwner(String owner)
  {
    this.owner = owner;
  }

  public void setPrice(double price)
  {
    this.price = price;
  }

  public String toString()
  {
    return String.format("Owner: %s | Price: %.2f$", owner, price);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Vehicle))
      return false;
    Vehicle other = (Vehicle) obj;
    return owner.equals(other.owner) && price == other.price;
  }
}
