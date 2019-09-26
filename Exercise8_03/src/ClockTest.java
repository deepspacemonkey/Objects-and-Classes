public class ClockTest
{
  public static void main(String[] args)
  {
    Clock time1 = new Clock(200);
    Clock time2 = new Clock(400);

    System.out.println(time1.equals(time2));
    System.out.println(time1.isBefore(time2));
    System.out.println(time1);
    System.out.println(time1.convertToSeconds());

    time1.set12HourFormat();
    time1.set(14, 30, 45);
    System.out.println(time1);
    /*
    Clock timer = new Clock(0);
    do
    {
      System.out.println(timer);
      timer.tic();
    } while (!timer.equals(new Clock(0)));
    System.out.println(timer);
     */

  }
}
