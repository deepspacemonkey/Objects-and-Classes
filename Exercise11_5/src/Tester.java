public class Tester
{
  public static void main(String[] args)
  {
    ApartmentComplex block = new ApartmentComplex("Bungalow St.");
    block.add(new Apartment(101));
    block.add(new Apartment(102));
    block.getApartment(1).rentTo(new Tenant("Bob"), new MyDate());
    block.add(new Apartment(103));
    block.add(new Apartment(104));
    System.out.println(block);
  }
}
