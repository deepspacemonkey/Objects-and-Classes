public class Time
{
  private int hour;
  private int minute;
  private int second;

  public Time(int hour, int minute, int second)
  {
    setTime(hour, minute, second);
  }

  public Time(int timeInSeconds)
  {
    second = timeInSeconds % 60;
    minute = timeInSeconds / 60;
    hour = minute / 60;
    minute = minute % 60;
  }

  public void setTime(int hour, int minute, int second)
  {
    this.hour = (hour > 0) ? hour : 0;
    this.minute = (minute > 0) ? Math.min(minute, 59) : 0;
    this.second = (second > 0) ? Math.min(second, 59) : 0;
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

  public boolean isBefore(Time time)
  {
    return getTimeInSeconds() < time.getTimeInSeconds();
  }

  public String toString()
  {
    return String.format("%02d:%02d:%02d", hour, minute, second);
  }
}
