import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int[][] arr;
        int rows, cols;
        int odds = 0, evens = 0;

        // Nhập thông tin
        System.out.print("Nhập số hàng của mảng: ");
        rows = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập số cột của mảng: ");
        cols = Integer.parseInt(scanner.nextLine());
        arr = new int[rows][cols];
        
        System.out.println("Nhập các phần tử của mảng: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("Phần tử [%d][%d]: ", i, j);
                arr[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }

        // Xử lý thông tin
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (arr[i][j] % 2 == 0) {
                    evens += arr[i][j];
                } else {
                    odds += arr[i][j];
                }
            }
        }

        // Hiển thị kết quả
        System.out.println("Tổng các số chẵn: " + evens);
        System.out.println("Tổng các số lẻ: " + odds);
    }
}
