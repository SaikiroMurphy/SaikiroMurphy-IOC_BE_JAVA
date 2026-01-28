package Ex6;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        do {
            displayMenu();
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("Hiện không có phương tiện nào.");
                    } else {
                        System.out.println("+---------------- Thông tin tất cả các phương tiện ---------------+");
                        for (Vehicle v : vehicles) {
                            v.showInfo();
                            System.out.println("+-----------------------------------------------------------------+");
                        }
                    }
                }
                case 2 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("Hiện không có phương tiện nào để kiểm tra.");
                    } else {
                        System.out.println("--------------- Kiểm tra Overriding: startEngine() ---------------");
                        for (Vehicle v : vehicles) {
                            v.startEngine();
                        }
                        System.out.println("------------------------------------------------------------------");
                    }
                }
                case 3 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("Hiện không có phương tiện nào để kiểm tra.");
                    } else {
                        System.out.println("--------------- Kiểm tra Overloading: move() ---------------");
                        for (Vehicle v : vehicles) {
                            v.move();
                            v.move(60);
                        }
                        System.out.println("------------------------------------------------------------");
                    }
                }
                case 4 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("Hiện không có phương tiện nào để kiểm tra.");
                    } else {
                        System.out.println("--------------- Kiểm tra đa tình runtime (Vehicle array/List) ---------------");
                        for (Vehicle v : vehicles) {
                            if (v instanceof Car) {
                                System.out.println("Đây là một chiếc xe hơi.");
                            } else if (v instanceof Truck) {
                                System.out.println("Đây là một chiếc xe tải.");
                            } else if (v instanceof Motorcycle) {
                                System.out.println("Đây là một chiếc xe máy.");
                            } else {
                                System.out.println("Đây là một phương tiện không xác định.");
                            }
                        }
                        System.out.println("--------------------------------------------------------------------------");
                    }
                }
                case 5 -> {
                    if (vehicles.isEmpty()) {
                        System.out.println("Hiện không có phương tiện nào để kiểm tra.");
                    } else {
                        System.out.println("--------------- Gọi hành vi đặc trưng của từng loại phương tiện ---------------");
                        for (Vehicle v : vehicles) {
                            if (v instanceof Car car) {
                                car.openTrunk();
                            } else if (v instanceof Truck truck) {
                                truck.loadCargo();
                            } else if (v instanceof Motorcycle motorcycle) {
                                motorcycle.popWheelie();
                            }
                        }
                        System.out.println("--------------------------------------------------------------------------");
                    }
                }
                case 6 -> {
                    int insertChoice;
                    do {
                        displayInsertMenu();
                        insertChoice = Integer.parseInt(scanner.nextLine());
                        switch (insertChoice) {
                            case 1 -> {
                                Car car = new Car();
                                car.inputInfo(scanner);
                                vehicles.add(car);
                                System.out.println("Đã thêm xe hơi thành công.");
                            }
                            case 2 -> {
                                Truck truck = new Truck();
                                truck.inputInfo(scanner);
                                vehicles.add(truck);
                                System.out.println("Đã thêm xe tải thành công.");
                            }
                            case 3 -> {
                                Motorcycle motorcycle = new Motorcycle();
                                motorcycle.inputInfo(scanner);
                                vehicles.add(motorcycle);
                                System.out.println("Đã thêm xe máy thành công.");
                            }
                            case 0 -> System.out.println("Quay lại menu chính.");
                            default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
                        }
                    } while (insertChoice != 0);
                }
                case 0 -> System.out.println("Thoát chương trình.");
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        } while (choice != 0);
        scanner.close();

    }

    public static void displayInsertMenu() {
        System.out.println("=============== THÊM PHƯƠNG TIỆN MỚI ===============");
        System.out.println("Chọn loại phương tiện để thêm:");
        System.out.println("1. Car");
        System.out.println("2. Truck");
        System.out.println("3. Motorcycle");
        System.out.println("0. Quay lại menu chính");
        System.out.println("=====================================================");
        System.out.print("Lựa chọn của bạn: ");
    }

    public static void displayMenu() {
        System.out.println("=============== MENU QUẢN LÝ PHƯƠNG TIỆN ===============");
        System.out.println("1. Hiển thị thông tin tất cả các phương tiện");
        System.out.println("2. Kiểm tra Overriding: startEngine()");
        System.out.println("3. Kiểm tra Overloading: move()");
        System.out.println("4. Kiểm tra đa tình runtime (Vehicle array/List)");
        System.out.println("5. Gọi hành vi đặc trưng của từng loại phương tiện");
        System.out.println("6. Thêm phương tiện mới");
        System.out.println("0. Thoát");
        System.out.println("========================================================");
        System.out.print("Nhập lựa chọn của bạn: ");
    }
}
