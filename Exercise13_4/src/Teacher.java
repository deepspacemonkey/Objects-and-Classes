public class Teacher extends Employee
{
  private String course;

  public Teacher(int ssn, String name, double salary, String course)
  {
    super(ssn, name, salary);
    this.course = course;
  }

  public String toString()
  {
    return String.format("%s | Course: %s", super.toString(), course);
  }
}
