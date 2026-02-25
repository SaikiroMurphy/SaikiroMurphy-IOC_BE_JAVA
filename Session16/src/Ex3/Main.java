package Ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Message message1 = new Message("Alo?", "Saikiro28", LocalDateTime.now().minusMinutes(1));
        Message message2 = new Message("M đang ở đâu?", "Saikiro28", LocalDateTime.now());
        Message message3 = new Message("T đang ở nhà.", "SekiVandera", LocalDateTime.now().plusMinutes(1));
        
        MessageManager meManager = new MessageManager();
        
        meManager.messages.add(message1);
        meManager.messages.add(message2);
        meManager.messages.add(message3);

        meManager.displayHistory();

        meManager.filterMessagesBySender(scanner);
    }
}
