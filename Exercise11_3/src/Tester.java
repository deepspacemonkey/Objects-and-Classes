public class Tester
{
  public static void main(String[] args)
  {
    CD album = new CD("4x4=12");
    album.addTrack(new CDTrack("Some Chords", "deadmau5", new Time(0,7,24)));
    album.addTrack(new CDTrack("Sofi Needs a Ladder", "deadmau5", new Time(0,6,43)));
    album.addTrack(new CDTrack("A City in Florida", "deadmau5", new Time(0,5,40)));
    System.out.println(album);
  }
}
