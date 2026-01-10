import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) throws Exception {
        // Khai báo biến
        Scanner scanner = new Scanner(System.in);
        int input;
        int sum = 0;

        // Nhập thông tin
        System.out.print("Nhập một số nguyên dương: ");
        input = Integer.parseInt(scanner.nextLine());

        // Lỗi nếu không nhập số nguyên dương
        while(input <= 0){
            System.out.print("Số nhập vào không hợp lệ. Vui lòng nhập lại: ");
            input = Integer.parseInt(scanner.nextLine());
        }

        // Tính kết quả
        for(int i = 1; i <= input; i++){
            sum += i;
        }

        // Hiển thị kết quả
        System.out.printf("Tổng các số từ 1 đến %d là: %d", input, sum);
    }
}
