public class Junior extends ClubMember
{
  private char gender;

  public Junior(String name, int age, char gender)
  {
    super(name, age);
    this.gender = gender;
  }

  public char getGender()
  {
    return gender;
  }

  public String toString()
  {
    return String.format("%s, %c", super.toString(), gender);
  }

  @Override public double getMembershipFee()
  {
    return gender == 'b' ? 400 : (gender == 'g' ? 300 : -1);
  }
}
