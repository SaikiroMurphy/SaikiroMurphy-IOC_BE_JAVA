package Ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message1 = new Message("Alo?", "Saikiro28", LocalDateTime.now().minusMinutes(2));
        Message message2 = new Message("M đang ở đâu?", "Saikiro28", LocalDateTime.now().minusMinutes(1));
        Message message3 = new Message("T đang ở nhà.", "SekiVandera", LocalDateTime.now());
        
        MessageManager meManager = new MessageManager();
        
        meManager.messages.add(message1);
        meManager.messages.add(message2);
        meManager.messages.add(message3);

        run();
    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        MessageManager messageManager = new MessageManager();

        while (true) {
            System.out.println("--- MENU ---");
            System.out.println("1. Gửi tin nhắn");
            System.out.println("2. Hiển thị lịch sử chat");
            System.out.println("3. Lọc tin nhắn theo người gửi");
            System.out.println("4. Thoát");
            System.out.print("Chọn một tùy chọn: ");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    messageManager.sendMessage(scanner);
                    break;
                case "2":
                    messageManager.displayHistory();
                    break;
                case "3":
                    messageManager.filterMessagesBySender(scanner);
                    break;
                case "4":
                    System.out.println("Thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
            }
        }
    }
}
