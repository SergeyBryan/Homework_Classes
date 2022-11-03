public class Main {
    public static void main(String[] args) {
        Author authorFirstBook = new Author("Николай", "Гоголь");
        Book firstBook = new Book("Мертвые души", 1842, authorFirstBook);
        System.out.println(firstBook.getBookName() + " " + firstBook.getBookYear() + " " + firstBook.getBookAuthor());
        Author authorSecondBook = new Author("Лев", "Толстой");
        Book secondBook = new Book("Анна Каренина", 1873, authorSecondBook);
        System.out.println(secondBook.getBookName() + " " + secondBook.getBookYear() + " " + secondBook.getBookAuthor());
        secondBook.setBookYear(1878);
        System.out.println(secondBook.getBookYear());
//        Для новой домашки - новая книжка и автор, чтобы сравнить его и хешкоды
        Author authorThirdBook = new Author("Лев", "Толстой");
        Book thirdBook = new Book("Война и мир", 1867, authorThirdBook);
        System.out.println("Результат сравнения автора третьей книги со второй: " + authorThirdBook.equals(authorSecondBook));
        System.out.println("Результат сравнения автора третьей книги с первой: " + authorThirdBook.equals(authorFirstBook));
        System.out.println("Результат сравнения двух книг через хэшкод: " + (authorThirdBook.hashCode() == authorSecondBook.hashCode()));
        System.out.println("Выведение результата методом toString: " + thirdBook);
    }
}