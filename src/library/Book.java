package library;

public class Book {
    private String title;
    private String author;
    private String genre;
    private int publishYear;

    public Book() {

    }

    public Book(String title, String author, String genre, int publishYear) {
        this.author = author;
        this.publishYear = publishYear;
        this.genre = genre;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public void displayBookInfo() {
        System.out.println(this.title + " was written by " + this.author
                + " and published in " + this.publishYear);
    }
}
