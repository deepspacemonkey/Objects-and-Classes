public abstract class Ball extends Toy
{
  private int diameter;

  public Ball(int suitableAge, int diameter)
  {
    super(suitableAge);
    this.diameter = diameter;
  }

  public String toString()
  {
    return String.format("%s | Diameter: %d", super.toString(), diameter);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Ball))
      return false;
    Ball other = (Ball) obj;
    return super.equals(other) && diameter == other.diameter;
  }

  public int getDiameter()
  {
    return diameter;
  }
}
