public class Tester
{
  public static void main(String[] args)
  {
    JobBase jobs = new JobBase();
    jobs.add(new Person(1234, "bob"));
    jobs.add(new Person(4321, "alice"));
    jobs.add(new Person(1479, "lucifer"));
    jobs.add(new Person(9741, "judas"));
    System.out.println(jobs);
  }
}
