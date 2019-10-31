public class Handball extends Ball
{
  public Handball(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }

  public String toString()
  {
    return String.format("%s", super.toString());
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Handball))
      return false;
    Handball other = (Handball) obj;
    return super.equals(other);
  }

  public String play()
  {
    return "Throw";
  }
}
