package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class Lecturer extends Staff implements Capability {
    private int teachingHours;
    private static final double RATE_PER_HOUR = 200000;

    public Lecturer(int id, String name, double baseSalary, int teachingHours) {
        super(id, name, baseSalary);
        this.teachingHours = teachingHours;
    }

    public Lecturer() {
        super(0, "", 0);
        this.teachingHours = 0;
    }

    @Override
    double calculateTotalSalary() {
        return this.baseSalary + (this.teachingHours * RATE_PER_HOUR);
    }

    @Override
    public void checkPerformance() {
        System.out.println("Checking performance of Lecturer: " + this.name);
    }

        @Override
    void inputInfo(Scanner scanner, ArrayList<Staff> staffMembers) {
        System.out.println("Nhập thông tin cho Giảng Viên:");
        System.out.printf("\t Nhập ID: ");
        this.id = Integer.parseInt(scanner.nextLine());
        for (Staff staff : staffMembers) {
            while (staff.id == this.id) {
                System.out.printf("\t ID đã tồn tại. Vui lòng nhập lại ID: ");
                this.id = Integer.parseInt(scanner.nextLine());
            }
        }
        System.out.printf("\t Nhập tên: ");
        this.name = scanner.nextLine();
        System.out.printf("\t Nhập lương cơ bản: ");
        this.baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.printf("\t Nhập số giờ giảng dạy: ");
        this.teachingHours = Integer.parseInt(scanner.nextLine());
    }

    @Override
    void displayInfo() {
        System.out.printf("| %-5d | %-35s | %-15s | %-15.2f | %-20s |\n",
                this.id,
                this.name,
                "Giảng viên",
                this.calculateTotalSalary(),
                "Đã kiểm tra");
    }

    @Override
    void updateInfo(Scanner scanner) {
        System.out.printf("\t Nhập tên mới (hiện tại: %s): ", this.name);
        this.name = scanner.nextLine();
        System.out.printf("\t Nhập lương cơ bản mới (hiện tại: %.2f): ", this.baseSalary);
        this.baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.printf("\t Nhập số giờ giảng dạy mới (hiện tại: %d): ", this.teachingHours);
        this.teachingHours = Integer.parseInt(scanner.nextLine());
    }
}
