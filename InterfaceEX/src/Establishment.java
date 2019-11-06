import java.util.ArrayList;

public interface Establishment
{
  public String getName();
  public String getOpeningHours();
  public String getAddress();
  public ArrayList<Food> getMenu();
  public ArrayList<Beverage> getBeverages();
  public boolean isOpenAt(String openingHours);
  public ArrayList<Beverage> getAllAlcoholicBeverages();
}
