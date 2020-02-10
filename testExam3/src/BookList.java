import java.util.ArrayList;

public class BookList {
    private ArrayList<Book> books;

    public BookList() {
        books = new ArrayList<Book>();
    }

    public int getNumberOfBooks() {
        return books.size();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public Book getBook(int index) {
        return books.get(index);
    }

    public Book getBook(String isbn) {
        for (Book book : books)
            if (book.getIsbn().equals(isbn))
                return book;
        return null;
    }

    public void removeBook(int index) {
        books.remove(index);
    }

    public int getIndexOfFirstPrintedBook() {
        for (int i = 0; i < books.size(); i++)
            if (books.get(i) instanceof PrintedBook)
                return i;
        return -1;
    }

    public int getNumberOfBooksByType(String bookType) {
        int numberOfBooks = 0;
        for (Book book : books)
            if (book.getBookType().equals(bookType))
                numberOfBooks++;
        return numberOfBooks;
    }

    public Book[] getBooksByType(String bookType) {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books)
            if (book.getBookType().equals(bookType))
                result.add(book);
        return (Book[]) result.toArray();
    }

    public EBook[] getAllEBooks() {
        ArrayList<Book> result = new ArrayList<Book>();
        for (Book book : books)
            if (book instanceof EBook)
                result.add(book);
        return (EBook[]) result.toArray();
    }
}
