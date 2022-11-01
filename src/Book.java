public class Book {
    private String bookName;
    private int bookYear;
    private Author bookAuthor;
    public Book (String name, int year, Author author) {
        this.bookName = name;
        this.bookYear = year;
        this.bookAuthor = author;
    }

    public String getBookName() {
        return this.bookName;
    }

    public int getBookYear() {
        return this.bookYear;
    }

    public String getBookAuthor() {
        return this.bookAuthor.getAuthor();
    }

    public void setBookYear(int bookYear) {
        this.bookYear = bookYear;
    }
}

