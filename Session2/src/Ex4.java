import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        // Nhập thông tin
        System.out.print("Nhập cạnh thứ nhất: ");
        a = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ hai: ");
        b = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập cạnh thứ ba: ");
        c = Integer.parseInt(scanner.nextLine());

        // Tính kết quả
        if (a + b > c && a + c > b && c + b > a) {
            if (a == b && b == c) {
                System.out.println("Đây là tam giác đều.");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân.");
            } else if ((a*a + b*b == c*c) || (a * a + c * c == b * b ) || (c * c + b * b == a * a )) {
                System.out.println("Đây là tam giác vuông.");
            } else {
                System.out.println("Đây là tam giác thường.");
            }
        } else {
            System.out.println("Ba cạnh không tạo thành tam giác.");
        }
    }
}
