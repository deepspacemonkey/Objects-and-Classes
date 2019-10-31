import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    ArrayList<Toy> toys = new ArrayList<Toy>();
    toys.add(new Lego(3, 500));
    toys.add(new Football(5, 50));
    toys.add(new Handball(3, 40));
    System.out.println(toys);
    for(Toy toy : toys)
    {
      System.out.println(toy.play());
    }
  }
}
