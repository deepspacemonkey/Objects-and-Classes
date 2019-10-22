public class Tester
{
  public static void main(String[] args)
  {
    Car myCar = new Car("AA12345", 0);
    myCar.drive(2000);
    myCar.service();
    myCar.drive(5000);
    myCar.service();
    myCar.drive(28000);
    myCar.service();
    System.out.println(myCar);
  }
}
