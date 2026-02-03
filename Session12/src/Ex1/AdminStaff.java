package Ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class AdminStaff extends Staff implements Capability {
    private double bonus;

    public AdminStaff(int id, String name, double baseSalary, double bonus) {
        super(id, name, baseSalary);
        this.bonus = bonus;
    }

    public AdminStaff() {
        super(0, "", 0);
        this.bonus = 0;
    }

    @Override
    double calculateTotalSalary() {
        return this.baseSalary + this.bonus;
    }

    @Override
    public void checkPerformance() {
        System.out.println("Checking performance of Admin Staff: " + this.name);
    }

    @Override
    void inputInfo(Scanner scanner, ArrayList<Staff> staffMembers) {
        System.out.println("Nhập thông tin cho Admin Staff:");
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
        System.out.printf("\t Nhập phụ cấp: ");
        this.bonus = Double.parseDouble(scanner.nextLine());
    }

    @Override
    void displayInfo() {
        System.out.printf("| %-5d | %-35s | %-15s | %-15.2f | %-20s |\n",
                this.id,
                this.name,
                "Admin Staff",
                this.calculateTotalSalary(),
                "Đã kiểm tra");
    }

    @Override
    void updateInfo(Scanner scanner) {
        System.out.printf("\t Nhập tên mới (hiện tại: %s): ", this.name);
        this.name = scanner.nextLine();
        System.out.printf("\t Nhập lương cơ bản mới (hiện tại: %.2f): ", this.baseSalary);
        this.baseSalary = Double.parseDouble(scanner.nextLine());
        System.out.printf("\t Nhập phụ cấp mới (hiện tại: %.2f): ", this.bonus);
        this.bonus = Double.parseDouble(scanner.nextLine());
    }
}
