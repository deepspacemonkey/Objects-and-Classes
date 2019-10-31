public class OldBoys extends ClubMember
{
  private int yearsOfMembership;

  public OldBoys(String name, int age, int yearsOfMembership)
  {
    super(name, age);
    this.yearsOfMembership = yearsOfMembership;
  }

  public int getYearsOfMembership()
  {
    return yearsOfMembership;
  }

  public void setYearsOfMembership(int yearsOfMembership)
  {
    this.yearsOfMembership = yearsOfMembership;
  }

  public String toString()
  {
    return String.format("%s, Member for %d years", super.toString(), yearsOfMembership);
  }

  @Override public double getMembershipFee()
  {
    return yearsOfMembership < 5 ? 300 : (yearsOfMembership <= 9 ? 200 : 300);
  }
}
