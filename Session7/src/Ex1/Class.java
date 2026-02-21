
import java.util.Scanner;

public class Product {
    private String id, name, description;
    private int price, stock;
    private boolean status;

    public Product() {
    }

    public Product(String description, String id, String name, int price, boolean status, int stock) {
        this.description = description;
        this.id = id;
        this.name = name;
        this.price = price;
        this.status = status;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void displayInfo () {
        System.out.println("========== THÔNG TIN SẢN PHẨM ==========");
        System.out.println("Mã sản phẩm: " + this.id);
        System.out.println("Tên sản phẩm: " + this.name);
        System.out.println("Mô tả: " + this.description);
        System.out.println("Giá tiền: " + this.price);
        System.out.println("Tồn kho: " + this.stock);
        System.out.println("Trạng thái: " + (this.status ? "Còn hàng" : "Hết hàng"));
    }

    public void inputData () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm: ");
        this.id = scanner.nextLine();
        System.out.print("Nhập tên sản phẩm: ");
        this.name = scanner.nextLine();
        System.out.print("Nhập mô tả sản phẩm: ");
        this.description = scanner.nextLine();
        System.out.print("Nhập giá sản phẩm: ");
        this.price = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tồn kho sản phẩm: ");
        this.stock = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập trạng thái sản phẩm (true - còn hàng, false - hết hàng): ");
        this.status = Boolean.parseBoolean(scanner.nextLine());
    }
}
