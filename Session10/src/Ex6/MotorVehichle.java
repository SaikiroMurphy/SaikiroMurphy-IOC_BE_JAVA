package Ex6;

import java.util.Scanner;

public class MotorVehichle extends Vehicle {
    private FuelType fuelType;

    public MotorVehichle(String brand, int year, FuelType fuelType) {
        super(brand, year);
        this.fuelType = fuelType;
    }

    public MotorVehichle() {
        super();
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.printf("| %-30s | %-30s |\n", "Fuel Type: ", fuelType);
    }

    @Override
    public void inputInfo(Scanner scanner) {
        super.inputInfo(scanner);
        System.out.println("Nhập loại nhiên liệu:");
        System.out.println("1. XĂNG");
        System.out.println("2. DẦU");
        System.out.println("3. ĐIỆN");
        System.out.println("4. HYBRID");
        System.out.print("Lựa chọn của bạn: ");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1 -> this.fuelType = FuelType.XĂNG;
            case 2 -> this.fuelType = FuelType.DẦU;
            case 3 -> this.fuelType = FuelType.ĐIỆN;
            case 4 -> this.fuelType = FuelType.HYBRID;
            default -> {
                System.out.println("Lựa chọn không hợp lệ. Đặt mặc định là XĂNG.");
                this.fuelType = FuelType.XĂNG;
            }
        }
    }
}
