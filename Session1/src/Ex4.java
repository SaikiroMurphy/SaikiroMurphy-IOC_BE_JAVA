import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        float width, height, area, perimeter;
        
        // Nhập thông tin
        System.out.print("Nhập chiều dài: ");
        height = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập chiều rộng: ");
        width = Float.parseFloat(scanner.nextLine());

        // Tính kết quả
        perimeter = (width + height) * 2;
        area = width * height;

        // Hiển thị kết quả
        System.out.printf("Diện tích: %.2f\n", area);
        System.out.printf("Chu vi: %.2f\n", perimeter);
    }
}
