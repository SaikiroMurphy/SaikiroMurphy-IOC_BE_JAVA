import java.util.Random;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên: ");
        int n = scanner.nextInt();

        String result = generateRandomString(n);
        System.out.println("Chuỗi ngẫu nhiên: " + result);
    }

    public static String generateRandomString(int n) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                          + "abcdefghijklmnopqrstuvwxyz"
                          + "0123456789";

        Random random = new Random();
        StringBuilder sb = new StringBuilder(n);

        for (int i = 0; i < n; i++) {
            int index = random.nextInt(characters.length());
            sb.append(characters.charAt(index));
        }

        return sb.toString();
    }
}
