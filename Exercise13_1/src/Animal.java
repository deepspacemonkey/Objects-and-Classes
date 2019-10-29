public class Animal
{
  private int speed;
  private String name;
  protected int positionX;
  protected int positionY;

  public Animal(int speed, String name)
  {
    this.speed = speed;
    this.name = name;
    positionX = 0;
    positionY = 0;
  }

  public int getSpeed()
  {
    return speed;
  }

  public String getName()
  {
    return name;
  }

  public void setSpeed(int speed)
  {
    this.speed = speed;
  }

  public void setName(String name)
  {
    this.name = name;
  }

  public void moveTo(int posX, int posY)
  {
    positionX = posX;
    positionY = posY;
  }

  public String makeAnimalSound()
  {
    return "I don't have a sound!";
  }
}
