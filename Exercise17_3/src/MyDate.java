import java.io.Serializable;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyDate implements Serializable
{
  private int day;
  private int month;
  private int year;

  public static final String[] STARSIGNS = { "Capricorn", "Aquarius", "Pisces", "Aries",
      "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio",
      "Sagittarius" };

  public MyDate(int day, int month, int year)
  {
    set(day, month, year);
  }

  public MyDate()
  {
    Calendar now = GregorianCalendar.getInstance();
    this.day = now.get(Calendar.DAY_OF_MONTH);
    this.month = now.get(Calendar.MONTH) + 1;
    this.year = now.get(Calendar.YEAR);
  }

  public static MyDate now()
  {
    return new MyDate();
  }

  public void set(int day, int month, int year)
  {
    if (year < 0)
    {
      year = -year;
    }
    this.year = year;

    if (month < 1)
    {
      month = 1;
    }
    if (month > 12)
    {
      month = 12;
    }
    this.month = month;

    if (day < 1)
    {
      day = 1;
    }
    if (day > numberOfDaysInMonth())
    {
      day = numberOfDaysInMonth();
    }
    this.day = day;
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

  public String getMonthName()
  {
    switch (month)
    {
      case 1:
        return "January";
      case 2:
        return "February";
      case 3:
        return "March";
      case 4:
        return "April";
      case 5:
        return "May";
      case 6:
        return "June";
      case 7:
        return "July";
      case 8:
        return "August";
      case 9:
        return "September";
      case 10:
        return "October";
      case 11:
        return "November";
      case 12:
        return "December";
      default:
        return "Wrong month";
    }
  }

  public boolean isLeapYear()
  {
    return (year % 4 == 0 && ((year % 100 != 0) || (year % 400 == 0)));
  }

  public void stepForwardOneDay()
  {
    day++;
    if (day > numberOfDaysInMonth())
    {
      day = 1;
      month++;
      if (month > 12)
      {
        month = 1;
        year++;
      }
    }
  }

  public void stepForward(int days)
  {
    for (int i = 0; i < days; i++)
    {
      stepForwardOneDay();
    }
  }

  public int numberOfDaysInMonth()
  {
    switch (month)
    {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        if (isLeapYear())
        {
          return 29;
        }
        else
        {
          return 28;
        }
      default:
        return 31;
    }
  }

  public int yearsBetween(MyDate other)
  {
    if(this.year == other.year)
      return 0;
    return this.isBefore(other) ? other.year - this.year : this.year - other.year;
  }

  public int daysBetween(MyDate other)
  {
    int days = 0;

    MyDate counterDate, endDate;

    if (this.isBefore(other))
    {
      counterDate = this.copy();
      endDate = other;
    }
    else
    {
      counterDate = other.copy();
      endDate = this;
    }

    while (!counterDate.equals(endDate))
    {
      days++;
      counterDate.stepForwardOneDay();
    }
    return days;
  }

  public boolean isBefore(MyDate other)
  {
    if(other.year > this.year)
      return false;
    else if(other.year < this.year)
      return true;
    else
    {
      if(this.month > other.month)
        return false;
      else if(other.month < this.month)
        return true;
      else
      {
        if(this.day > other.day)
          return false;
        else if(other.day < this.day)
          return true;
        else
          return false; //if the dates are equal, isBefore returns false.
      }
    }
  }

  public String starsignElement()
  {
    switch(starsign())
    {
      case "Capricorn" : case "Taurus" : case "Virgo" : return "Earth";
      case "Aquarius" : case "Gemini" : case "Libra" : return "Air";
      case "Pisces" : case "Cancer" : case "Scorpio" : return "Water";
      case "Aries" : case "Leo" : case "Sagittarius" : return "Fire";
      default: return "????";
    }
  }

  public String starsign()
  {
    switch (month)
    {
      case 1:
        if (day < 20)
          return STARSIGNS[0];
        else
          return STARSIGNS[1];
      case 2:
        if (day < 19)
          return STARSIGNS[1];
        else
          return STARSIGNS[2];
      case 3:
        if (day < 21)
          return STARSIGNS[2];
        else
          return STARSIGNS[3];
      case 4:
        if (day < 20)
          return STARSIGNS[3];
        else
          return STARSIGNS[4];
      case 5:
        if (day < 21)
          return STARSIGNS[4];
        else
          return STARSIGNS[5];
      case 6:
        if (day < 21)
          return STARSIGNS[5];
        else
          return STARSIGNS[6];
      case 7:
        if (day < 23)
          return STARSIGNS[6];
        else
          return STARSIGNS[7];
      case 8:
        if (day < 23)
          return STARSIGNS[7];
        else
          return STARSIGNS[8];
      case 9:
        if (day < 23)
          return STARSIGNS[8];
        else
          return STARSIGNS[9];
      case 10:
        if (day < 23)
          return STARSIGNS[9];
        else
          return STARSIGNS[10];
      case 11:
        if (day < 22)
          return STARSIGNS[10];
        else
          return STARSIGNS[11];
      case 12:
        if (day < 22)
          return STARSIGNS[11];
        else
          return STARSIGNS[0];
      default:
        return "????";
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

    MyDate other = (MyDate) obj;

    return day == other.day && month == other.month && year == other.year;
  }

  public String toString()
  {
    String s = "";
    if (day < 10)
    {
      s += "0";
    }
    s += day + "/";
    if (month < 10)
    {
      s += "0";
    }
    s += month + "/" + year;

    return s;
  }

}
