import java.util.ArrayList;

public class JobBase
{
  private ArrayList<Person> persons;

  public JobBase()
  {
    persons = new ArrayList<Person>();
  }

  public void add(Person person)
  {
    persons.add(person);
  }

  public void remove(int index)
  {
    persons.remove(index);
  }

  public String toString()
  {
    return persons.toString();
  }
}
