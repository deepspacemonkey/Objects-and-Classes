import java.util.ArrayList;

public class CD
{
  private String title;
  private ArrayList<CDTrack> trackList;

  public CD(String title)
  {
    this.title = title;
    this.trackList = new ArrayList<CDTrack>();
  }

  public void addTrack(CDTrack track)
  {
    trackList.add(track.copy());
  }

  public String getTitle()
  {
    return title;
  }

  public Time getDuration()
  {
    int seconds = 0;
    for(CDTrack track : trackList)
    {
      seconds += track.getLength().getTimeInSeconds();
    }
    return new Time(seconds);
  }

  public CDTrack getCDTrack(int trackNumber)
  {
    return trackList.get(trackNumber - 1).copy();
  }

  public String toString()
  {
    String output = title + "\n" + getDuration().toString() + "\n";
    for(CDTrack track : trackList)
      output += track.toString() + ((trackList.indexOf(track) == trackList.size()-1) ? "" : "\n");
    return output;
  }
}
