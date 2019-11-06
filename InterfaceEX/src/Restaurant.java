import java.util.ArrayList;

public class Restaurant implements Establishment
{
  private String name;
  private String openingHours;
  private String address;
  private ArrayList<Beverage> beverages;
  private ArrayList<Food> menu;

  public Restaurant(String name, String openingHours, String address)
  {
    this.name = name;
    this.openingHours = openingHours;
    this.address = address;
    beverages = new ArrayList<Beverage>();
    menu = new ArrayList<Food>();
  }

  public void addBeverage(Beverage beverage)
  {
    beverages.add(beverage);
  }

  public void addFood(Food food)
  {
    menu.add(food);
  }

  @Override public String getName()
  {
    return name;
  }

  @Override public String getOpeningHours()
  {
    return openingHours;
  }

  @Override public String getAddress()
  {
    return address;
  }

  @Override public ArrayList<Beverage> getBeverages()
  {
    return beverages;
  }

  public ArrayList<Food> getMenu()
  {
    return menu;
  }

  public boolean isOpenAt(String time)
  {
    return Integer.parseInt(time.substring(0,2)) >= Integer.parseInt(openingHours.substring(0,2));
  }

  @Override public ArrayList<Beverage> getAllAlcoholicBeverages()
  {
    ArrayList<Beverage> alcoholicBeverages = new ArrayList<Beverage>();
    for(Beverage beverage : beverages)
    {
      if (beverage.getAlcoholContent()>0.5)
        alcoholicBeverages.add(beverage);
    }
    return alcoholicBeverages;
  }
}
