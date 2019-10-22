import java.util.ArrayList;

public class Notebook
{

  private ArrayList<PriorityNote> notes;

  public Notebook()
  {
    notes = new ArrayList<PriorityNote>();
  }

  public int getSize()
  {
    return notes.size();
  }

  public String getNote(int index)
  {
    return notes.get(index).toString();
  }

  public void addNote(PriorityNote note)
  {
      notes.add(note.copy());
  }

  public void addNote(String note)
  {
      notes.add(new PriorityNote(note));
  }

  public void addHighPriorityNote(String note)
  {
    notes.add(new PriorityNote(note));
    notes.get(notes.size()-1).setHighPriority();
  }

  public boolean isHighPriorityNote(int index)
  {
    return notes.get(index).isHighPriority();
  }

  public int indexOfMostImportantNote()
  {
    int indexCounter = 0;
    while(indexCounter < notes.size() && !isHighPriorityNote(indexCounter))
      indexCounter++;
    return indexCounter;
  }

  public String getMostImportantNote()
  {
    return notes.get(indexOfMostImportantNote()).toString();
  }

  public void removeNote(int index)
  {
    notes.remove(index);
  }

  public String toString()
  {
    String returner = "";
    for (PriorityNote note : notes)
      returner += note + "\n";
    return returner;
  }
}
