import java.util.ArrayList;

public class Notebook
{
  private int numberOfNotes;
  private Note[] notes;

  public Notebook(int maxNumberOfNotes)
  {
    numberOfNotes = 0;
    notes = new Note[maxNumberOfNotes];
  }

  public int getNumberOfNotes()
  {
    return numberOfNotes;
  }

  public Note getNote(int index)
  {
    return notes[index].copy();
  }

  public String getMessage(int index)
  {
    return String.format("Note %d: %s", index, notes[index].getMessage());
  }

  public void addNote(Note note)
  {
    if (numberOfNotes < notes.length)
    {
      notes[numberOfNotes] = note.copy();
      numberOfNotes++;
    }
  }

  public void addNote(String message)
  {
    if (numberOfNotes < notes.length)
    {
      notes[numberOfNotes] = new Note(message);
      numberOfNotes++;
    }
  }

  public void addHighPriorityNote(String message)
  {
    if (numberOfNotes < notes.length)
    {
      notes[numberOfNotes] = new Note(message);
      notes[numberOfNotes].setToHighPriority();
      numberOfNotes++;
    }
  }

  public void removeNote(int index)
  {
    for (int i = index; i < numberOfNotes - 1; i++)
    {
      notes[i] = notes[i + 1];
    }
    notes[numberOfNotes - 1] = null;
    numberOfNotes--;
  }

  public Note[] getAllNotes()
  {
    return notes;
  }

  public int getNumberOfHighPriorityNotes()
  {
    int counter = 0;
    for (int i = 0; i < numberOfNotes; i++)
      if (notes[i].isHighPriority())
        counter++;
    return counter;
  }

  public Note[] getAllHighPriorityNotes()
  {
    int numberOfNotes = getNumberOfHighPriorityNotes();
    Note[] highPriorityNotes = new Note[numberOfNotes];
    int counter = 0;
    for (int i = 0; i < numberOfNotes; i++)
      if (notes[i].isHighPriority())
        highPriorityNotes[counter] = notes[i].copy();
    return highPriorityNotes;
  }

  public String toString()
  {
    String returner = "";
    for (int i = 0; i < numberOfNotes; i++)
      returner += notes[i] + "\n";
    return returner;
  }
}
