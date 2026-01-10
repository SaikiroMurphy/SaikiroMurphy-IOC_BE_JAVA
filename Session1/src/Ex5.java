import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        float height, weight, bmi;

        // Nhập thông tin
        System.out.print("Nhập chiều cao(kg): ");
        height = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập cân nặng(m): ");
        weight = Float.parseFloat(scanner.nextLine());

        // Tính kết quả
        bmi = weight / (float)(Math.pow(height, 2));

        // Hiển thị kết quả
        System.out.printf("Chỉ số BMI = %.2f", bmi);        
    }
}
