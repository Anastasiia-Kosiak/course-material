package library;

public class Library {
    public static void main(String[] args) {
        Book bookOne = new Book("Good omens", "Neil Gaiman", "Novel", 2010);
        bookOne.displayBookInfo();
        Book bookTwo = new Book("Shining", "Stephen King", "Horror", 1998);
        bookTwo.displayBookInfo();
        Book bookThree = new Book("American Gods", "Neil Gaiman", "Novel", 2005);
        BookManagerImpl bookManager = new BookManagerImpl();
        bookManager.addBook(bookOne);
        // [bookOne][bookTwo][null][null][null]
        // NullPointerException
//        String s = null;
//        s.toUpperCase();
// NPE
        bookManager.addBook(bookTwo);
        bookManager.addBook(bookThree);
        bookManager.printBooks();
        boolean isPresent = bookManager.isBookPresent("good omens");
        System.out.println(isPresent);
        bookManager.searchBooksByGenre("Novel");

//        bookManager.searchBooksByAuthor("Stephen King");
    }
}
