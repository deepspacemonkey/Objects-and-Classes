public class Lego extends Toy
{
  private int numberOfBricks;

  public Lego(int suitableAge, int numberOfBricks)
  {
    super(suitableAge);
    this.numberOfBricks = numberOfBricks;
  }

  public int getNumberOfBricks()
  {
    return numberOfBricks;
  }

  public String toString()
  {
    return String.format("%s | Number of blocks: %d", super.toString(), numberOfBricks);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Lego))
      return false;
    Lego other = (Lego) obj;
    return super.equals(other) && numberOfBricks == other.numberOfBricks;
  }

  public String play()
  {
    return "Build";
  }
}
