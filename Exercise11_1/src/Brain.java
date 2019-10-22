public class Brain
{
  private String activeMemoryItem;
  private String passiveMemoryItemOne;
  private String passiveMemoryItemTwo;

  public Brain()
  {
    activeMemoryItem = "";
    passiveMemoryItemOne = "";
    passiveMemoryItemTwo = "";
  }

  public int getIQ()
  {
    if (activeMemoryItem.length() < 10 || activeMemoryItem == null
        || passiveMemoryItemOne.length() < 10 || passiveMemoryItemOne == null
        || passiveMemoryItemTwo.length() < 10 || passiveMemoryItemTwo == null)
    {
      return 70;
    }
    else if (activeMemoryItem.length() >= 10
        && passiveMemoryItemOne.length() >= 10
        && passiveMemoryItemTwo.length() >= 10)
    {
      if (activeMemoryItem.length() >= 20 || passiveMemoryItemOne.length() >= 20
          || passiveMemoryItemTwo.length() >= 20)
        return 130;
      return 100;
    }
    return 0;
  }

  public boolean isBrainDamaged()
  {
    if (activeMemoryItem == null || passiveMemoryItemOne == null
        || passiveMemoryItemTwo == null)
    {
      return true;
    }
    return false;
  }

  public void remember(String info)
  {
    passiveMemoryItemTwo = passiveMemoryItemOne;
    passiveMemoryItemOne = activeMemoryItem;
    activeMemoryItem = info;
  }

  public void refreshMemory(String info)
  {
    if(!info.equals(activeMemoryItem))
    {
      if(info.equals(passiveMemoryItemOne))
      {
        String aux = passiveMemoryItemOne;
        passiveMemoryItemOne = activeMemoryItem;
        activeMemoryItem = aux;
      } else if(info.equals(passiveMemoryItemTwo))
      {
        String aux = passiveMemoryItemTwo;
        passiveMemoryItemTwo = activeMemoryItem;
        activeMemoryItem = aux;
      }
    }
  }

  public boolean recall(String info)
  {
    if(info.equals(activeMemoryItem) || info.equals(passiveMemoryItemOne) || info.equals(passiveMemoryItemTwo))
      return true;
    return false;
  }

  public String recall()
  {
    return activeMemoryItem;
  }

  public String toString()
  {
    return String.format ("Active: %s\nPassive 1: %s\nPassive 2: %s", activeMemoryItem, passiveMemoryItemOne, passiveMemoryItemTwo);
  }

  public boolean equals(Object obj)
  {
    if(!(obj instanceof Brain))
      return false;
    Brain other = (Brain) obj;
    return activeMemoryItem.equals(other.activeMemoryItem) && passiveMemoryItemOne.equals(other.passiveMemoryItemOne) && passiveMemoryItemTwo.equals(other.passiveMemoryItemTwo);
  }
}
