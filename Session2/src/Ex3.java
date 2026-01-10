import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) throws Exception {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int input, term;
        int sum = 0;

        // Nhập thông tin
        System.out.print("Nhập số nguyên: ");
        input = Math.abs(Integer.parseInt(scanner.nextLine()));

        // Tính kết quả
        while (input != 0) {
            term = input % 10;
            sum += term;
            input /= 10;
        }

        // Hiển thị kết quả
        System.out.printf("Tổng các chữ số là: %d", sum);
    }
}
