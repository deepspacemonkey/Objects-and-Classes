public class JobTest
{
  public static void main(String[] args)
  {
    Person person1 = new Person("Paul", new MyDate(19,6,2000));
    Job job1 = new Job("Programmer", 2512.56, person1);

    Person person2 = new Person("Obama", new MyDate(1,1,1));
    Job job2 = new Job("President", 2345.98, person2);

    System.out.println(job1);
    System.out.println(job2);
    System.out.println(job1.equals(job2));

    job2.fire();
    System.out.println(job2);

    job2.setSalary(1);
    job2.hire(new Person("Trump", new MyDate(2,2,1980)));
    System.out.println(job2);
  }
}
