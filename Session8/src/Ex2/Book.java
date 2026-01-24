package Ex2;

public class Book {
    private String title, author;
    private double price;

    public Book() {
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString () {
        return ("Title: " + this.title
        + ", Author: " + this.author
        + ", Price: " + this.price);
    }

    public void displayBookInfo () {
        System.out.println(this);
    }
}
