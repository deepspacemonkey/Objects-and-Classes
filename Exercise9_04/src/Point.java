public class Point
{
  private double x;
  private double y;

  public Point(double x, double y)
  {
    this.x = x;
    this.y = y;
  }

  public double getX()
  {
    return x;
  }

  public double getY()
  {
    return y;
  }

  public void moveTo(double newX, double newY)
  {
    this.x = newX;
    this.y = newY;
  }

  public void move(double xDistance, double yDistance)
  {
    x += xDistance;
    y += yDistance;
  }

  public String toString()
  {
    return String.format("(%f,%f)", x, y);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Point))
      return false;
    Point objPoint = (Point) obj;
    return objPoint.getX() == x && objPoint.getY() == y;
  }

  public Point copy()
  {
    return new Point(x, y);
  }
}
