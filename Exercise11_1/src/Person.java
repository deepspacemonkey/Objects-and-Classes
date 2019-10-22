public class Person
{
  private String name;
  private String address;
  private MyDate birthday;
  private Brain brain;

  public Person(String name, String address, MyDate birthday)
  {
    this.name = name;
    this.address = address;
    this.birthday = birthday.copy();
    this.brain = new Brain();
  }

  public Person(String argName, MyDate argBirth)
  {
    name = argName;
    birthday = argBirth.copy();
    this.brain = new Brain();
  }

  public Person(MyDate argBirth)
  {
    name = "No Name";
    birthday = argBirth.copy();
    this.brain = new Brain();
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

  public String getAddress()
  {
    return address;
  }

  public void setAddress(String address)
  {
    this.address = address;
  }

  public int getAge()
  {
    return birthday.yearsBetween(MyDate.now());
  }

  public int getIQ()
  {
    return brain.getIQ();
  }

  public boolean isBrainDamaged()
  {
    return brain.isBrainDamaged();
  }

  public boolean doYouRemember(String topic)
  {
    return brain.recall(topic);
  }

  public void rememberThis(String topic)
  {
    if (!doYouRemember(topic))
      brain.remember(topic);
    else
      brain.refreshMemory(topic);
  }

  public String whatAreYouThinkingAbout()
  {
    return brain.recall();
  }

  public String toString()
  {
    return String.format("%s: %s", name, getBirthday());
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Person))
      return false;
    Person other = (Person) obj;
    return (name == other.getName() && birthday.equals(other.getBirthday()));

  }
}
