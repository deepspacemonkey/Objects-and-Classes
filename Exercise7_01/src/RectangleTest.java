public class RectangleTest
{
  public static void main(String[] args)
  {
    Rectangle r1 = new Rectangle(10, 10);
    System.out.println(r1.getLenght());
    System.out.println(r1.getWidth());
    System.out.println(r1.getArea());
    r1.setLenght(7);
    r1.setWidth(8);
    System.out.println(r1.getLenght());
    System.out.println(r1.getWidth());
    System.out.println(r1.getArea());
  }
}
