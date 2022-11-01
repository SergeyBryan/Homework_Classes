public class Main {
    public static void main(String[] args) {
        Author authorFirstBook = new Author("Николай", "Гоголь");
        Book firstBook = new  Book("Мертвые души", 1842, authorFirstBook);
        System.out.println(firstBook.getBookName() + " " + firstBook.getBookYear() +" "+ firstBook.getBookAuthor());
        Author authorSecondBook = new Author("Лев", "Толстой");
        Book secondBook = new Book("Анна Каренина", 1873, authorSecondBook);
        System.out.println(secondBook.getBookName() +" " + secondBook.getBookYear() + " "+ secondBook.getBookAuthor());
        secondBook.setBookYear(1878);
        System.out.println(secondBook.getBookYear());
    }
}