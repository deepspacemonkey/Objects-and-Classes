import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date
{
  private int day;
  private int month;
  private int year;

  public Date(int day, int month, int year)
  {
    set(day, month, year);
  }

  public Date()
  {
    Calendar now = GregorianCalendar.getInstance();
    day = now.get(Calendar.DAY_OF_MONTH);
    month = now.get(Calendar.MONTH) + 1;
    year = now.get(Calendar.YEAR);
  }

  public void set(int day, int month, int year)
  {
    if (year < 0)
      year = Math.abs(year);
    this.year = year;

    if (month < 1)
      month = 1;
    if (month > 12)
      month = 12;
    this.month = month;

    if (day < 1)
      day = 1;
    if (day > numberOfDaysInMonth(month))
    {
      day = numberOfDaysInMonth(month);
    }
    this.day = day;
  }

  public int numberOfDaysInMonth(int monthNumber)
  {
    int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    if (monthNumber < 1 || monthNumber > 12)
      return -1;
    else if (isLeapYear() && monthNumber == 2)
      return monthDays[1] + 1;
    else
      return monthDays[monthNumber - 1];
  }

  public boolean isLeapYear()
  {
    if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))
    {
      return true;
    }
    else
    {
      return false;
    }
  }

  public Date copy()
  {
    return new Date(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof Date))
      return false;
    Date otherDate = (Date) obj;
    return otherDate.day == this.day && otherDate.month == this.month
        && otherDate.year == this.year;
  }

  public String toString()
  {
    return day + "/" + ((month < 10) ? ("0" + month) : month) + "/" + year;
  }
}
