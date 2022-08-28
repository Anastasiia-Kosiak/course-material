package library;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

// impl - implementation - реалізація
public class BookManagerImpl implements BookManager {
//    private Book[] books = new Book[10];
    List<Book> books = new ArrayList<>();

    @Override
    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public void printBooks() {
        for (int index = 0; index < books.size(); index++) {
            System.out.println(books.get(index).getTitle());
        }
    }

    @Override
    public boolean isBookPresent(String title) {
        for (int i =0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void searchBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getAuthor().equalsIgnoreCase(author)) {
                authorBooks.add(books.get(i));
            }
        }
        printBooks(authorBooks);
    }

    @Override
    public void searchBooksByGenre(String genre) {
        List<Book> genreBooks = new ArrayList<>();
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getGenre().equalsIgnoreCase(genre)) {
                genreBooks.add(books.get(i));
            }
        }
        printBooks(genreBooks);
    }

    private void printBooks(List<Book> books) {
        for (int i = 0; i < books.size(); i++)  {
            books.get(i).displayBookInfo();
        }
    }
}
