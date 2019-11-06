public class Beverage
{

  private double alcoholContent;
  private String name;

  public Beverage(double alcoholContent, String name)
  {
    this.alcoholContent = alcoholContent;
    this.name = name;
  }

  public double getAlcoholContent()
  {
    return alcoholContent;
  }

  public String getName()
  {
    return name;
  }
}
