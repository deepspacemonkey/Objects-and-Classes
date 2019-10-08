public class LineTest
{
  public static void main(String[] args)
  {
    Line line = new Line(new Point(2,9), new Point(4, 13));
    System.out.println(line.getLength());
    System.out.println(line.getSlope());
    System.out.println(line.getYIntercept());
    System.out.println(line.getSlopeIntercept());
  }
}
