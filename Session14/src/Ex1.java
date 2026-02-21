
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;

        while (true) { 
            try {
                System.out.print("Nhập một số nguyên dương: ");
                number = Integer.parseInt(scanner.nextLine());

                if (number <= 0) {
                    System.out.println("Số nhập vào không phải số nguyên dương. Vui lòng nhập lại.");
                } else {
                    if (isPrime(number)) {
                        System.out.println(number + " là số nguyên tố.");
                        break;
                    } else {
                        System.out.println(number + " không là số nguyên tố.");
                        break;
                    }
                }
            
            } catch (NumberFormatException e) {
                System.out.println("Thông tin nhập vào không hợp lệ. Vui lòng nhập lại.");
                System.out.println(e);
            }
            
        }
    }

    public static boolean isPrime (int number) {
        switch (number) {
            case 2 -> {
                return true;
            }
            case 1 -> {
                return false;
            }
            default -> {
                for (int i = 2; i <= Math.sqrt(number); i++) {
                    if (number % i == 0) {
                        return false;
                    }
                }
                return true;
            }
        }

    }
}
