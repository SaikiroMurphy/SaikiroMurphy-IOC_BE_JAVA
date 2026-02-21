
import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 1000000; // Số dư ban đầu

        System.out.printf("Số dư ban đầu: \t%,d VND\n", balance);
        System.out.printf("Quy định: \tSố dư sau khi rút không được nhỏ hơn 50,000 VND.\n");

        while (true) {
            System.out.print("Nhập số tiền muốn rút (hoặc 'exit' để dừng): ");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            try {
                int amount = Integer.parseInt(input);
                if (amount <= 0) {
                    System.out.println("Lỗi: Vui lòng nhập lại một số dương.");
                } else if (amount > balance) {
                    System.out.println("Lỗi: Số tiền rút vượt quá số dư hiện có.");
                } else if ((balance - amount) < 50000) {
                    System.out.println("Lỗi: Số dư sau khi rút phải còn ít nhất 50,000 VND.");
                } else {
                    balance -= amount;
                    System.out.println("Rút thành công: " + String.format("%,d", amount) + " VND");
                    System.out.println("Số dư còn lại: " + String.format("%,d", balance) + " VND");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi: Vui lòng nhập một số hợp lệ.");
            }
        }
    }
}
