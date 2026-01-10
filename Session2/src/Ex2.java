import java.util.Scanner;

public class Ex2 {

    public static void main(String[] args) throws Exception {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int input;

        // Nhập thông tin
        System.out.print("Nhập một tháng trong năm: ");
        input = Integer.parseInt(scanner.nextLine());

        // Hiển thị kết quả
        switch (input) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.printf("Tháng %d có 31 ngày", input);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.printf("Tháng %d có 30 ngày", input);
                break;
            case 2:
                System.out.printf("Tháng %d có 28 hoặc 29 ngày", input);
                break;
            default:
                System.out.print("Tháng nhập vào không hợp lệ.");
                break;
        }
    }
}
