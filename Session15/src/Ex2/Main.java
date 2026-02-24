package Ex2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SubjectManager<Subject> subjectManager = new SubjectManager<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--- MENU QUẢN LÝ MÔN HỌC ---");
            System.out.println("1. Thêm môn học");
            System.out.println("2. Xóa môn học");
            System.out.println("3. Cập nhật thông tin môn học");
            System.out.println("4. Hiển thị danh sách môn học");
            System.out.println("5. Tìm kiếm môn học theo tên");
            System.out.println("6. Lọc môn học theo số tín chỉ lớn hơn 3");
            System.out.println("7. Thoát chương trình");
            
            try {
                System.out.print("Lựa chọn của bạn: ");
                int choice = Integer.parseInt(scanner.nextLine());

                switch (choice) {
                    case 1:
                        subjectManager.addSubject(scanner);
                        break;
                    case 2:
                        subjectManager.removeSubject(scanner);
                        break;
                    case 3:
                        subjectManager.updateSubject(scanner);
                        break;
                    case 4:
                        subjectManager.displaySubjects();
                        break;
                    case 5:
                        System.out.print("Nhập tên môn học cần tìm kiếm: ");
                        String name = scanner.nextLine();
                        Subject foundByName = subjectManager.searchSubjectByName(name);
                        if (foundByName != null) {
                            System.out.println("Tìm thấy môn học: " + foundByName.toString());
                        } else {
                            System.out.println("Không tìm thấy môn học với tên " + name);
                        }
                        break;
                    case 6:
                        subjectManager.sortSubjectsByCredits();
                        break;
                    case 7:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn từ 1 đến 7.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập lựa chọn. Vui lòng nhập một số nguyên từ 1 đến 7.");
            }  
        }
    }
}
