package lessontwo;

public class Book {
    // поля
    private String author;
    private String title;
    private String genre;
    private int publishYear;

    public Book() {
        System.out.println("створення об'екту типу Book");
    }

    // сетер для author
    // set - встановлювати
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public int getPublishYear() {
        return this.publishYear;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }
    // методи
}
