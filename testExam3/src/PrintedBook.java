public class PrintedBook extends Book {
    private boolean isPaperback;

    public PrintedBook(String title, String isbn, boolean paperback) {
        super(title, isbn);
        this.isPaperback = paperback;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public String getBookType() {
        if(isPaperback)
            return "Paperback";
        else
            return "Hard cover";
    }

    public String toString() {
        return String.format("%s | Type: %s", super.toString(), getBookType());
    }

    public boolean equals (Object obj) {
        if(!(obj instanceof PrintedBook))
            return false;
        PrintedBook other = (PrintedBook) obj;
        return isPaperback == other.isPaperback && super.equals(obj);
    }
}
