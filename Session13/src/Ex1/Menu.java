package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    public static void mainMenu(Scanner scanner, ArrayList<Person> lists) {
        int choice;
        do {
            System.out.println("+========== MENU QUẢN LÝ NGƯỜI DÙNG ==========+");
            System.out.printf("|%-45s|\n", "1. Thêm người dùng");
            System.out.printf("|%-45s|\n", "2. Xóa người dùng");
            System.out.printf("|%-45s|\n", "3. Hiển thị danh sách người dùng");
            System.out.printf("|%-45s|\n", "4. Thoát");
            System.out.println("+=============================================+");

            System.out.print("Lựa chọn của bạn: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> Person.inputData(scanner, lists);
                case 2 -> Person.deleteData(scanner, lists);
                case 3 -> Person.displayData(lists);
                case 4 -> {
                    System.out.println("Thoát chương trình.");
                    return;
                }
                default -> System.err.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (true);
    }
}
