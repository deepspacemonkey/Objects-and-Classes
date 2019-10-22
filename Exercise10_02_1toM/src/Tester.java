public class Tester
{
  public static void main(String[] args)
  {
    Notebook myNotebook = new Notebook();
    myNotebook.addNote("This is note number 1");
    System.out.println(myNotebook);
    myNotebook.addNote("This is note number 2");
    System.out.println(myNotebook);
    myNotebook.addHighPriorityNote("This is note number 3");
    myNotebook.addHighPriorityNote("This is note number 4");
    System.out.println(myNotebook);
    System.out.println(myNotebook.getMostImportantNote());
  }
}
