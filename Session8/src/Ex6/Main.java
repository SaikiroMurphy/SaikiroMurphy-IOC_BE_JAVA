package Ex6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        boolean isExit = false;
        int choice;

        while (!isExit) { 
            displayMainMenu(scanner);
            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Bạn đã chọn thêm sản phẩm mới.");
                    ProductManager.addProduct(scanner);
                    break;
                case 2:
                    System.out.println("Bạn đã chọn hiển thị danh sách sản phẩm.");
                    ProductManager.displayProducts();
                    break;
                case 3:
                    System.out.println("Bạn đã chọn tìm sản phẩm theo khoảng giá.");
                    ProductManager.searchProductsByPriceRange(scanner);
                    break;
                case 4:
                    System.out.println("Bạn đã chọn thống kê số sản phẩm đã tạo.");
                    ProductManager.countProducts();
                    break;
                case 0:
                    System.out.println("Thoát chương trình.");
                    isExit = true;
                    break;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");;
            }
        }
    }

    public static void displayMainMenu(Scanner scanner) {
        System.out.println("========== MENU SẢN PHẨM ==========");        
        System.out.println("1. Thêm sản phẩm mới");        
        System.out.println("2. In danh sách sản phẩm");        
        System.out.println("3. Tìm sản phẩm theo khoảng giá");        
        System.out.println("4. Thống kê số sản phẩm đã tạo");        
        System.out.println("0. Thoát");
        System.out.println("===================================");
        System.out.print("Lựa chọn của bạn: ");
    }
}
