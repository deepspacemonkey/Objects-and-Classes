import java.util.ArrayList;


public class CDTester
{

   public static void main(String[] args)
   {
      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS TIME STARTED TESTING");
      System.out.println("-------------------------------------------------------------");
      
      Time timeConstructorOneCorrect = new Time(5, 13, 54);
      boolean testConstructorOneCorrect = (timeConstructorOneCorrect != null && timeConstructorOneCorrect instanceof Time);
      System.out.println("TEST 01: First constructor returns a Time-object");
      System.out.println(test(testConstructorOneCorrect));

      boolean testGetSecond = timeConstructorOneCorrect.getSecond() == 54;
      System.out.println("TEST 02: Get method for seconds work");
      System.out.println(test(testGetSecond));
      
      boolean testGetMinute = timeConstructorOneCorrect.getMinute() == 13;
      System.out.println("TEST 03: Get method for minutes work");
      System.out.println(test(testGetMinute));
      
      boolean testGetHour = timeConstructorOneCorrect.getHour() == 5;
      System.out.println("TEST 04: Get method for hours work");
      System.out.println(test(testGetHour));
      
      Time inputTooHighTime = new Time(70, 60, 100);
      boolean testInputTooHighTime = inputTooHighTime.getHour() == 70 && inputTooHighTime.getMinute() == 59 && inputTooHighTime.getSecond() == 59;
      System.out.println("TEST 05: Illegal input that is too large is set to maximum value instead");
      System.out.println(test(testInputTooHighTime));
      
      Time inputTooLowTime = new Time(0, -15, -44);
      boolean testInputTooLowTime = inputTooLowTime.getHour() == 0 && inputTooLowTime.getMinute() == 0 && inputTooLowTime.getSecond() == 0;
      System.out.println("TEST 06: Illegal input that is too small is set to minimum value instead");
      System.out.println(test(testInputTooLowTime));

      Time timeConstructorTwoCorrect = new Time(654546546);
      boolean testConstructorTwoCorrect = timeConstructorTwoCorrect != null && timeConstructorTwoCorrect instanceof Time;
      System.out.println("TEST 07: Second constructor returns a Time-object");
      System.out.println(test(testConstructorTwoCorrect));
      
      Time severalHours = new Time(3600*11);
      Time sevaralMinutes = new Time(60*35);
      Time severalSeconds = new Time(47);  
      boolean testConstructorTwoConvertsCorrectly = severalHours.getHour() == 11 && sevaralMinutes.getMinute() == 35 && severalSeconds.getSecond() == 47;
      System.out.println("TEST 08: Second constructor converts seconds correctly");
      System.out.println(test(testConstructorTwoConvertsCorrectly));

      Time timeGetTimeInSecondsTime = new Time(181818, 29, 6);
      boolean testGetTimeInSeconds = timeGetTimeInSecondsTime.getTimeInSeconds() == 654546546;
      System.out.println("TEST 09: Get method getTimeInSeconds works correctly");
      System.out.println(test(testGetTimeInSeconds));
      
      Time timeSetMethodTime = new Time(22, 33, 44);
      timeSetMethodTime.setTime(33, 44, 55);
      boolean testSetMethodTime = timeSetMethodTime.getHour() == 33 && timeSetMethodTime.getMinute() == 44 && timeSetMethodTime.getSecond() == 55;
      System.out.println("TEST 10: Set method setTime works correctly");
      System.out.println(test(testSetMethodTime));
      
      timeSetMethodTime.setTime(99, -55, 600);
      boolean testSetMethodBonus = timeSetMethodTime.getHour() == 99 && timeSetMethodTime.getMinute() == 0 && timeSetMethodTime.getSecond() == 59;
      System.out.println("BONUS TEST: Set method setTime only accepts correct input");
      System.out.println(test(testSetMethodBonus));
      
      Time timeToStringMethod = new Time(4, -40, 400);
      String hour = timeToStringMethod.toString().split(":")[0];
      String minute = timeToStringMethod.toString().split(":")[1];
      String second = timeToStringMethod.toString().split(":")[2];
      boolean testToStringMethod = hour.equals("04") && minute.equals("00") && second.equals("59");
      System.out.println("TEST 11: Overridden method toString works correctly");
      System.out.println(test(testToStringMethod));

      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS TIME FINISHED TESTING");
      System.out.println("-------------------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS CDTRACK STARTED TESTING");
      System.out.println("-------------------------------------------------------------");
      
      Time shortTime = new Time(0,3,20);
      CDTrack trackConstructorCorrect = new CDTrack("TrackTitle", "TrackArtist",shortTime);
      boolean testTrackConstructorCorrect = trackConstructorCorrect != null && trackConstructorCorrect instanceof CDTrack;
      System.out.println("TEST 01: Constructor returns a CDTrack-object");
      System.out.println(test(testTrackConstructorCorrect));

      boolean testTrackGetTitle = trackConstructorCorrect.getTitle().equals("TrackTitle");
      System.out.println("TEST 02: Get method getTrack works correctly");
      System.out.println(test(testTrackGetTitle));
      
      boolean testTrackGetArtist = trackConstructorCorrect.getArtist().equals("TrackArtist");
      System.out.println("TEST 03: Get method getArtist works correctly");
      System.out.println(test(testTrackGetArtist));
      
      boolean testTrackGetLength = trackConstructorCorrect.getLength() != null && trackConstructorCorrect.getLength() instanceof Time;
      System.out.println("TEST 04: Get method getLength returns a Time-object");
      System.out.println(test(testTrackGetLength));
      
      CDTrack trackSetArtist = new CDTrack("TrackTitle", "TrackOriginalArtist", shortTime);
      trackSetArtist.setArtist("TrackNewArtist");
      boolean testTrackSetArtist = trackSetArtist.getArtist().equals("TrackNewArtist");
      System.out.println("TEST 05: Set method setArtist works correctly");
      System.out.println(test(testTrackSetArtist));
      
      Time timeTrackToString = new Time(0,3,45);
      CDTrack trackToString = new CDTrack("Track Title", "Track Artist", timeTrackToString);
      boolean testTrackToStringObject = trackToString.toString() != null && trackToString.toString() instanceof String;
      boolean testTrackToString = testTrackToStringObject && trackToString.toString().equals("Track Artist - Track Title (00:03:45)");
      System.out.println("TEST 06: Overridden method toString returns a correct String");
      System.out.println(test(testTrackToString));
      
      timeTrackToString.setTime(4, 4, 4);
      boolean testConstructorComposition = trackToString.toString().equals("Track Artist - Track Title (00:03:45)");
      System.out.println("TEST 07: Constructor assigns a copy of Time-object to length-field");
      System.out.println(test(testConstructorComposition));
      
      CDTrack trackGetLengthComposition = new CDTrack("Track Title", "Track Artist", new Time(0, 4, 40));
      Time timeGetLengthComposition = trackGetLengthComposition.getLength();
      timeGetLengthComposition.setTime(4, 4, 4);
      boolean testTrackGetLengthComposition = trackGetLengthComposition.getLength().getHour() == 0 && trackGetLengthComposition.getLength().getMinute() == 4 && trackGetLengthComposition.getLength().getSecond() == 40;
      System.out.println("TEST 08: Get method getLength returns a copy of the Time-object");
      System.out.println(test(testTrackGetLengthComposition));
      
      CDTrack trackCopyMethod = new CDTrack("TrackCopyTitle", "TrackCopyArtist", new Time(0, 3, 33));
      boolean testTrackCopyMethod = trackCopyMethod.copy() != null && trackCopyMethod.copy() instanceof CDTrack;
      System.out.println("TEST 09: Copy method returns a CDTrack-object");
      System.out.println(test(testTrackCopyMethod));
      
      CDTrack trackCopy = trackCopyMethod.copy();
      boolean testTrackCopyMethodCopy = trackCopy.getArtist().equals(trackCopyMethod.getArtist()) && trackCopy.getTitle().equals(trackCopyMethod.getTitle()) && trackCopy.getLength().toString().equals(trackCopyMethod.getLength().toString());
      System.out.println("TEST 10: Copy method returns a correct CDTrack-object");
      System.out.println(test(testTrackCopyMethodCopy));
      
      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS CDTRACK FINISHED TESTING");
      System.out.println("-------------------------------------------------------------");
      System.out.println();
      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS CD STARTED TESTING");
      System.out.println("-------------------------------------------------------------");
  
      CD cdConstructorCorrect = new CD("CD Title");
      boolean testCDConstructorCorrect = cdConstructorCorrect != null && cdConstructorCorrect instanceof CD;
      System.out.println("TEST 01: Constructor returns a CD-object");
      System.out.println(test(testCDConstructorCorrect));
      
      boolean testCDGetTitle = cdConstructorCorrect.getTitle().equals("CD Title");
      System.out.println("TEST 02: Get method getTitle works correctly");
      System.out.println(test(testCDGetTitle));

      boolean testCDDurationReturnType = cdConstructorCorrect.getDuration() != null && cdConstructorCorrect.getDuration() instanceof Time; 
      System.out.println("TEST 03: Get method getDuration returns a Time-object");
      System.out.println(test(testCDDurationReturnType));
      
      boolean testCDDurationForZero = cdConstructorCorrect.getDuration().getHour() == 0 && cdConstructorCorrect.getDuration().getMinute() == 0 && cdConstructorCorrect.getDuration().getSecond() == 0;
      System.out.println("TEST 04: Get method getDuration works correctly for empty lists");
      System.out.println(test(testCDDurationForZero));
      
      CDTrack trackTestAdd = new CDTrack("Track Title", "Track Artist", new Time(0,2,22));
      cdConstructorCorrect.addTrack(trackTestAdd);
      //If this crashes, then the addTrack method doesn't work correctly
      System.out.println("*********************************************************");
      System.out.println("THE FOLLOWING TESTS ASSUME THAT THE ADDTRACK METHOD WORKS");
      System.out.println("*********************************************************");
      System.out.println();
      
      CD cdTestDuration = new CD("CD Title");
      CDTrack trackTestDuration = new CDTrack("Track Title", "Track Artist", new Time(0,3,20));
      cdTestDuration.addTrack(trackTestDuration);
      cdTestDuration.addTrack(trackTestDuration);
      boolean testCDDuration = cdTestDuration.getDuration().toString().equals("00:06:40");
      System.out.println("TEST 05: Get method getDuration works correctly for multiple CDTracks in trackList");
      System.out.println(test(testCDDuration));
            
      CD cdTestGetTrack = new CD("CD Title");
      CDTrack trackTestGetTrack = new CDTrack("Track Title", "Track Artist", new Time(0,3,20));
      cdTestGetTrack.addTrack(trackTestGetTrack);
      boolean testGetTrack = cdTestGetTrack.getCDTrack(1) != null && cdTestGetTrack.getCDTrack(1) instanceof CDTrack;
      System.out.println("TEST 06: Get method getCDTrack returns a CDTrack object and uses correct numbering");
      System.out.println(test(testGetTrack));
      
      CD cdTestGetTrackComposition = new CD("CD Title");
      CDTrack trackTestGetTrackComposition = new CDTrack("Track Title", "Track Artist", new Time(0,3,20));
      cdTestGetTrackComposition.addTrack(trackTestGetTrackComposition);
      CDTrack trackFromGet = cdTestGetTrackComposition.getCDTrack(1);
      trackFromGet.setArtist("New Track Artist");
      boolean testGetTrackComposition = cdTestGetTrackComposition.getCDTrack(1).getArtist().equals("Track Artist");
      System.out.println("TEST 07: Get method getCDTrack returns a copy of the CDTrack object");
      System.out.println(test(testGetTrackComposition));
      
      CD cdTestToStringMethod = new CD("CD Title");
      CDTrack trackToStringTrack1 = new CDTrack("Track Title 1", "Track Artist 1", new Time(0,4,23));
      CDTrack trackToStringTrack2 = new CDTrack("Track Title 2", "Track Artist 2", new Time(0,5,31));
      cdTestToStringMethod.addTrack(trackToStringTrack1);
      cdTestToStringMethod.addTrack(trackToStringTrack2);
      boolean testCDToStringMethod = cdTestToStringMethod.toString().equals("CD Title\n00:09:54\nTrack Artist 1 - Track Title 1 (00:04:23)\nTrack Artist 2 - Track Title 2 (00:05:31)");
      System.out.println("TEST 08: Overriden method toString works correctly");
      System.out.println(test(testCDToStringMethod));
      
      CD cdTestAddComposition = new CD("CD Title");
      CDTrack trackTestAddComposition = new CDTrack("Track Title", "Track Artist", new Time(0,0,30));
      cdTestAddComposition.addTrack(trackTestAddComposition);
      trackTestAddComposition.setArtist("New Track Artist");
      boolean testCDAddComposition = cdTestAddComposition.toString().equals("CD Title\n00:00:30\nTrack Artist - Track Title (00:00:30)");
      System.out.println("TEST 09: Void method addTrack adds a copy of the CDTrack");
      System.out.println(test(testCDAddComposition));

      System.out.println("-------------------------------------------------------------");
      System.out.println("CLASS CD FINISHED TESTING");
      System.out.println("-------------------------------------------------------------");
      
      
   }
   
   public static String test(boolean b)
   {
      return b ? "PASS" + "\n" : "FAIL" + "\n";
   }

}
