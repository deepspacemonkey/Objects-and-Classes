public class Person
{
  private int ssn;
  private String name;

  public Person(int ssn, String name)
  {
    this.ssn = ssn;
    this.name = name;
  }

  public int getSsn()
  {
    return ssn;
  }

  public String getName()
  {
    return name;
  }

  public String toString()
  {
    return String.format("Name: %s | SSN: %d", name, ssn);
  }
}