public class PriorityNote
{
  private String note;
  private boolean highPriority;

  public PriorityNote(String note)
  {
    this.note = note;
    highPriority = false;
  }

  public void setNote(String note)
  {
    this.note = note;
  }

  public String getNote()
  {
    return note;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setHighPriority()
  {
    highPriority = true;
  }

  public void setLowPriority()
  {
    highPriority = false;
  }

  public PriorityNote copy()
  {
    return new PriorityNote(note);
  }

  public String toString()
  {
    return String.format("%s: %s", highPriority ? "High Priority" : "Low Priority", note);
  }
}
