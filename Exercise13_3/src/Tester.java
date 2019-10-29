public class Tester
{
  public static void main(String[] args)
  {
    Bicycle bike1 = new Bicycle("Bob", 200, 5);
    Bicycle bike2 = new Bicycle("Bob", 200, 5);
    Vehicle vehicle1 = new Vehicle("Bob", 200);
    System.out.println(bike1.equals(bike2));
    System.out.println(bike1.equals(vehicle1));
  }
}
