public class Job
{
  private String title;
  private double salary;
  private Person employee;

  public Job(String title, double salary, Person employee)
  {
    this.title = title;
    this.salary = salary;
    this.employee = employee;
  }

  public Job(String title, double salary)
  {
    this.title = title;
    this.salary = salary;
    this.employee = null;
  }

  public String getTitle()
  {
    return title;
  }

  public double getSalary()
  {
    return salary;
  }

  public Person getEmployee()
  {
    return employee;
  }

  public void setSalary(double salary)
  {
    this.salary = salary;
  }

  public boolean isAvailable()
  {
    return employee == null;
  }

  public void hire(Person employee)
  {
    if (isAvailable())
    {
      this.employee = employee;
    }
  }

  public void fire()
  {
    employee = null;
  }

  public String toString()
  {
    return String.format("%s, %s, %.2f", employee, title, salary);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Job))
      return false;
    Job other = (Job) obj;
    return other.getEmployee().equals(this.employee) && other.getSalary() == this.getSalary() && other.getTitle() == this.title;
  }
}
