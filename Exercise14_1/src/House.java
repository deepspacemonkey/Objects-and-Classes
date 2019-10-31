public class House extends Home
{
  public double price;

  public House(String address, double price)
  {
    super(address);
    this.price = price;
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof House))
      return false;
    House other = (House) obj;
    return super.equals(other) && price == other.price;
  }

  public String getInfo()
  {
    return String.format("Address: %s | Price : %.2f$", getAddress(), price);
  }

  public String toString()
  {
    return getInfo();
  }
}
