public class CircleTest
{
  public static void main(String[] args)
  {
    Circle round = new Circle(5, new Point(1,1));
    System.out.println(round);

    round.moveTo(new Point(5,5));
    System.out.println(round);

    System.out.println(round.getArea());
  }
}
