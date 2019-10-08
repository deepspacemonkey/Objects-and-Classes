public class Person
{
  private String name;
  private MyDate birthday;

  public Person(String argName, MyDate argBirth)
  {
    name = argName;
    birthday = argBirth.copy();
  }

  public Person(MyDate argBirth)
  {
    name = "No Name";
    birthday = argBirth.copy();
  }

  public void setName(String argName)
  {
    name = argName;
  }

  public String getName()
  {
    return name;
  }

  public MyDate getBirthday()
  {
    return birthday.copy();
  }

  public int getAge()
  {
    return birthday.yearsBetween(MyDate.now());
  }

  public String toString()
  {
    return String.format("%s: %s", name, getBirthday());
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Person))
      return false;
    Person other = (Person) obj;
    return (name == other.getName() && birthday.equals(other.getBirthday()));

  }
}
