public class Person
{
  private String name;
  private String birthday;

  public Person(String argName, String argBirth)
  {
    name = argName;
    birthday = argBirth;
  }

  public Person(String argBirth)
  {
    name="No Name";
    birthday = argBirth;
  }

  public void setName(String argName)
  {
    name = argName;
  }

  public String getName()
  {
    return name;
  }

  public String getBirthday()
  {
    return birthday;
  }
}
