public class Line
{
  private String colour;
  private Point pointA;
  private Point pointB;

  public Line(Point pointA, Point pointB, String colour)
  {
    this.colour = colour;
    this.pointA = pointA;
    this.pointB = pointB;
  }

  public Line(Point pointA, Point pointB)
  {
    this.pointA = pointA;
    this.pointB = pointB;
    colour = "black";
  }

  public String getColour()
  {
    return colour;
  }

  public Point getPointA()
  {
    return pointA;
  }

  public Point getPointB()
  {
    return pointB;
  }

  public double getLength()
  {
    return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + Math
        .pow(pointA.getY() - pointB.getY(), 2));
  }

  public double getSlope()
  {
    return (pointB.getY()-pointA.getY())/(pointB.getX()-pointA.getX());
  }

  public double getYIntercept(){
    return pointA.getY() - getSlope()*pointA.getX();
  }

  public String getSlopeIntercept()
  {
    return String.format("y = %.3fx + %.3f", getSlope(), getYIntercept());
  }

  public void setColour(String colour)
  {
    this.colour = colour;
  }

  public void setPointA(Point pointA)
  {
    this.pointA = pointA;
  }

  public void setPointB(Point pointB)
  {
    this.pointB = pointB;
  }

  public String toString()
  {
    return String.format("A %s line from %s to %s with length of %f", colour, pointA, pointB, getLength());
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Line))
      return false;
    Line other = (Line) obj;
    return pointA.equals(other.getPointA()) && pointB.equals(other.getPointB()) && colour == other.getColour();
  }
}
