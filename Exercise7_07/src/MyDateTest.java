public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(29, 10, 2001);
    System.out.println(date);

    MyDate date2 = new MyDate(6,12,2006);
    System.out.println(date2);

    date2 = date.copy();
    System.out.println(date2);



    /*
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);

    date.set(30,12,2016);
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);

    date.set(27,2,2019);
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);
    date.stepForwardOneDay();
    System.out.println(date);
    */
  }
}
