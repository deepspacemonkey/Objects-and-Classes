import java.util.Objects;

public abstract class Toy
{
  private int suitableAge;

  public Toy(int suitableAge)
  {
    this.suitableAge = suitableAge;
  }

  public int getSuitableAge()
  {
    return suitableAge;
  }

  public String toString()
  {
    return String.format("Age: %d", suitableAge);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Toy))
      return false;
    Toy other = (Toy) obj;
    return suitableAge == other.suitableAge;
  }

  public abstract String play();
}
