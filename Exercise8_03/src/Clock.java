public class Clock
{
  private int hour;
  private int minute;
  private int second;

  private boolean is24HourFormat = true;

  public Clock(int hour, int minute, int second)
  {
    set(hour, minute, second);
  }

  public Clock(int totalSeconds)
  {
    second = totalSeconds % 60;
    minute = totalSeconds / 60;
    hour = minute / 60;
    minute = minute % 60;
  }

  public void set(int hour, int minute, int second)
  {
    this.hour = Math.abs(hour) % 24;
    this.minute = Math.abs(minute) % 60;
    this.second = Math.abs(second) % 60;
  }

  public void set24HourFormat()
  {
    is24HourFormat = true;
  }

  public void set12HourFormat()
  {
    is24HourFormat = false;
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

  public boolean is24HourFormat()
  {
    return is24HourFormat;
  }

  public void tic()
  {
    second++;
    if (second == 60)
    {
      second = 0;
      minute++;
    }
    if (minute == 60)
    {
      minute = 0;
      hour++;
    }
    if (hour == 24)
      hour = 0;
  }

  public int convertToSeconds()
  {
    return (hour * 60 + minute) * 60 + second;
  }

  public boolean isBefore(Clock time)
  {
    return convertToSeconds() < time.convertToSeconds();
  }

  public Clock copy()
  {
    return new Clock(hour, minute, second);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Clock))
      return false;
    Clock newTime = (Clock) obj;
    return newTime.getHour() == hour && newTime.getMinute() == minute
        && newTime.getSecond() == second;
  }

  public String toString()
  {
    return String
        .format("%02d:%02d:%02d %s", is24HourFormat ? hour : hour % 13, minute,
            second, is24HourFormat ? "" : (hour < 12 ? "AM" : "PM"));
  }
}
