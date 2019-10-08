public class PersonTest
{
  public static void main(String[] args)
  {
    String who = "Bob";
    MyDate date = new MyDate(28, 10, 1989);

    String who2 = "Bob";
    MyDate date2 = new MyDate(28, 9, 1989);

    Person person1 = new Person(who, date);
    Person person2 = new Person(who2, date2);

    person1.getBirthday().set(1, 1, 1990);

    System.out.println(person1);
    System.out.println(MyDate.now());
    System.out.println(person1.getAge());
    System.out.println(person1.equals(person2));
  }
}
