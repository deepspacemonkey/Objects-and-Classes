import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate
{
  private int day;
  private int month;
  private int year;

  private String[] months = {"January", "February", "March", "April", "May",
      "June", "July", "August", "September", "October", "November", "December"};
  private int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }

  public MyDate()
  {
    Calendar now = GregorianCalendar.getInstance();
    day = now.get(Calendar.DAY_OF_MONTH);
    month = now.get(Calendar.MONTH) + 1;
    year = now.get(Calendar.YEAR);
  }

  public int getDay()
  {
    return day;
  }

  public int getMonth()
  {
    return month;
  }

  public int getYear()
  {
    return year;
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

  public void stepForwardOneDay()
  {
    if (day == monthDays[month - 1] && (month != 2 || !isLeapYear()))
    {
      if (month == 12)
      {
        month = 1;
        day = 1;
        year++;
      }
      else
      {
        month++;
        day = 1;
      }
    }
    else if (month == 2 && isLeapYear())
    {
      if (day < 29)
        day++;
      else
      {
        day = 1;
        month++;
      }
    }
    else
    {
      day++;
    }
  }

  public void stepForward(int days)
  {
    for (int i = days; i > 0; i--)
    {
      stepForwardOneDay();
    }
  }

  public int numberOfDaysInMonth(int monthNumber)
  {
    if (monthNumber < 1 || monthNumber > 12)
      return -1;
    else if (isLeapYear() && monthNumber == 2)
      return monthDays[1] + 1;
    else
      return monthDays[monthNumber - 1];
  }

  /* old yearsBetween, did work but accuracy is uncertain
  public int yearsBetween(MyDate other)
  {
    double date1 = (double) (year + month / 12 + day / numberOfDaysInMonth(
        month)); //maths
    double date2 = (double) (other.getYear() + other.getMonth() / 12
        + other.getDay() / numberOfDaysInMonth(other.getMonth())); //more maths
    return Math.abs((int) ((date1 - date2) + 1));
  }
  */

  //uses daysBetween
  public int yearsBetween(MyDate other)
  {
    return daysBetween(other) / 365;
  }

  public int daysBetween(MyDate other)
  {
    MyDate currentDate = new MyDate(day, month, year);
    MyDate aux = other.copy();
    MyDate theOther = other.copy();

    if (currentDate.isBefore(other))
    {
      theOther = currentDate;
      currentDate = aux;
    }
    aux = null; //will be collected by garbage collector

    int dayCount = 0;
    while (theOther.isBefore(currentDate))
    {
      theOther.stepForwardOneDay();
      dayCount++;
    }

    return dayCount;
  }

  public boolean isBefore(MyDate other)
  {
    if (other.getYear() > this.year)
    {
      return true;
    }
    else if (other.getYear() == this.year)
    {
      if (other.getMonth() > this.month)
      {
        return true;
      }
      else if (other.getMonth() == this.month)
      {
        if (other.getDay() > this.day)
        {
          return true;
        }
        else
        {
          return false;
        }
      }
      else
      {
        return false;
      }
    }
    else
    {
      return false;
    }
  }

  public MyDate copy()
  {
    return new MyDate(day, month, year);
  }

  public boolean equals(Object obj)
  {
    if (!(obj instanceof MyDate))
      return false;
    MyDate otherDate = (MyDate) obj;
    return otherDate.day == this.day && otherDate.month == this.month
        && otherDate.year == this.year;
  }

  public String toString()
  {
    return day + "/" + ((month < 10) ? ("0" + month) : month) + "/" + year;
  }

  public String getMonthName()
  {
    return months[month - 1];
  }

  //creates new instance with date (irrelevant) and goes trough every month to compare using getMonthName + months array
  public static int convertToMonthNumber(String monthName)
  {
    MyDate date = new MyDate();
    for (int i = 0; i < 12; i++)
    {
      date.set(0, i + 1, 0);
      if (monthName.equals(date.getMonthName()))
      {
        return i + 1;
      }
    }
    return -1;
  }

  public static MyDate now()
  {
    return new MyDate();
  }
}
