package Ex6;

import java.util.Scanner;

public class ProductManager {
    static Product[] products = new Product[100];
    private static int size = 0;
    private static int addQuantity;

    public static void addProduct (Scanner scanner) {
        System.out.print("Nhập số lượng sản phẩm muốn thêm: ");
        addQuantity = Integer.parseInt(scanner.nextLine());
        
        for (int i = 0; i < addQuantity; i++) {
            System.out.println("~~~~~~~~~~ NHẬP SẢN PHẨM THỨ " + (i+1) + " ~~~~~~~~~~");
            Product product = new Product();
            product.input(scanner);
            products[size++] = product;
        }
    }

    public static void displayProducts () {
        if (size == 0) {
            System.out.println("Danh sách sản phẩm rỗng.");
            return;
        }

        System.out.printf("+-----+------------------------------+---------------+\n");
        System.out.printf("|%-5s|%-30s|%-15s|\n", "ID", "Tên sản phẩm", "Giá");
        System.out.printf("+-----+------------------------------+---------------+\n");
        for (int i = 0; i < size; i++) {
            products[i].print();
        }
    }

    public static void searchProductsByPriceRange (Scanner scanner) {
        System.out.print("Nhập giá trị thấp nhất: ");
        double minPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Nhập giá trị cao nhất: ");
        double maxPrice = Double.parseDouble(scanner.nextLine());

        System.out.printf("+-----+------------------------------+---------------+\n");
        System.out.printf("|%-5s|%-30s|%-15s|\n", "ID", "Tên sản phẩm", "Giá");
        System.out.printf("+-----+------------------------------+---------------+\n");
        for (int i = 0; i < size; i++) {
            double price = products[i].getPrice();
            if (price >= minPrice && price <= maxPrice) {
                products[i].print();
            }
        }
    }

    public static void countProducts () {
        System.out.println("Tổng số sản phẩm đã tạo: " + size);
    }
}
