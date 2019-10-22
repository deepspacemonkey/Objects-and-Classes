public class Tester
{
  public static void main(String[] args)
  {
    GradeList gradeBook = new GradeList(5);
    gradeBook.setGrade(new Grade("MSE", 12), 0);
    gradeBook.setGrade(new Grade("SSE", 7), 1);
    gradeBook.setGrade(new Grade("SEP", 10), 2);
    gradeBook.setGrade(new Grade("SDJ", 12), 3);
    gradeBook.setGrade(new Grade("RWD", 3), 4);
    gradeBook.setGrade(new Grade("RWD", 3), 6);

    System.out.println(gradeBook);

    System.out.println(gradeBook.getAverage());
  }
}
