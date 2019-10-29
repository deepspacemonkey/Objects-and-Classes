public class SportsCar extends Car
{
  private int maxVelocity;

  public SportsCar(String owner, double price, String regNo, int maxVelocity)
  {
    super(owner, price, regNo);
    this.maxVelocity = maxVelocity;
  }

  public int getMaxVelocity()
  {
    return maxVelocity;
  }

  public String toString()
  {
    return String.format("%s | Top Speed: %d", super.toString(), maxVelocity);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Van))
      return false;
    Van other = (Van) obj;
    return super.equals(other) && maxVelocity == other.maxVelocity;
  }
}
