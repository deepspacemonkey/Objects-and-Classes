public class Note
{
  private String message;
  private boolean highPriority;

  public Note(String message)
  {
    this.message = message;
  }

  public void setMessage(String message)
  {
    this.message = message;
  }

  public String getMessage()
  {
    return message;
  }

  public boolean isHighPriority()
  {
    return highPriority;
  }

  public void setToHighPriority()
  {
    highPriority = true;
  }

  public void setToLowPriority()
  {
    highPriority = false;
  }

  public Note copy()
  {
    return new Note(message);
  }

  public String toString()
  {
    return String.format("%s: %s", highPriority ? "High Priority" : "Low Priority", message);
  }
}
