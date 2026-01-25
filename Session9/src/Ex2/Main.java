package Ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Book book1 = new Book("1984", "George Orwell", 9.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 7.99);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        books.add(book1);
        books.add(book2);
        books.add(book3);

        System.out.println("----- Book Info -----");
        for (Book book : books) {
            book.printInfo();
            System.out.println("---------------------");
        }
    }
}
