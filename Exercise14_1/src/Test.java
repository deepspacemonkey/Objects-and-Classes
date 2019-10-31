import java.util.ArrayList;

public class Test
{
  public static void main(String[] args)
  {
    ArrayList<Person> persons = new ArrayList<Person>();
    persons.add(new Person("Bob", new House("bob's street", 3000)));
    persons.add(new Person("Alice", new House("alice's street", 2000000)));
    persons.add(new Person("Bob", new House("bob's street", 3000)));

    System.out.println(persons.toString());
    System.out.println(persons.get(0).equals(persons.get(2)));
  }
}
