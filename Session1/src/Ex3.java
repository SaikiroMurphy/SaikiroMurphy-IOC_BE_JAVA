import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int a, b, c, d;
        int numerator, denominator;
        int gcd = 1;

        // Nhập thông tin
        System.out.print("Nhập tử số thứ nhất (a): ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mẫu số thứ nhất (b): ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tử số thứ hai (c): ");
        c = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập mẫu số thứ hai (d): ");
        d = Integer.parseInt(scanner.nextLine());

        // Tính kết quả phân số
        numerator = a * d + b * c;
        denominator = b * d;

        // Tìm Ước chung lớn nhất (GCD)
        for (int i = 1; i <= numerator && i <= denominator; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcd = i;
            }
        }

        // Giản ước
        numerator /= gcd;
        denominator /= gcd;

        // Hiển thị kết quả
        System.out.printf("Tổng của hai phân số %d/%d và %d/%d là: %d/%d\n", a, b, c, d, numerator, denominator);
    }
}
