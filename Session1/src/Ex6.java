import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        float velocity, time, distance;

        // Nhập thông tin
        System.out.print("Nhập vận tốc(km/h): ");
        velocity = Float.parseFloat(scanner.nextLine());
        System.out.print("Nhập thời gian(h): ");
        time = Float.parseFloat(scanner.nextLine());
        
        // Tính kết quả
        distance = velocity * time;

        // Hiển thị kết quả
        System.out.printf("Quảng đường: %.2f", distance);
    }
}
