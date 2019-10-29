public class Student extends Person
{
  private int semester;
  private String programme;

  public Student(int ssn, String name, int semester, String programme)
  {
    super(ssn, name);
    this.semester = semester;
    this.programme = programme;
  }

  public String toString()
  {
    return String.format("%s | Programme: %s | Semester: %d", super.toString(), programme, semester);
  }
}
