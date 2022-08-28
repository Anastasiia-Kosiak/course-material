package library;

public interface BookManager {
    void addBook(Book book);
    void printBooks();
    boolean isBookPresent(String title);
    void searchBooksByAuthor(String author);
    void searchBooksByGenre(String genre);
}
