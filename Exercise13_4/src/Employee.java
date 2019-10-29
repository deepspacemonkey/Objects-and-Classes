public class Employee extends Person
{
  private double salary;

  public Employee(int ssn, String name, double salary)
  {
    super(ssn, name);
    this.salary = salary;
  }

  public String tostring()
  {
    return String.format("%s | Salary: %.2f$", super.toString(), salary);
  }
}
