public class Elevator
{
  private int floor;
  private int capacity;
  private int maximumLoad;
  private int currentLoad;

  public Elevator(int floor, int capacity)
  {
    this.floor = floor;
    this.capacity = Math.abs(capacity);
    this.maximumLoad = capacity*75;
    this.currentLoad = 0;
  }

  public int getFloor()
  {
    return floor;
  }

  public int getCapacity()
  {
    return capacity;
  }

  public int getMaximumLoad()
  {
    return maximumLoad;
  }

  public int getCurrentLoad()
  {
    return currentLoad;
  }

  public void personEnter()
  {
    currentLoad += 75;
  }

  public void personEnter(int weight)
  {
    currentLoad += weight;
  }

  public void personExit()
  {
    currentLoad -= 75;
    if(currentLoad<0)
      currentLoad = 0;
  }

  public void personExit(int weight)
  {
    currentLoad -= weight;
    if(currentLoad<0)
      currentLoad = 0;
  }

  public boolean isAllowedToMove()
  {
    return currentLoad < maximumLoad;
  }

  public boolean moveToFloor(int floor)
  {
    if(isAllowedToMove())
      this.floor = floor;
    return isAllowedToMove();
  }

  public String toString()
  {
    return String.format("Floor %d, load %d", floor, currentLoad);
  }
}
