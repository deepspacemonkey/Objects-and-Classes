public class Rectangle
{
  private double lenght;
  private double width;

  public Rectangle(double len, double wid)
  {
    lenght = len;
    width = wid;
  }

  public void setLenght(double len)
  {
    lenght = len;
  }

  public void setWidth(double wid)
  {
    width = wid;
  }

  public double getLenght()
  {
    return lenght;
  }

  public double getWidth()
  {
    return width;
  }

  public double getArea()
  {
    return width*lenght;
  }
}
