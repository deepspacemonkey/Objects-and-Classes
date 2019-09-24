public class MyDateTest
{
  public static void main(String[] args)
  {
    MyDate date = new MyDate(19, 6, 2000);
    System.out.println(date);
    date.set(12,12,2012);
    System.out.println(date);
  }
}
