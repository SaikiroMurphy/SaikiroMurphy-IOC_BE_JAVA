package Ex4;

public class Book {
    private String title, author;
    private double price;

    protected void printInfo() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Price: " + this.price);
    }
}
