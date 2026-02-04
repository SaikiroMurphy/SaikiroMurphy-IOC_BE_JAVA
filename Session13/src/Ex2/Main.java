package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        AttendanceManager attendanceManager = new AttendanceManager();
        int choice;
        do {
            menu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    // Add student
                    Student student = new Student();
                    student.inputData(scanner);
                    attendanceManager.add(student);
                    System.out.println("Thêm thành công.");
                    break;
                case 2:
                    // Update student
                    System.out.print("Nhập ID sinh viên cần cập nhật: ");
                    int idToUpdate = Integer.parseInt(scanner.nextLine());
                    int index = attendanceManager.findIndexById(idToUpdate);
                    if (index != -1) {
                        Student updatedStudent = new Student();
                        updatedStudent.inputData(scanner);
                        attendanceManager.update(index, updatedStudent);
                        System.out.println("Cập nhật thành công.");
                    } else {
                        System.out.println("Không tìm thấy sinh viên có ID " + idToUpdate);
                    }
                    break;
                case 3:
                    // Delete student
                    System.out.print("Nhập ID sinh viên cần xóa: ");
                    int idToDelete = Integer.parseInt(scanner.nextLine());
                    int deleteIndex = attendanceManager.findIndexById(idToDelete);
                    if (deleteIndex != -1) {
                        attendanceManager.delete(deleteIndex);
                        System.out.println("Xóa thành công.");
                    } else {
                        System.out.println("Không tìm thấy sinh viên có ID " + idToDelete);
                    }
                    break;
                case 4:
                    // Display students
                    attendanceManager.display();
                    break;
                case 5:
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.err.println("Lựa chọn không hợp lệ. Vui lòng nhập lại.");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("+=============================================+");
        System.out.printf("|%-45s|\n", "1. Thêm sinh viên");
        System.out.printf("|%-45s|\n", "2. Cập nhật sinh viên");
        System.out.printf("|%-45s|\n", "3. Xóa sinh viên");
        System.out.printf("|%-45s|\n", "4. Hiển thị danh sách sinh viên");
        System.out.printf("|%-45s|\n", "5. Thoát");
        System.out.println("+=============================================+");
        System.out.print("Lựa chọn của bạn: ");

    }
}
