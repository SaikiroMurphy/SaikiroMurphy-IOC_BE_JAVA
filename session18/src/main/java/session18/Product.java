package session18;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;
    private String title;
    private LocalDate created;
    private String catalog;
    private int status;
    
    public Product(String name, double price, String title, String catalog, int status) {
        this.name = name;
        this.price = price;
        this.title = title;
        this.created = LocalDate.now();
        this.catalog = catalog;
        this.status = status;
    }

    public Product() {
        this.created = LocalDate.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void inputData(Scanner sc) {
        while (true) {
            System.out.print("Nhập tên sản phẩm: ");
            name = sc.nextLine();
            if (!name.trim().isEmpty()) {
                break;
            }
            System.out.println("Tên sản phẩm không được để trống!");
        }

        while (true) {
            System.out.print("Nhập giá sản phẩm: ");
            try {
                price = Double.parseDouble(sc.nextLine());
                if (price > 0) {
                    break;
                } else {
                    System.out.println("Giá sản phẩm phải lớn hơn 0!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Giá sản phẩm không hợp lệ!");
            }
        }

        while (true) {
            System.out.print("Nhập tiêu đề sản phẩm: ");
            title = sc.nextLine();
            if (!title.trim().isEmpty()) {
                break;
            }
            System.out.println("Tiêu đề sản phẩm không được để trống!");
        }

        while (true) {
            System.out.print("Nhập danh mục sản phẩm: ");
            catalog = sc.nextLine();
            if (!catalog.trim().isEmpty()) {
                break;
            }
            System.out.println("Danh mục sản phẩm không được để trống!");
        }

        while (true) {
            try {
                System.out.print("Nhập trạng thái sản phẩm (0 - không hoạt động, 1 - hoạt động): ");
                status = Integer.parseInt(sc.nextLine());
                if (status == 0 || status == 1) {
                    break;
                } else {
                    System.out.println("Trạng thái sản phẩm phải là 0 hoặc 1!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Trạng thái sản phẩm không hợp lệ!");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("|%-5s|", id));
        sb.append(String.format("%-50s|", name));
        sb.append(String.format("%-10.2f|", price));
        sb.append(String.format("%-50s|", title));
        sb.append(String.format("%-12s|", created.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))));
        sb.append(String.format("%-20s|", catalog));
        sb.append(String.format("%-5s|", status));
        return sb.toString();
    }

    
}
