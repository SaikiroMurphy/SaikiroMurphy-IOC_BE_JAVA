package Ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        EventManager manager = new EventManager();

        Event event1 = new Event(
                "Hội thảo Java cơ bản",
                LocalDateTime.of(2024, 12, 10, 8, 0),
                LocalDateTime.of(2024, 12, 10, 11, 0)
        );

        Event event2 = new Event(
                "Workshop Spring Boot",
                LocalDateTime.of(2024, 12, 15, 13, 30),
                LocalDateTime.of(2024, 12, 15, 17, 0)
        );

        Event event3 = new Event(
                "Seminar AI",
                LocalDateTime.of(2025, 1, 5, 9, 0),
                LocalDateTime.of(2025, 1, 5, 12, 0)
        );

// 🔴 ĐANG DIỄN RA
        Event event4 = new Event(
                "Hackathon 24h",
                LocalDateTime.now().minusHours(5),
                LocalDateTime.now().plusHours(19)
        );

        Event event5 = new Event(
                "Khóa học OOP",
                LocalDateTime.now().minusDays(1),
                LocalDateTime.now().plusDays(1)
        );

        Event event6 = new Event(
                "Đào tạo Git & GitHub",
                LocalDateTime.now().minusMinutes(30),
                LocalDateTime.now().plusHours(2)
        );

// 🟢 SẮP DIỄN RA
        Event event7 = new Event(
                "Talkshow Công nghệ",
                LocalDateTime.now().plusHours(3),
                LocalDateTime.now().plusHours(5)
        );

        Event event8 = new Event(
                "Cuộc thi lập trình",
                LocalDateTime.now().plusDays(2),
                LocalDateTime.now().plusDays(2).plusHours(4)
        );

        Event event9 = new Event(
                "Hội nghị phần mềm",
                LocalDateTime.now().plusDays(7),
                LocalDateTime.now().plusDays(7).plusHours(6)
        );

        Event event10 = new Event(
                "Lễ ra mắt sản phẩm",
                LocalDateTime.now().plusWeeks(2),
                LocalDateTime.now().plusWeeks(2).plusHours(3)
        );

        manager.addEvent(event1);
        manager.addEvent(event2);
        manager.addEvent(event3);
        manager.addEvent(event4);
        manager.addEvent(event5);
        manager.addEvent(event6);
        manager.addEvent(event7);
        manager.addEvent(event8);
        manager.addEvent(event9);
        manager.addEvent(event10);

        while (true) {
            System.out.println("===== Quản lý sự kiện =====");
            System.out.println("1. Thêm sự kiện");
            System.out.println("2. Hiển thị sự kiện");
            System.out.println("3. Thoát");
            System.out.print("Lựa chọn của bạn:");
            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            }

            switch (choice) {
                case 1 -> manager.addEvent(scanner);
                case 2 -> displayEventsMenu(scanner, manager);
                case 3 -> {
                    System.out.println("Thoát chương trình. Tạm biệt!");
                    return;
                }
                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");

            }
        }
    }

    public static void displayEventsMenu(Scanner scanner, EventManager manager) {
        while (true) {
            System.out.println("===== Hiển thị sự kiện =====");
            System.out.println("1. Hiển thị toàn bộ sự kiện");
            System.out.println("2. Lọc theo khoảng thời gian");
            System.out.println("3. Quay lại menu chính");
            System.out.print("Lựa chọn của bạn:");
            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 3) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            }

            switch (choice) {
                case 1 -> manager.sortEventsByStartDate();
                case 2 -> filterEventsByTimeRange(scanner, manager);
                case 3 -> {
                    System.out.println("Quay lại menu chính.");
                    return;
                }
                default ->
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");

            }
        }

    }

    public static void filterEventsByTimeRange(Scanner scanner, EventManager manager) {
        while (true) {
            System.out.println("===== Lọc sự kiện theo khoảng thời gian =====");
            System.out.println("1. Sự kiện đang diễn ra");
            System.out.println("2. Sự kiện đã kết thúc");
            System.out.println("3. Sự kiện sắp diễn ra");
            System.out.println("4. Sự kiện diễn ra trong khoảng thời gian cụ thể");
            System.out.println("5. Quay lại menu hiển thị sự kiện");
            System.out.print("Lựa chọn của bạn:");
            int choice = -1;

            try {
                choice = Integer.parseInt(scanner.nextLine());
                if (choice < 1 || choice > 5) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    continue;
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            }

            switch (choice) {
                case 1 -> manager.filterOngoingEvents();
                case 2 -> manager.filterPastEvents();
                case 3 -> manager.filterUpcomingEvents();
                case 4 -> {
                    while (true) {
                        try {
                            System.out.print("Nhập ngày bắt đầu (dd/MM/yyyy HH:mm): ");
                            LocalDateTime startRange = LocalDateTime.parse(scanner.nextLine(), EventManager.formatter);
                            System.out.print("Nhập ngày kết thúc (dd/MM/yyyy HH:mm): ");
                            LocalDateTime endRange = LocalDateTime.parse(scanner.nextLine(), EventManager.formatter);
                            manager.filterEventsByDateRange(scanner, startRange, endRange);
                            break;
                        } catch (DateTimeParseException e) {
                            System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
                        }
                    }
                }

                case 5 -> {
                    System.out.println("Quay lại menu hiển thị sự kiện.");
                    return;
                }

                default -> System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");

            }
        }
    }
}
