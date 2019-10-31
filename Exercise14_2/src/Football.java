public class Football extends Ball
{
  public Football(int suitableAge, int diameter)
  {
    super(suitableAge, diameter);
  }

  public String toString()
  {
    return String.format("%s", super.toString());
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Football))
      return false;
    Football other = (Football) obj;
    return super.equals(other);
  }

  public String play()
  {
    return "Kick";
  }
}
