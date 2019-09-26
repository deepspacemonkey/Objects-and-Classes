public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second)
  {
    this.hour = Math.abs(hour) % 24;
    this.minute = Math.abs(minute) % 60;
    this.second = Math.abs(second) % 60;
  }

  public Time(int timeInSeconds)
  {
    second = timeInSeconds % 60;
    minute = timeInSeconds / 60;
    hour = minute / 60;
    minute = minute % 60;
  }

  public int getHour()
  {
    return hour;
  }

  public int getMinute()
  {
    return minute;
  }

  public int getSecond()
  {
    return second;
  }

  public int getTimeInSeconds()
  {
    return (hour * 60 + minute) * 60 + second;
  }

  public String toString()
  {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
