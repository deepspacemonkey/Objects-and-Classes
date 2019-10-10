import java.util.ArrayList;

public class Bed
{
  private String type;

  public Bed(String type)
  {
    ArrayList<String> bedTypes = new ArrayList<String>();
    bedTypes.add("King size");
    bedTypes.add("Double");
    bedTypes.add("Single");
    if (bedTypes.contains(type))
      this.type = type;
    else
      System.out.println("Invalid type or typo");
  }

  public boolean isSingle()
  {
    return type.equals("Single");
  }

  public boolean isDouble()
  {
    return type.equals("Double");
  }

  public boolean isKingSize()
  {
    return type.equals("King size");
  }
}
