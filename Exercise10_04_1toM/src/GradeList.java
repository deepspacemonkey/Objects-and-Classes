import java.util.ArrayList;

public class GradeList
{
  private ArrayList<Grade> grades;

  public GradeList(int numberOfGrades)
  {
    grades = new ArrayList<Grade>();
  }

  public int getNumberOfGrades()
  {
    return grades.size();
  }

  public ArrayList<Grade> getAllGrades()
  {
    return grades;
  }

  public void addGrade(Grade grade)
  {
    grades.add(grade);
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
