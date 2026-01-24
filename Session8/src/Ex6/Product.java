package Ex6;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    
    static int AUTO_ID = 1;
    final String WAREHOUSE_CODE = "KHO-01";
    
    public Product() {
    }

    public Product(String name, double price) {
        this.id = AUTO_ID++;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void input (Scanner scanner) {
        this.id = AUTO_ID++;
        System.out.print("Nhập tên sản phẩm: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        this.price = Double.parseDouble(scanner.nextLine());
    }

    public void print() {
        System.out.printf("|%-5d|%-30s|%-15.2f|\n", this.id, this.name, this.price);
        System.out.printf("+-----+------------------------------+---------------+\n");
    }
}
