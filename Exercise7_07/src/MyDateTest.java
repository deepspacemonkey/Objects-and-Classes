public class MyDateTest
{
  public static void main(String[] args)
  {
    System.out.println("\nConstructor and set");
    MyDate date = new MyDate(1,2,2013);
    System.out.println(date); //toString called auto

    System.out.println("\nNumber of days in month");
    date.set(27,2,2016);
    System.out.println(date);
    System.out.println(date.numberOfDaysInMonth(date.getMonth()));

    System.out.println("\nYears Between");
    MyDate testDate = new MyDate(28,02,2020);
    System.out.println(date.yearsBetween(testDate));

    System.out.println("\nCopy");
    System.out.println(date.copy());

    System.out.println("\nEquals");
    System.out.println(date.equals(date.copy()));

    System.out.println("\nTo Month Number");
    System.out.println(MyDate.convertToMonthNumber("June"));

    System.out.println("\nNow");
    System.out.println(MyDate.now());
  }
}
