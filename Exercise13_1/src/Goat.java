public class Goat extends Animal
{
  private boolean isFree;

  public Goat(int speed, String name, boolean isFree)
  {
    super(speed, name);
    this.isFree = isFree;
  }

  @Override public String makeAnimalSound()
  {
    return isFree ? "Rampage!" : "Baah!";
  }
}
