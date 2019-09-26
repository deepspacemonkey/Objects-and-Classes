public class Point
{
  private int x;
  private int y;

  public Point(int x, int y)
  {
    this.x = x;
    this.y = y;
  }

  public int getX()
  {
    return x;
  }

  public int getY()
  {
    return y;
  }

  public void moveTo(int newX, int newY)
  {
    this.x = newX;
    this.y = newY;
  }

  public void move(int xDistance, int yDistance)
  {
    x += xDistance;
    y += yDistance;
  }

  public String toString()
  {
    return String.format("(%d,%d)", x, y);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Point))
      return false;
    Point objPoint = (Point) obj;
    return objPoint.getX() == x && objPoint.getY() == y;
  }
}
