public class StudentTest
{
  public static void main(String[] args)
  {
    Student student1 = new Student("Paul", 'M', 19);
    Student student2 = new Student("Michelle", 'F', 35);
    Student student3 = new Student("Alex", 'M', 23);

    System.out.println(student1.getName() + ", " + student1.getGender() + ", " + student1.getStudyNumber());
    System.out.println(student2.getName() + ", " + student2.getGender() + ", " + student2.getStudyNumber());
    student2.setName("Bongo");
    student2.setGender('M');
    student2.setStudyNumber(2589);
    System.out.println(student2.getName() + ", " + student2.getGender() + ", " + student2.getStudyNumber());
    System.out.println(student3.toString());
    System.out.println(student2.toString());
    System.out.println(student1.toString());
  }
}
