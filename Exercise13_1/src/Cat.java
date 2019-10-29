public class Cat extends Animal
{

  private int numberOfLives;
  public Cat(int speed, String name)
  {
    super(speed, name);
    numberOfLives = 9;
  }

  @Override public String makeAnimalSound()
  {
    return "Meow!";
  }
}
