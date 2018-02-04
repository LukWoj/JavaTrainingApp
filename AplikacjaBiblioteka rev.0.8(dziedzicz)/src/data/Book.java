package data;

public class Book extends Publication {
    // Pola
    private String author;
    private int pages;
    private String isbn;

    // settery i gettery
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    // Konstruktory
    public Book(String title, String author, int year, int pages, String publisher,
                String isbn) {
        this.setTitle(title);
        this.setAuthor(author);
        this.setYear(year);
        this.setPages(pages);
        this.setPublisher(publisher);
        this.setIsbn(isbn);
    }

    public void printInfo() {
        String info = getTitle() + "; " + getAuthor() + "; " + getYear() + "; " + getPages()
                + "; " + getPublisher() + "; " + getIsbn();
        System.out.println(info);
    }
}