import java.util.Objects;

public class Book {
    private String bookName;
    private int bookYear;
    private Author bookAuthor;

    public Book(String name, int year, Author author) {
        bookName = name;
        bookYear = year;
        bookAuthor = author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookYear() {
        return bookYear;
    }

    public String getBookAuthor() {
        return bookAuthor.getAuthor();
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }

    @Override
    public String toString() {
        return bookName + " " + bookYear + " " + bookAuthor;
    }

    @Override
    public boolean equals(Object other) {
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Book c2 = (Book) other;
        return bookName.equals(c2.bookName) && bookAuthor.equals(c2.bookAuthor) && bookYear == c2.bookYear;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookYear, bookName, bookAuthor);
    }
}

