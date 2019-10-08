public class PointTest
{
  public static void main(String[] args)
  {
    Point position = new Point(1, 2);
    System.out.println(position);

    position.moveTo(2, 4);
    System.out.println(position);

    position.move(5, 5);
    System.out.println(position);

    Point otherPos = new Point(7, 8);
    System.out.println(position.equals(otherPos));
  }
}
