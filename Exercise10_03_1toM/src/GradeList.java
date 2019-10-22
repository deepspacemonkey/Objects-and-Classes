public class GradeList
{
  private Grade[] grades;

  public GradeList(int numberOfGrades)
  {
    grades = new Grade[numberOfGrades];
  }

  public int getNumberOfGrades()
  {
    return grades.length;
  }

  public Grade getGrade(int index)
  {
    return grades[index];
  }

  public void setGrade(Grade grade, int index)
  {
    if(index < grades.length)
    this.grades[index] = grade;
  }

  public double getAverage()
  {
    int gradeSum = 0;
    for(Grade grade : grades)
    {
      gradeSum += grade.getGrade();
    }
    return (double) gradeSum / getNumberOfGrades();
  }

  public String toString()
  {
    String output = "";
    for (Grade grade: grades)
    {
      output += (grade + "\n");
    }
    return output;
  }
}
