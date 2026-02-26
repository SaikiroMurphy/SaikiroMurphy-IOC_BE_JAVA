package Ex3;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MessageManager {
    public static ArrayList<Message> messages = new ArrayList<>();

    public void sendMessage(Scanner scanner) {
        Message message = new Message();

        while (true) { 
            try {
                System.out.print("Nhập tên người gửi (Nhập 'Exit' để thoát): ");
                message.setSender(scanner.nextLine());
                if (message.getSender().isBlank()) {
                    throw new IllegalArgumentException("Tên người gửi không được để trống.");
                } else if (message.getSender().equalsIgnoreCase("exit")) {
                    return;
                }
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Vui lòng nhập lại.");
            }
        }
        
        while (true) { 
            try {
                System.out.print("Nhập nội dung tin nhắn (Nhập 'Exit' để thoát): ");
                message.setContent(scanner.nextLine());
                if (message.getContent().isBlank()) {
                    throw new IllegalArgumentException("Tên người gửi không được để trống.");
                } else if (message.getContent().equalsIgnoreCase("exit")) {
                    return;
                }
                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Vui lòng nhập lại.");
            }
        }

        message.setTimestamp(LocalDateTime.now());

        messages.add(message);
    }

    public void displayHistory() {
        messages.sort(Comparator.comparing(Message::getTimestamp));
        System.out.println("-------------------- LỊCH SỬ CHAT --------------------");
        for (Message message : messages) {
            System.out.println(message);
        }
        System.out.println("------------------------------------------------------");

    }

    public void filterMessagesBySender(Scanner scanner) {
        System.out.print("Nhập tên người gửi để lọc: ");
        try {
            String name = scanner.nextLine();
            if (name.isBlank()) {
                throw new IllegalArgumentException("Tên người gửi không được để trống.");
            }

            List<Message> retrieveMsg = messages.stream().filter(predicate -> predicate.getSender().equals(name)).toList();

            System.out.println("-------------------- KẾT QUẢ LỌC --------------------");
            for (Message message : retrieveMsg) {
                System.out.println(message);
            }
            System.out.println("------------------------------------------------------");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage() + " Vui lòng nhập lại.");
        }
    }
}
