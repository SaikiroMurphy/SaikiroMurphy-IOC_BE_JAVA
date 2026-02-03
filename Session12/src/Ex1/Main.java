package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Staff> staffMembers = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        mainMenu(scanner);
        scanner.close();
    }

    public static void mainMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("+--------------------------------------------------+");
            System.out.println("|                  QUẢN LÝ NHÂN VIÊN               |");
            System.out.println("+--------------------------------------------------+");
            System.out.printf("| %-48s |\n", "1. Thêm Nhân Viên Mới");
            System.out.printf("| %-48s |\n", "2. Hiển Thị Thông Tin Nhân Viên");
            System.out.printf("| %-48s |\n", "3. Cập Nhật Thông Tin Nhân Viên");
            System.out.printf("| %-48s |\n", "4. Xóa Thông Tin Nhân Viên");
            System.out.printf("| %-48s |\n", "5. Thoát");
            System.out.println("+--------------------------------------------------+");
            System.out.printf("Vui lòng chọn một tùy chọn (1-5): ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    addStaffMenu(scanner);
                    break;

                case 2:
                    // Display Staff Information
                    if (staffMembers.isEmpty()) {
                        System.out.println("Chưa có nhân viên nào trong hệ thống.");
                    } else {
                        displayStaffInfo();
                    }
                    break;

                case 3:
                    // Update Staff Information
                    if (staffMembers.isEmpty()) {
                        System.out.println("Chưa có nhân viên nào trong hệ thống.");
                    } else {
                        updateStaffMenu(scanner);
                    }
                    break;
                case 4:
                    // Delete Staff Information
                    if (staffMembers.isEmpty()) {
                        System.out.println("Chưa có nhân viên nào trong hệ thống.");
                    } else {
                        deleteStaffMenu(scanner);
                    }
                    break;
                case 5:
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (true);

    }

    public static void deleteStaffMenu(Scanner scanner) {
        System.out.println("+---------------------------------------------+");
        System.out.println("|          XÓA THÔNG TIN NHÂN VIÊN           |");
        System.out.println("+---------------------------------------------+");
        System.out.print("Nhập ID nhân viên cần xóa: ");
        int staffId = Integer.parseInt(scanner.nextLine());

        for (Staff staff : staffMembers) {
            if (staff.id == staffId) {
                staffMembers.remove(staff);
                System.out.println("Đã xóa nhân viên: " + staff.name);
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có ID: " + staffId);
    }

    public static void displayStaffInfo() {
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.println("|                                       DANH SÁCH NHÂN VIÊN HIỆN CÓ                                      |");
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
        System.out.printf("| %-5s | %-35s | %-15s | %-15s | %-20s |\n", "ID", "Họ tên", "Loại nhân viên", "Tổng Lương", "Kiểm Tra Năng Lực");
        for (Staff staff : staffMembers) {
            staff.displayInfo();
        }
        System.out.println("+--------------------------------------------------------------------------------------------------------+");
    }

    public static void updateStaffMenu(Scanner scanner) {
        System.out.println("+---------------------------------------------+");
        System.out.println("|        CẬP NHẬT THÔNG TIN NHÂN VIÊN         |");
        System.out.println("+---------------------------------------------+");
        System.out.print("Nhập ID nhân viên cần cập nhật: ");
        int staffId = Integer.parseInt(scanner.nextLine());

        for (Staff staff : staffMembers) {
            if (staff.id == staffId) {
                System.out.println("Đã tìm thấy nhân viên: " + staff.name);
                staff.updateInfo(scanner);
                staffMembers.set(staffMembers.indexOf(staff), staff);
                System.out.println("Cập nhật thông tin thành công.");
                return;
            }
        }

        System.out.println("Không tìm thấy nhân viên có ID: " + staffId);
    }

    public static void addStaffMenu(Scanner scanner) {
        int choice;
        do {
            System.out.println("+--------------------------------------+");
            System.out.println("|          THÊM NHÂN VIÊN              |");
            System.out.println("+--------------------------------------+");
            System.out.printf("| %-36s |\n", "1. Thêm Giảng Viên");
            System.out.printf("| %-36s |\n", "2. Thêm Admin Staff");
            System.out.printf("| %-36s |\n", "3. Trở về Menu Chính");
            System.out.println("+--------------------------------------+");
            System.out.printf("Vui lòng chọn một tùy chọn (1-3): ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // Add Lecturer
                    Lecturer lecturer = new Lecturer();
                    lecturer.inputInfo(scanner, staffMembers);
                    staffMembers.add(lecturer);
                    break;
                case 2:
                    // Add Admin Staff
                    AdminStaff adminStaff = new AdminStaff();
                    adminStaff.inputInfo(scanner, staffMembers);
                    staffMembers.add(adminStaff);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (true);
    }
}
