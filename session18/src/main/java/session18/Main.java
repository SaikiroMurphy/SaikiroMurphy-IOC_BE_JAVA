package session18;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagement pm = new ProductManagement();
        while (true) {
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Cập nhật sản phẩm");
            System.out.println("4. Xóa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo giá");
            System.out.println("7. Thống kê theo danh mục");
            System.out.println("8. Thoát");
            System.out.print("Chọn chức năng: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    pm.addProduct(scanner);
                    break;
                case 2:
                    pm.displayProducts();
                    break;
                case 3:
                    pm.updateProduct(scanner);
                    break;
                case 4:
                    pm.deleteProduct(scanner);
                    break;
                case 5:
                    pm.searchProductsByName(scanner);
                    break;
                case 6:
                    pm.sortProductsByPrice();
                    break;
                case 7:
                    pm.catalogStatistic();
                    break;
                case 8:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
