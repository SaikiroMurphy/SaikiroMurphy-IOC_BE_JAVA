import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        double radius, area;

        // Nhập thông tin
        System.out.print("Nhập bán kính: ");
        radius = Double.parseDouble(scanner.nextLine());

        // Tính kết quả
        area = Math.PI*radius*radius;    
        
        // Hiển thị kết quả
        System.out.printf("Diện tích của hình tròn có bán kính r = %.2f là: A = %.2f\n", radius, area);
    }
}
