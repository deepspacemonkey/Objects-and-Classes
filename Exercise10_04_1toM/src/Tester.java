public class Tester
{
  public static void main(String[] args)
  {
    GradeList gradeBook = new GradeList(5);
    gradeBook.addGrade(new Grade("MSE", 12));
    gradeBook.addGrade(new Grade("SSE", 7));
    gradeBook.addGrade(new Grade("SEP", 10));
    gradeBook.addGrade(new Grade("SDJ", 12));
    gradeBook.addGrade(new Grade("RWD", 3));
    gradeBook.addGrade(new Grade("RWD", 3));

    System.out.println(gradeBook);

    System.out.println(gradeBook.getAverage());
  }
}
