import java.util.ArrayList;

public class Tester
{
  public static void main(String[] args)
  {
    ArrayList<ClubMember> members = new ArrayList<ClubMember>();

    members.add(new Junior("Bob", 5, 'b'));
    members.add(new Junior("Alice", 4, 'g'));
    members.add(new Senior("John", 60));
    members.add(new OldBoys("Big Bob", 17, 7));

    System.out.println(members);
  }
}
