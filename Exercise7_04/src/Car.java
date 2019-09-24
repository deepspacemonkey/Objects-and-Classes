public class Car
{
  private String color;
  private String owner;
  private String registration;

  public Car(String argColor, String argOwner, String argRegistration)
  {
    color = argColor;
    owner = argOwner;
    registration = argRegistration;
  }

  public void setColor(String argColor)
  {
    color = argColor;
  }

  public void setOwner(String argOwner)
  {
    owner = argOwner;
  }

  public void setRegistration(String argRegistration)
  {
    registration = argRegistration;
  }

  public String getColor()
  {
    return color;
  }

  public String getOwner()
  {
    return owner;
  }

  public String getRegistration()
  {
    return registration;
  }
}
