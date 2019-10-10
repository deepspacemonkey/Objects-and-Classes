public class Tester
{
  public static void main(String[] args)
  {
    Apartment ap = new Apartment("Ostervej", 2500);
    ap.rentTo("Bob", "12345678");
    System.out.println(ap);
    ap.chargeRent();
    ap.chargeRent();
    System.out.println(ap);
    ap.collectRent(3000);
    System.out.println(ap);
    ap.rentTo("John", "87654321");
    System.out.println(ap);
    ap.evict();
    System.out.println(ap);
    ap.rentTo("John", "87654321");
    System.out.println(ap);
  }
}
