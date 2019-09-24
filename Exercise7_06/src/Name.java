public class Name
{
  private String firstName;
  private String lastName;

  public Name(String firstName, String lastName)
  {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Name(String fullName)
  {
    firstName = fullName.substring(0, fullName.indexOf(' '));
    lastName = fullName.substring(fullName.indexOf(' ')+1, fullName.length());
  }

  public String getFirstName()
  {
    return firstName;
  }

  public String getLastName()
  {
    return lastName;
  }

  public String getFullName()
  {
    return firstName + " " + lastName;
  }

  public String getFormalName()
  {
    return lastName + ", " + firstName;
  }

  public String toString()
  {
    return getFullName();
  }
}
