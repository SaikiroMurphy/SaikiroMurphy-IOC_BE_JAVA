import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        int sum, difference;
        int product, quotient, remainder;

        // Nhập thông tin
        System.out.print("Nhập số thứ nhất (firstNumber): ");
        firstNumber = Integer.parseInt((scanner.nextLine()));
        System.out.print("Nhập số thứ hai (secondNumber): ");
        secondNumber = Integer.parseInt((scanner.nextLine()));

        // Tính kết quả
        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
        product = firstNumber * secondNumber;
        quotient = firstNumber / secondNumber;
        remainder = firstNumber % secondNumber;

        // Hiển thị kết quả
        System.out.println("----- Kết quả -----");
        System.out.printf("firstNumber = %d\n", firstNumber);
        System.out.printf("secondNumber = %d\n", secondNumber);
        System.out.printf("Tổng = %d\n", sum);
        System.out.printf("Hiệu = %d\n", difference);
        System.out.printf("Tích = %d\n", product);
        System.out.printf("Thương = %d\n", quotient);
        System.out.printf("Phần dư = %d\n", remainder);
    }
}
