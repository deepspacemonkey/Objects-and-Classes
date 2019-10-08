public class Circle
{
  private double radius;
  private Point centerPoint;

  public Circle(double radius, Point centerPoint)
  {
    this.radius = radius;
    this.centerPoint = centerPoint.copy();
  }

  public double getRadius()
  {
    return radius;
  }

  public Point getCenterPoint()
  {
    return centerPoint.copy();
  }

  public double getArea()
  {
    return Math.PI * Math.pow(radius, 2);
  }

  public void moveTo(Point centerPoint)
  {
    this.centerPoint = centerPoint.copy();
  }

  public String toString()
  {
    return String.format("Radius: %f, center point: %s", radius, centerPoint);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Circle))
      return false;
    Circle other = (Circle) obj;
    return centerPoint.equals(other.getCenterPoint()) && radius == other.getRadius();
  }
}
