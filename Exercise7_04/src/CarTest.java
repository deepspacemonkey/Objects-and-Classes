public class CarTest
{
  public static void main(String[] args)
  {
    Car car = new Car("Red", "Leclerc", "tifosi1");
    System.out.println(car.getColor());
    System.out.println(car.getOwner());
    System.out.println(car.getRegistration());
    car.setOwner("Vettel");
    System.out.println(car.getOwner());
  }
}
