public class Dog extends Animal
{
  private int dailyWalks;
  private int walkLimit;

  public Dog(int speed, String name, int walkLimit)
  {
    super(speed, name);
    this.walkLimit = walkLimit;
  }

  @Override public String makeAnimalSound()
  {
    return "Woof!";
  }

  public void walk()
  {
    if(dailyWalks < walkLimit)
    {
      moveTo(super.positionX + getSpeed(), super.positionY + getSpeed());
      dailyWalks++;
    }
  }
}


