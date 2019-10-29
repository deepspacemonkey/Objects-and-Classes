public class Secretary extends Employee
{
  private String office;

  public Secretary(int ssn, String name, double salary, String office)
  {
    super(ssn, name, salary);
    this.office = office;
  }

  public String toString()
  {
    return String.format("%s | Office: %s", super.toString(), office);
  }
}
