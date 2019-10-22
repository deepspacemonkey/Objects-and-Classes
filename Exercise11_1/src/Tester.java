public class Tester
{
  public static void main(String[] args)
  {
    Person person1 = new Person("John", "New York", new MyDate(1,1,2000));
    System.out.println(person1);
    person1.rememberThis("this should be passive 2");
    person1.rememberThis("this should be passive 1");
    person1.rememberThis("this should be active");

    System.out.println(person1.doYouRemember("this should be passive 2"));
    System.out.println(person1.whatAreYouThinkingAbout());

    person1.rememberThis("this should be passive 1");
    System.out.println(person1.whatAreYouThinkingAbout());


    person1.rememberThis("this should be active");
    System.out.println(person1.whatAreYouThinkingAbout());
  }
}
