package Ex2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class EventManager {
    public static ArrayList<Event> events = new ArrayList<>();
    static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
    LocalDateTime now = LocalDateTime.now();

    public void addEvent(Scanner scanner) {
        Event event = new Event();

        while (true) { 
            try {
                System.out.print("Nhập tên sự kiện:");
                event.setName(scanner.nextLine());
                if (event.getName().isEmpty()) {
                    throw new IllegalArgumentException("Tên sự kiện không được để trống.");
                }
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày bắt đầu (dd/MM/yyyy HH:mm):");
                event.setStartDate(LocalDateTime.parse(scanner.nextLine(), formatter));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }

        while (true) {
            try {
                System.out.print("Nhập ngày kết thúc (dd/MM/yyyy HH:mm):");
                event.setEndDate(LocalDateTime.parse(scanner.nextLine(), formatter));
                break;
            } catch (DateTimeParseException e) {
                System.out.println("Định dạng ngày không hợp lệ. Vui lòng nhập lại.");
            }
        }
        events.add(event);
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void sortEventsByStartDate() {
        if (events.isEmpty()) {
            System.out.println("Không có sự kiện nào.");
            return;
        }

        events.sort((e1, e2) -> e1.getStartDate().compareTo(e2.getStartDate()));
        tabHeader();
        for (Event event : events) {
            System.out.println(event);
        }

    }

    public void filterEventsByDateRange(Scanner scanner, LocalDateTime startRange, LocalDateTime endRange) {
        if (events.isEmpty()) {
            System.out.println("Không có sự kiện nào.");
            return;
        }

        tabHeader();
        for (Event event : events) {
            if (!event.getStartDate().isBefore(startRange) && !event.getEndDate().isAfter(endRange)) {
                System.out.println(event);
            }
        }
    }

    public void filterOngoingEvents() {
        if (events.isEmpty()) {
            System.out.println("Không có sự kiện nào.");
            return;
        }

        tabHeader();
        for (Event event : events) {
            if (!event.getStartDate().isAfter(now) && !event.getEndDate().isBefore(now)) {
                System.out.println(event);
            }
        }
    }

    public void filterPastEvents() {
        if (events.isEmpty()) {
            System.out.println("Không có sự kiện nào.");
            return;
        }

        tabHeader();
        for (Event event : events) {
            if (event.getEndDate().isBefore(now)) {
                System.out.println(event);
            }
        }
    }

    public void filterUpcomingEvents() {
        if (events.isEmpty()) {
            System.out.println("Không có sự kiện nào.");
            return;
        }

        tabHeader();
        for (Event event : events) {
            if (event.getStartDate().isAfter(now)) {
                System.out.println(event);
            }
        }
    }

    private void tabHeader() {
        System.out.println("+--------------------------------------------------------------------------------------------+");
        System.out.println("| Tên sự kiện                                      | Ngày bắt đầu       | Ngày kết thúc      |");
        System.out.println("+--------------------------------------------------+--------------------+--------------------+");
    }
}
